package com.kl.todo

class TaskList {
	String title
	String description
	Date createdAt = new Date()
	List taskItems = new ArrayList()
	
	static belongsTo = [user : User]
	static hasMany = [taskItems : TaskItem]
    static constraints = {
    }
}
