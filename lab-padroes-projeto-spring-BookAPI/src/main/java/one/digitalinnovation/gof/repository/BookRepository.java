package one.digitalinnovation.gof.repository;


import one.digitalinnovation.gof.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title); // Para busca personalizada
}
