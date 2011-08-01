package com.kl.todo

import grails.plugins.springsecurity.Secured


class SupportController {

    def index = { }

    def forgetPassword = {
        if (params.email) {
            def email = params.email
            User user = User.findByEmail(email)
            if (user){
                if (sendPassword(email))
                    flash.message = "Password is sent to ${email}."
                else
                    flash.message = "Error emailing password."
            }
            else {
                flash.message = "Your email is not found."
            }
        }
        render "forgetPassword"
    }


    private Boolean sendPassword(String email) {
        // if email is in the database
        // we'll send out the password to the user.
        return true
    }
}
