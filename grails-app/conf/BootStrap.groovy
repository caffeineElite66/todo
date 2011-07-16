import com.kl.todo.Role
import com.kl.todo.User
import com.kl.todo.UserRole
import com.kl.todo.TaskItem
import com.kl.todo.TaskList


class BootStrap {
	def springSecurityService
	
    def init = { servletContext ->
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
	    def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)

        def adminUser = User.findByUsername('admin') ?: new User(
                email: 'kevin@gmail.com',
                firstName: 'Kevin',
                lastName: 'Liu',
                username: 'admin',
                password: springSecurityService.encodePassword('admin'),
                enabled: true).save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            UserRole.create adminUser, adminRole
        }
		
		def item1 = new TaskItem()
		item1.title = "Show Michelle your badminton metals."
		item1.description = "Find all your badminton metals and wear them around your neck for few hours."
		item1.createdAt = new Date()
        def item2 = new TaskItem()
        item2.title = "Clean house"
        item2.description = "Clean the kitchen floor and wash the dishes."
        item2.createdAt = new Date()
        def item3 = new TaskItem()
        item3.title = "Study for ticketfly"
        item3.description = "Should study for ticketfly. Work on MySQL and Data Integration."
        item3.createdAt = new Date()

        def list = new TaskList()
		list.title = "Personal Todo"
		list.description = "for personal life"
		list.taskItems = [item1, item2]
        def list2 = new TaskList()
        list2.title = "Study Todo"
        list2.description = "for perfessional life"
        list2.taskItems = [item3]
		adminUser.taskLists = [list, list2]

    }
    
    def destroy = {
    }
}
