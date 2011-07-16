<<<<<<< HEAD
<meta name="layout" content="main"/>
<h1>Dashboard</h1>

<p>Hello ${username}</p>

<g:each in="${lists}" var="list">
    <div class="user-list">
        <h3>${list.title}</h3>
        <p>${list.description}</p>
        <ul>
            <g:each in="${list.taskItems}" var="item">
                <li>
                    <h4>${item.title}</h4>
                    <p>${item.description}</p>
                </li>
            </g:each>
        </ul>
    </div>
</g:each>
=======
<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sample title</title>
  </head>
  <body>
    <h1>Sample line</h1>
  </body>
</html>
>>>>>>> layout
