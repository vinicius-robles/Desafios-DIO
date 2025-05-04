package one.digitalinnovation.gof.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    private String title;

    @NotBlank(message = "O autor é obrigatório")
    private String authors;  // Pode ser @ElementCollection para List<String>

    private String publisher;
    private Integer pageCount;
    private String isbn;
}
