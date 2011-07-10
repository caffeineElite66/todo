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
    <form action="join/new" method="post" name="new-form">
        First Name: <input name="first-name" type="text"/><br/>
        Last Name: <input name="last-name" type="text"/><br/>
        Email: <input name="email" type="text"/><br/>
        Username: <input name="username" type="text"/> <br/>
        Password: <input name="password" type="password" /><br/>
        Confirm: <input name="password-confirm" type="password" /><br/>
        <input type="submit" value="Join"/>
    </form>

  </body>
</html>