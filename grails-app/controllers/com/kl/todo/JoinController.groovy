package com.kl.todo

class JoinController {

    def springSecurityService

    def index = {

    }

    def create = { UserRegistrationCommand urc ->
        if (urc.hasErrors()) {
            redirect(uri: "/join")
        } else {
            def user = new User(urc.properties)
            user.password = springSecurityService.encodePassword(user.password)
            user.enabled = true
            if (user.save()) {
                flash.message = "User Created Successfully."
                redirect(uri: "/home")
            } else {
                flash.message = "User Created Unsuccessfully."
                redirect(uri: "/join")
            }
        }
    }
}
