package mk.finki.ukim.eshop.controller;

import mk.finki.ukim.eshop.model.Author;
import mk.finki.ukim.eshop.service.InterfaceAuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final InterfaceAuthorService authorService;

    public AuthorController(InterfaceAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/list-authors")
    public List<Author> listAuthors() {
        return this.authorService.getAllAuthors();
    }
}
