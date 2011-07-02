import com.kl.todo.*

class BootStrap {

    def springSecurityService
    
    def init = { servletContext ->
        
        // create an admin user for testing
        def adminUser = User.findByUsername('admin') ?: new User(
            username: 'admin',
            password: springSecurityService.encodePassword('admin'),
            enabled: true).save(failOnError: true)
       
    }
    
    def destroy = {
    }
}
