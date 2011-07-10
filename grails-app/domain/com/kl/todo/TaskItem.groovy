package com.kl.todo

class TaskItem {
	String title
	String description
	Date createdAt = new Date()
	
	static belongsTo = [taskList : TaskList]
    static constraints = {
    }
}
