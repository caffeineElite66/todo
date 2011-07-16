<%--
  Created by IntelliJ IDEA.
  User: kliu
  Date: 7/9/11
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<meta name="layout" content="main"/>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Join Our Site</title></head>
  <body>
    <g:hasErrors>
        <div class="error-message">
            <g:renderErrors bean="${user}" as="list" />
        </div>
    </g:hasErrors>
    <form action="join/create" method="post" name="new-form">
        First Name: <input name="firstName" type="text"/><br/>
        Last Name: <input name="lastName" type="text"/><br/>
        Email: <input name="email" type="text"/><br/>
        Username: <input name="username" type="text"/> <br/>
        Password: <input name="password" type="password" /><br/>
        Confirm: <input name="passwordConfirm" type="password" /><br/>
        <input type="submit" value="Join"/>
    </form>

  </body>
</html>