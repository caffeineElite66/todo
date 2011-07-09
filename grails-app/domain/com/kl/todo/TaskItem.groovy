package com.kl.todo

class TaskItem {
	String title
	String description
	Date createdAt
	
	static belongsTo = [taskList : TaskList]
    static constraints = {
    }
}
