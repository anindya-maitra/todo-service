package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "todo_list")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer todoId;
	
	@Column(name = "todo_name")
	private TodoNameType todoName;
	
	@JsonProperty
	@Column(name = "is_completed")
	private boolean isCompleted;
	
	@Column(name = "completion_date")
	private String completionDate;

	public Todo(TodoNameType todoName, boolean isCompleted, String completionDate) {
		super();
		this.todoName = todoName;
		this.isCompleted = isCompleted;
		this.completionDate = completionDate;
	}
	
	
}
