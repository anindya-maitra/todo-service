package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/todo-list")
public class TodoController {
	
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getAllTodos() {
		return todoService.findAll();
	}
	
	@PostMapping("/save")
	public void insertTodo(@RequestBody Todo todo) {
		todoService.save(todo);
	}
	
	@PutMapping("/update")
	public void updateTodo(@RequestBody Todo todo) throws Exception {
		Todo tempTodo = todoService.findById(todo.getTodoId());
		if(tempTodo == null)
			throw new Exception("Todo not found");
		else {
			todoService.save(todo);
		}
	}
	
	@DeleteMapping("/delete")
	public void deleteTodo(@RequestParam("todo-id") Integer id) {
		todoService.deleteById(id);
	}
}
