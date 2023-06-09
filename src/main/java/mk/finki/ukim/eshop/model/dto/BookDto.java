package mk.finki.ukim.eshop.model.dto;

import lombok.Data;
import mk.finki.ukim.eshop.model.Author;
import mk.finki.ukim.eshop.model.enums.Category;

@Data
public class BookDto {
    private String name;

    private Category category;

    private Long author;

    private Integer availableCopies;

    public BookDto(String name, Category category, Long author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
