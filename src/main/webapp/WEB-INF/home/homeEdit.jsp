<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
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

			<!-- Features -->
				<section id="features">
					<div class="container">
						<div class="row">
							<div class="col-12">
								<section>
									<form method="post" action="save.do" name = "save" enctype = "multipart/form-data">
										<div class="col-6 col-12-small">
											<div class="row gtr-50">
												<input id = "POST_TYPE" name="POST_TYPE" value = "${data.POST_TYPE}" type="text" style = "display:none"/>
												<input id = "POST_IMG" name="POST_IMG"  value = "${data.POST_IMG}" type="text" style = "display:none"/>
												<input id = "POST_ORIGIN_IMG" name="POST_ORIGIN_IMG" value = "${data.POST_IMG}"  type="text" style = "display:none"/>
												<input id = "POST_NO" name="POST_NO" type="number" value = "${data.POST_NO}" style = "display:none" />
												<c:if test="${sessionID == 'admin'}">
													<div class="col-6" style = "text-align:left;">
														<p style = "text-align:left;">POST NO : ${data.POST_NO}</p>
													</div>
													<div class="col-6" style = "text-align:right;">
														<input type= "button" value = "SAVE" onclick = "main_save()" class="form-button-submit button icon solid fa-envelope">
													</div>
												</c:if>
												
												
												<div class="col-12 col-12-small" style = "text-align:left;">
														<h6>font</h6>
														<select name = "STYLE_FONT1" id = "STYLE_FONT1" >
															<c:forEach var = "v" items = "${font}">
																<c:if test="${v.CODE_NAME == data.STYLE_FONT1}">
																	<option value = "${v.CODE_NAME}" style = "font-family:${v.CODE_NAME};" selected>${v.CODE_EXPL}</option>
																</c:if>
																
																<c:if test="${v.CODE_NAME != data.STYLE_FONT1}">
																	<option value = "${v.CODE_NAME}" style = "font-family:${v.CODE_NAME};">${v.CODE_EXPL}</option>
																</c:if>
															</c:forEach>
														</select>
														<h6>size</h6>
														<input type = "number" id = "STYLE_SIZE1" name = "STYLE_SIZE1" value = "${data.STYLE_SIZE1}" style = "width:40px; height:20px; font-size: 15px; "/>
														<h6>space</h6>
														<input type = "number" id = "STYLE_SPACE1" name = "STYLE_SPACE1" value = "${data.STYLE_SPACE1}" style = "width:40px; height:20px; font-size: 15px; "/>
														<h6>weight</h6>
														<select name = "STYLE_WEIGHT1" id = "STYLE_WEIGHT1" >
															<c:forEach var = "v" items = "${bold}">
																<c:if test="${v.CODE_NAME == data.STYLE_WEIGHT1}">
																	<option value = "${v.CODE_NAME}" style = "font-weight:${v.CODE_NAME};" selected>${v.CODE_EXPL}</option>
																</c:if>
																
																<c:if test="${v.CODE_NAME != data.STYLE_WEIGHT1}">
																	<option value = "${v.CODE_NAME}" style = "font-weight:${v.CODE_NAME};">${v.CODE_EXPL}</option>
																</c:if>
															</c:forEach>
														</select>
												</div>
												
												
												
												<div class="col-12 col-12-small">
													<input id ="POST_TITLE" name="POST_TITLE" value = "${data.POST_TITLE}" placeholder="Title" type="text" />
												</div>
												
												
												

												<div class="col-12">
													<img class="image featured thumb" src = "<tf:uploadImg/>${data.POST_IMG}" onerror = "this.src='<tf:uploadImg/>default.png'" />
												</div>
												<div class="col-12">
													<input type="file" class="hidden_input" id="imageSelector" name=POST_IMG_FILE accept="image/jpeg, image/jpg, image/png" required style="height: 30px;width: 400px;margin: 12px;color: #FFFFFF;"> 
												</div>
											</div>
										</div>
									</form>
								</section>
							</div>
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
			<script src="js/upload.js"></script>
			<script src="js/common.js"></script>

	</body>
</html>