package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.service.TodosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("todos")
public class TodosController {

    @Resource
    TodosService todosService;

    @GetMapping(value = "/{id}")
    public String getTodoById(Model model, @PathVariable Long id) {
        Todo todo = todosService.getTodo(id);
        model.addAttribute("example_todo", todo);
        return "todos";
    }
}
