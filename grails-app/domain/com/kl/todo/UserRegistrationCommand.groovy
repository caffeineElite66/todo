package com.kl.todo

class UserRegistrationCommand {

    def springSecurityService

    String username
    String password
    String passwordConfirm
    String email
    String firstName
    String lastName

    static constraints = {
        passwordConfirm(nullable: false,
            validator: { password2, urc ->
                return password2 == urc.password
            }
        )
    }
}
