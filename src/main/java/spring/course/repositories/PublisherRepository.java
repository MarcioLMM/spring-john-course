package spring.course.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.course.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
