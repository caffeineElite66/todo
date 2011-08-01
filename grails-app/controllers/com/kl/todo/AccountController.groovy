package com.kl.todo

import grails.plugins.springsecurity.Secured

@Secured(['IS_AUTHENTICATED_REMEMBERED'])
class AccountController {

    def index = { }
}
