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
									<form method="post" action="compSave.do" name = "compSave" >
										<div class="col-6 col-12-small">
											<div class="row gtr-50">
											<c:forEach var = "v" items = "${datas}">
												<div class="col-8 col-12-small">
													<h4 style = "text-align: left;">${v.CODE_EXPL}</h4>
													<input type = "text" id ="${v.CODE_NAME}" name="${v.CODE_NAME}" value = "${v.CODE_VALUE}" placeholder="${v.CODE_EXPL}" />
												</div>
												
												<div class="col-2 col-12-small" style = "writing-mode: vertical-lr">
												<c:if test="${v.USE_FLAG == 'Y'}">
													<input type = "checkbox" id = "${v.CODE_NAME}_FLAG" name = "${v.CODE_NAME}_FLAG" value = "${v.USE_FLAG}" onchange = "main_check(this);" checked/>
												</c:if>
												<c:if test="${v.USE_FLAG != 'Y'}">
													<input type = "checkbox" id = "${v.CODE_NAME}_FLAG" name = "${v.CODE_NAME}_FLAG" value = "${v.USE_FLAG}" onchange = "main_check(this);"/>
												</c:if>
													<input type = "number" id = "${v.CODE_NAME}_NO" name = "${v.CODE_NAME}_NO" value = "${v.CODE_NO}" style ="display:none;">
												</div>
											</c:forEach>
												
												
												<c:if test="${sessionID == 'admin'}">
												<div class="col-12">
													<input type= "button" value = "SAVE" onclick = "comp_save()" class="form-button-submit button icon solid fa-envelope">
												</div>
												</c:if>
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