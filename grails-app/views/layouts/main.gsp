<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
       <!-- <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />-->
        <link rel="stylesheet" href="${resource(dir:'css',file:'layout.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
         
      
    </head>
    <body>
      <div id="wrapper">
      <div id="header">
        <h1>To-do List here~</h1>
	</div>

        <div id="menu">
            
                <ul>
                    
                        <li><a href="/todo/home/index">Home</a></li>  
            
                        <li><a href="/todo/account/index">Account</a></li>
                    
                        <li><a href="/todo/support/index">Support</a></li>
                        
                </ul>
            </div>
       
        <div id="content">
        <g:layoutBody />
         </div>
     
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