package spring.course.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.course.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
