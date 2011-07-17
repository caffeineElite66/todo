<head>
<meta name='layout' content='main' />
<title>Login</title> 
<link rel="stylesheet" href="${resource(dir:'css',file:'login.css')}" />
</head>

<body>
 
<body>
	<div id='login'>
		<div class='inner'>
			<g:if test='${flash.message}'>
			<div class='login_message'>${flash.message}</div>
			</g:if>
                  	<h2>Login <small>enter your credentials</small></h2>
			<small>Please Login..</small>
			<form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
				<p>
					<label for='username'>Login ID</label>
					<input type='text' class='text_' name='j_username' id='username' />
				</p>
				<p>
					<label for='password'>Password</label>
					<input type='password' class='text_' name='j_password' id='password' />
				</p>
				<p>
					<label for='remember_me'class="remember">Remember me</label>
					<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me'
					<g:if test='${hasCookie}'>checked='checked'</g:if> />
				</p>
				<p>
					<input type='submit' class="bg" value='Login' />
				</p>
                            
			</form>
                        <p class="center">Not a Member? <a href="/todo/join/index">Join Now!</a></p>
		</div>
	</div>
<!--
(function(){
	document.forms['loginForm'].elements['j_username'].focus();
})();
// -->
</script>
 
</body>
