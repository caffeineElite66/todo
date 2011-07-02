package com.kl.todo

import grails.plugins.springsecurity.Secured

class HomeController {

    @Secured(['IS_AUTHENTICATED_REMEMBERED'])
    def index = { 
    
    }
}
