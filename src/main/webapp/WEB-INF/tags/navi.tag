<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Nav -->
<section id="header">
	<div class="container">
		<nav id="nav">
			<ul>
				<li><a href="home.do"><img src="images/logo.png" alt="logo" style = "width: 200px; margin-right:150px" /></a></li>
				<li><a id = "HO" class="icon solid" href="home.do" <c:if test = "${page == 'HO'}"> style= "color:#ED786A;" </c:if>><span style = "vertical-align: middle">HOME</span></a></li>
				<li><a id = "AB" class="icon solid" href="about.do" <c:if test = "${page == 'AB'}"> style= "color:#ED786A;" </c:if>><span>ABOUT</span></a></li>
				<li><a id = "TE" class="icon solid" href="tech.do" <c:if test = "${page == 'TE'}"> style= "color:#ED786A;" </c:if>><span>TECHNOLOGY</span></a></li>
				<li><a id = "PR" class="icon solid" href="product.do" <c:if test = "${page == 'PR'}"> style= "color:#ED786A;" </c:if>><span>PRODUCT</span></a></li>
				<li><a id = "NE" class="icon solid" href="news.do" <c:if test = "${page == 'NE'}"> style= "color:#ED786A;" </c:if>><span style = "margin-right:30px">NEWS</span></a></li>
				<c:if test="${sessionID == 'admin'}">
				<li><a id = "MA" class="icon solid" href="mailEdit.do" ><span id = "MAIL_EDIT">MAIL</span></a></li>
				<li><a id = "LO" class="icon solid" href="logout.do" ><span id = "LOG_OUT">LOG OUT</span></a></li>
				</c:if>
			</ul>
		</nav>
	</div>
</section>