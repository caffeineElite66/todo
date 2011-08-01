package com.kl.todo

import grails.plugins.springsecurity.Secured

class HomeController {
    def springSecurityService

    @Secured(['IS_AUTHENTICATED_REMEMBERED'])
    def index = { 
        def user = User.get(springSecurityService.principal.id)
        //def lists = TaskList.findAllByUser(user)
        def lists = user.taskLists
        [username : user.username, lists : lists]
    }
}
