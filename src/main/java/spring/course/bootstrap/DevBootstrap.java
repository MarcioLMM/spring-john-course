package spring.course.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import spring.course.model.Author;
import spring.course.model.Book;
import spring.course.model.Publisher;
import spring.course.repositories.AuthorRepository;
import spring.course.repositories.BookRepository;
import spring.course.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {

        // Marcio
        Publisher p1 = new Publisher("Harpen Collins", "New York");
        Author a1 = new Author("Marcio", "Macedo");
        Book b1 = new Book("DDD", "1234", p1);
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        publisherRepository.save(p1);
        authorRepository.save(a1);
        bookRepository.save(b1);

        // Marco
        Publisher p2 = new Publisher("Worx", "Dallas");
        Author a2 = new Author("Marco", "Alessandro");
        Book b2 = new Book("J2EE Development without EJB", "23444", p2);
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        publisherRepository.save(p2);
        authorRepository.save(a2);
        bookRepository.save(b2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
