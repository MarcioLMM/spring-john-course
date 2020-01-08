package spring.course.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.course.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
