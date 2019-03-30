package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.repository.TodosRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TodosServiceImpl implements TodosService {

    @Resource
    TodosRepository todosRepository;

    @Override
    public Todo getTodo(Long id) {
        return todosRepository.getOne(id);
    }
}
