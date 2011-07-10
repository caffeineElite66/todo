import com.kl.todo.*

class BootStrap {
	def springSecurityService
	
    def init = { servletContext ->
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
	    def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)

        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: springSecurityService.encodePassword('admin'),
                enabled: true).save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            UserRole.create adminUser, adminRole
        }
		
		def item1 = new TaskItem()
		item1.title = "Test Item"
		item1.description = "Test item description"
		item1.createdAt = new Date()
        def item2 = new TaskItem()
        item2.title = "Test Item 2"
        item2.description = "Test item 2 description"
        item2.createdAt = new Date()
		def list = new TaskList()
		list.title = "Test List"
		list.description = "Test list description"
		list.taskItems = [item1, item2]
		adminUser.taskLists = [list]
    }
    def destroy = {
    }
}
