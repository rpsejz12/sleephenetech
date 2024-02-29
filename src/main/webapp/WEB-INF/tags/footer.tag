<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section id="footer">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<section>
					<div class="row">
					<div class="col-6 col-12-small">
						<ul class="icons">
						<c:forEach var = "v" items = "${foot}" varStatus = "s">
							<c:if test = "${v.USE_FLAG == 'Y' && s.index%2 == 0}">
								<li class="col-6 ${v.CODE_REF}">
									${v.CODE_VALUE}
								</li>
							</c:if>
						</c:forEach>
						</ul>
					</div>
					<div class="col-6 col-12-small">
						<ul class="icons">
						<c:forEach var = "v" items = "${foot}" varStatus = "s">
							<c:if test = "${v.USE_FLAG == 'Y' && s.index%2 == 1}">
								<li class="col-6 ${v.CODE_REF}">
									${v.CODE_VALUE}
								</li>
							</c:if>
						</c:forEach>
						</ul>
					</div>
					</div>
				</section>
			</div>
			
			<c:if test="${sessionID == 'admin'}">
				<div class="col-12">
					<ul class="actions">
						<li><a href="compEdit.do" class="button icon solid fa-file">edit</a></li>
					</ul>
				</div>
			</c:if>
		</div>
	</div>
</section>
