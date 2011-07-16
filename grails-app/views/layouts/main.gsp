<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
       <!-- <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />-->
        <link rel="stylesheet" href="${resource(dir:'css',file:'layout.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
        <style>
          
      
    </head>
    <body>
      <div id="wrapper">
      <div id="header">
        <h1>To-do List here~</h1>
	</div>

        <div id="menu">
            <ul>
              <li><a href="#">Link One</a></li>
              <li><a href="#">Link Two</a></li>
              <li><a href="#">Link Three</a></li>
              <li><a href="#">Link Four</a></li>
              <li><a href="#">Link Five</a></li>
              <li><a href="#">Link One</a></li>
              <li><a href="#">Link Two</a></li>
              <li><a href="#">Link Three</a></li>
              <li><a href="#">Link Four</a></li>
               
               
            </ul>
	</div>
        <div id="content">
        <g:layoutBody />
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
   <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p> </div>
     
     <div id="footer">
       <span class="copyright">
         Copyright © Michelle Wu 2011
       </span>
		<div id="footer-valid">
                  <a href="#">About</a> :: <a href="#">Services</a> :: <a href="#">Contact Us</a> :: <a href="#">Portfolio</a>
		</div>
	</div> 
      </div>
       </body>
</html>