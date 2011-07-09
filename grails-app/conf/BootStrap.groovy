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
		
		def item = new TaskItem()
		item.title = "Test Item"
		item.description = "Test item description"
		item.createdAt = new Date()
		def list = new TaskList()
		list.title = "Test List"
		list.description = "Test list description"
		list.taskItems = [item]
		list.user = adminUser
    }
    def destroy = {
    }
}
