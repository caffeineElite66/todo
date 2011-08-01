package com.kl.todo

import grails.test.*

class UserTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testConstrains() {
        def oldUser = new User(email: "test@test.com", username: "kevin")
        mockForConstraintsTests(User, [oldUser])

        def user = new User()
        assertFalse(user.validate())
        assertEquals("nullable", user.errors["username"])
        assertEquals("nullable", user.errors["password"])

        user = new User(username: "kevin")
        assertFalse(user.validate())
        assertEquals("unique", user.errors["username"])
       // assertEquals("blank", user.errors["password"])

        user = new User(username: "kevin", password: "hunter1")
        assertTrue(user.validate())
    }
}
