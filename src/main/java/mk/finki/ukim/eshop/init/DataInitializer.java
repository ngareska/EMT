package mk.finki.ukim.eshop.init;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.eshop.model.Author;
import mk.finki.ukim.eshop.model.Book;
import mk.finki.ukim.eshop.model.Country;
import mk.finki.ukim.eshop.model.enums.Category;
import mk.finki.ukim.eshop.repository.AuthorRepository;
import mk.finki.ukim.eshop.repository.BookRepository;
import mk.finki.ukim.eshop.repository.CountryRepository;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    public DataInitializer(BookRepository bookRepository, AuthorRepository authorRepository, CountryRepository countryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
    }

    @PostConstruct
    public void init ()
    {
        Country country = new Country("France", "Europe");
        countryRepository.save(country);
        Author author = new Author("Victor", "Hugo", country);
        authorRepository.save(author);
        bookRepository.save(new Book(12, Category.HISTORY, "Les Misérables", author));
        bookRepository.save(new Book(200, Category.NOVEL, "The Man Who Laughs", author));

    }
}
