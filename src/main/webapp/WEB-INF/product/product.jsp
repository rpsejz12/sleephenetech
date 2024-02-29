<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

				<section id="main">
					<div class="container">
						<c:forEach var = "v" items = "${mails}">
							<textarea id ="${v.CODE_NAME}" name="${v.CODE_NAME}" style = "display:none;">${v.CODE_VALUE}</textarea>
						</c:forEach>
						<c:forEach var = "v" items = "${datas}">
						<div class="row">
							<c:if test="${sessionID == 'admin'}">
								<div class="col-6" style = "text-align:left;">
									<h4>POST NO : ${v.POST_NO}</h4>
								</div>
								<div class="col-6" style = "text-align:right;">
									<input type= "button" value = "EDIT" onclick = "main_update(${v.POST_NO})" class="form-button-submit button icon solid fa-envelope">
									<input type= "button" value = "DELETE" onclick = "main_delete(${v.POST_NO})" class="form-button-submit button icon solid fa-envelope">
								</div>
							</c:if>

							<!-- Sidebar -->
								<div id="sidebar" class="col-6 col-12-medium">

									<!-- Excerpts -->
										<section>
													<img class="image featured" src="<tf:uploadImg/>${v.POST_IMG}" alt="post_img" onclick ="window.open(this.src)"/>		
										</section>
								</div>
							<!-- Content -->
								<div id="content" class="col-6 col-12-medium">

									<!-- Post -->
										<article class="box post">
											<p style = "font-family:${v.STYLE_FONT1}; font-size:${v.STYLE_SIZE1}px; font-weight:${v.STYLE_WEIGHT1}; letter-spacing:${v.STYLE_SPACE1}px">${v.POST_TITLE}</p>
											<p style = "font-family:${v.STYLE_FONT2}; font-size:${v.STYLE_SIZE2}px; font-weight:${v.STYLE_WEIGHT2}; letter-spacing:${v.STYLE_SPACE2}px">${v.POST_TXT}</p>
										</article>
								</div>
						</div>
							</c:forEach>
							<c:if test="${sessionID == 'admin'}">
								<br>
								<input type= "button" value = "ADD" onclick = "main_insert('${page}')" class="form-button-submit button icon solid fa-envelope">
							</c:if>
						
						<div class="row" style = "justify-content: right; ">
							<button class="custom-btn btn-1" style = "margin:5px;" onclick = "location.href='Http://withsingstore.com'">Buy Now</button>
							<button class="custom-btn btn-2" style = "margin:5px;" onclick = "main_mail()">Contect</button>
						</div>
							
					</div>
					
					
				</section>


					<!-- Footer -->
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