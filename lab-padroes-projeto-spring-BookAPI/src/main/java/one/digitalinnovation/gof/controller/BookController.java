package one.digitalinnovation.gof.controller;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import one.digitalinnovation.gof.model.Book;
import one.digitalinnovation.gof.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
@Tag(name = "Book API", description = "API para gerenciamento de livros")
public class BookController {

    @Autowired
    private BookService bookService;

    // --- Rotas para integração com Google Books API ---
    @Operation(summary = "Buscar livro na Google Books API e salvar localmente")
    @GetMapping("/search")
    public Book searchBook(@RequestParam String title) {
        return bookService.searchAndSaveBook(title);
    }

    // --- Rotas para CRUD local (H2) ---
    @Operation(summary = "Listar todos os livros do banco local")
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @Operation(summary = "Adicionar livro manualmente ao banco local")
    @PostMapping
    public Book addBook(@Valid @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    // GET - Buscar livro por ID
    @Operation(summary = "Buscar livro por ID")
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = bookService.getBookById(id);
        return book.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT - Atualizar livro
    @Operation(summary = "Atualizar livro existente")
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        try {
            Book book = bookService.updateBook(id, updatedBook);
            return ResponseEntity.ok(book);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE - Remover livro
    @Operation(summary = "Deletar livro por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
