package ee.taltech.spring.bookit.repository;

import ee.taltech.spring.bookit.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<Todo, Long> {
}
