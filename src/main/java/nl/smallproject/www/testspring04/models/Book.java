package nl.smallproject.www.testspring04.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String isbn;
    private String title;
}
