<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<!--
	Strongly Typed by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Sleephenetech</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="css/main.css" />
		<link rel="icon" type="image/x-icon" href="/images/favicon.ico">
	</head>
	<body class="homepage is-preload">
	
		<div id="page-wrapper">

			<!-- Header -->
				<tf:navi/>

			<section id="features">
					<div class="container">
						<div class="row">
							<div class="col-12">
								<section>
									<form method="post" action="login.do" name = "login">
										<div class="col-6 col-12-small">
											<div class="row aln-center">
												<div class="col-7 col-12-small">
													<input id ="USER_ID" name="USER_ID" value = "admin" type="text" />
												</div>
												<div class="col-7 col-12-small">
													<input id = "USER_PW" name="USER_PW" value = "" placeholder="Password" type="password"/>
												</div>

											
												<div class="col-7">
													<input type= "button" value = "LOGIN" onclick = "main_login()" class="form-button-submit button icon solid fa-envelope">
												</div>
											</div>
										</div>
									</form>
								</section>
							</div>
						</div>
					</div>
				</section>



			<tf:footer/>

		</div>

		<!-- Scripts -->
			<script src="js/jquery.min.js"></script>
			<script src="js/jquery.dropotron.min.js"></script>
			<script src="js/browser.min.js"></script>
			<script src="js/breakpoints.min.js"></script>
			<script src="js/util.js"></script>
			<script src="js/main.js"></script>
			<script src="js/common.js"></script>

	</body>
</html>