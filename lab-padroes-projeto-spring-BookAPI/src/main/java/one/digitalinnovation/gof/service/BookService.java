package one.digitalinnovation.gof.service;



import one.digitalinnovation.gof.client.GoogleBooksClient;
import one.digitalinnovation.gof.model.Book;
import one.digitalinnovation.gof.model.GoogleBooksResponse;
import one.digitalinnovation.gof.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

        @Autowired
        private GoogleBooksClient googleBooksClient; // Cliente Feign
        @Autowired
        private BookRepository bookRepository;

        // Busca na Google Books API e salva no banco local
        public Book searchAndSaveBook(String title) {
            GoogleBooksResponse response = googleBooksClient.searchBooks(title, 1);

            if (response.getItems() == null || response.getItems().isEmpty()) {
                throw new RuntimeException("Livro não encontrado na Google Books API");
            }

            // Converte a resposta da API para a entidade Book
            var volumeInfo = response.getItems().get(0).getVolumeInfo();
            Book book = new Book();
            book.setTitle(volumeInfo.getTitle());
            book.setAuthors(String.join(", ", volumeInfo.getAuthors()));
            book.setPublisher(volumeInfo.getPublisher());
            book.setPageCount(volumeInfo.getPageCount());

            // Extrai ISBN (se existir)
            volumeInfo.getIndustryIdentifiers().stream()
                    .filter(id -> "ISBN_13".equals(id.getType()))
                    .findFirst()
                    .ifPresent(isbn -> book.setIsbn(isbn.getIdentifier()));

            return bookRepository.save(book); // Salva no H2
        }

    // CREATE (Salvar livro manualmente)
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // READ (Buscar todos os livros)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // READ (Buscar livro por ID)
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // UPDATE (Atualizar livro existente)
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthors(updatedBook.getAuthors());
                    book.setPublisher(updatedBook.getPublisher());
                    book.setPageCount(updatedBook.getPageCount());
                    book.setIsbn(updatedBook.getIsbn());
                    return bookRepository.save(book);
                })
                .orElseThrow(() -> new RuntimeException("Livro não encontrado com o ID: " + id));
    }

    // DELETE (Remover livro)
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // Busca personalizada (opcional)
    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }
  }
