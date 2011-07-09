package com.kl.todo

class TaskList {
	String title
	String description
	User user
	Date createdAt
	List taskItems = new ArrayList()
	
	static belongsTo = [user : User]
	static hasMany = [taskItems : TaskItem]
    static constraints = {
    }
}
