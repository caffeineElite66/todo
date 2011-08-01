package com.kl.todo

import grails.test.*

class JoinControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testCreate() {
        def controller  = new JoinController()
        controller.params.username = "test"
        controller.params.password = "test"
        controller.params.passwordConfirm = "test"
        controller.params.email = "test@test.com"
        controller.params.firstName = "kevin"
        controller.params.lastName = "lee"
        controller.create()
        //assertEquals("/home", controller.response.redirectedUrl)
    }
}
