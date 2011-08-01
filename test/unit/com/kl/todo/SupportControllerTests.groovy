package com.kl.todo

import grails.test.*

class SupportControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testForgetPassword() {
        def fc = new SupportController()
        fc.forgetPassword()
        assertEquals "forgetPassword", fc.response.contentAsString
    }

    void testSendPassword() {
        def controller = new SupportController()
        assertEquals true, controller.sendPassword("test@test.com")
    }
}
