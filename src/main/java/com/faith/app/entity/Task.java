package com.faith.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="task")
public class Task {

	@Id
	private String id;
	private String taskNote;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(String id, String taskNote) {
		super();
		this.id = id;
		this.taskNote = taskNote;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskNote() {
		return taskNote;
	}

	public void setTaskNote(String taskNote) {
		this.taskNote = taskNote;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskNote=" + taskNote + "]";
	}
	
	
	
	
}
