package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repo.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{

	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public Todo findById(Integer Id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(Id).get();
	}

	@Override
	public void save(Todo todo) {
		// TODO Auto-generated method stub
		todoRepository.save(todo);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
	}

}
