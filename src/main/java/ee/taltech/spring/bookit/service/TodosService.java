package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;

import java.util.List;

public interface TodosService {

    Todo getTodo(Long id);

    List<Todo> findAllTodos();
}
