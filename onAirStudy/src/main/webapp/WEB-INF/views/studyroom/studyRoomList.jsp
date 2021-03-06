<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/studyRoomList.css"> --%>

<script>

function selectCategory(category) {
	console.log(category);
    location.href="${pageContext.request.contextPath}/studyroom/searchStudyroom.do?category="+category;
}

function searchRoom() {
	const selectOption = $("#searchOption").val();
	const keyword = $("#keyword").val();
	location.href="${pageContext.request.contextPath}/studyroom/searchStudyroom.do?search_option="+selectOption + "&keyword=" + keyword;
	
}

</script>

<style>
.col-lg-12 {
    background-color: rgb(247, 182, 151, 0.5);
    border-color: none;
    border-radius:10px;
    color: #E2A182;
    width: 96%; 
	height:170px;
	margin-left:2%;
    }

.col-lg-12 .searchFrm{
	margin-left:2%;
	margin-top:1%;
}

.col-lg-12 .optionFrm{
	margin-left:19%;
	margin-top:1%;
}

.rBtn{
	height: 60px;
	padding-top:20px
}

.rBtn .btn-outline-warning{
	border-radius: 35px; float: right;
  background-color: white;
    border-color: #AD8686; 
       color: #E2A182
}

.rBtn .btn-outline-warning:hover,
.rBtn .btn-outline-warning:focus {
    border-color: rgb(141, 109, 109);
    background-color: rgb(141, 109, 109);
    color: #FFF; }


#srlistG #srProfile{
	background-color: fff; 
	border: 4px solid rgb(247, 175, 141); 
	border-radius: 5%; 
	width: 300px; 
	height: 450px;
	margin-left: 4%;
	margin-right: 4%;
	margin-bottom: 8%;
	padding:8px;
	
}

.sr_pic .roomPic{
	border-radius: 5%;
	opacity: 0.7;
	width: 260px; 
	height: 230px;
	position:absolute; 	 
	z-index:1"
}

.sr_pic .memPic{
	border: 5px solid white;
	border-radius:30%;
	width: 130px;
	height: 130px;
	position:absolute; 
	top:140px;
	left:70px;
	z-index:2"
	
}

.contentR{
	position:absolute; 
	bottom:10px; 
	padding-left:15px; 
	padding-right:15px;
	z-index:3"
}
.hBtn{
	position:absolute; 
	top:220px;
	right:30px;
	z-index:2"
	
}
.heartBtn{
	width: 35px;
	height: 35px;
	border: 2px solid rgb(247, 182, 151);
	border-radius:50%;	
	background-color: white;
	
}

.heartBtn .heartP{
	width: 20px;
	
}

</style>
<div class="studyRoomList" style="margin-bottom: 0;">
	<div class="col-lg-12 p-4 text-center">
	
		<form name="search_option" method="POST">
			<div class="row">
			
			<select class="optionFrm" id="searchOption" name="search_option" style="width:7%">
			<option value="member_id"
			<c:if test="${map.search_option == 'member_id'}">selected</c:if>
  			 >?????? ??????</option>

        	<option value="sr_title" 
			<c:if test="${map.search_option == 'sr_title'}">selected</c:if>
        	>??????</option>
			
			</select>
				<input type="text" class="searchFrm form-control col-sm-6" id="keyword"
					name="keyword" value="${ map.keyword }"
					placeholder="?????? ????????? ????????? ????????????????" required />

				<button type="button" class="btn btn-light btn-sm" style="margin-top:1%; margin-left:1%" onclick="searchRoom()" value= "??????">??????</button>
			</div>
		</form>
		
		
		<br>
		
		<div class="container" style="padding-left:18%">
		<div class="row" >
		<c:forEach items="${ sCategory }" var="sCategory">
			<button type="button" class="btn btn-outline" onclick="selectCategory('${sCategory.no}')">
			${ sCategory.category }</button>
		</c:forEach> 
				</div>
			</div>
	</div>

	
	<div class="container" id="container">
	
		<div class="rBtn" >
			<button type="button" class="btn btn-outline-warning" id="btnJoin"  style="float:right;">
			<a href="${pageContext.request.contextPath }/mypage1/newstudy.do">?????????
				??? ?????????</a>
		</button>
	</div>
	<br />
	
		<div class="row" id="srlistG">
		
			<c:forEach items="${ srList }" var="roomList" varStatus="status">				
				
				 
				<div class="col-sm-3" id="srProfile" style="<c:if test="${ roomList.srOpenedYN != 'Y'}">background-color:gray;</c:if>">
				
				<input type="hidden" name="category" vlaue="${roomList.category}" />
				
					<div class="sr_pic">
					<c:choose>
					<c:when test="${ roomList.srPic != null }">	
					<img class="roomPic" 
					src="${pageContext.request.contextPath }/resources/upload/${ roomList.srPic }">
					</c:when>
					<c:otherwise>
					<img class="roomPic" 
					src="${pageContext.request.contextPath }/resources/upload/background.jpg">
					</c:otherwise>
					</c:choose>
					
					<c:choose>
					<c:when  test="${ roomList.mPic != null }">
					<img class="memPic" 
					src="${pageContext.request.contextPath }/resources/upload/${ roomList.mPic }">
					</c:when>
					<c:otherwise>
					<img class="memPic" 
					src="${pageContext.request.contextPath }/resources/upload/basicPic.png">
					</c:otherwise>					
					</c:choose>

						
					</div>
			
					<div class="hBtn" >
						<form id="favRoom" 
								action="${ pageContext.request.contextPath }/studyroom/favStudyroom.do"
								method="POST">
				
							<input type="text" class="form-control" name="srNo"	value="${roomList.srNo }"  hidden> 														
														
														
													
							<input type="text" class="form-control" name="memberId"	value="${loginMember.memberId }" hidden >
							
							<button type="submit" class="heartBtn" style="<c:if test="${loginMember.memberId == roomList.wId && loginMember.memberId !=null}">background-color:gray;</c:if>" >
								<img class="heartP"
									src="${pageContext.request.contextPath }/resources/images/heart.png" >
							</button>
							
						</form>
					
					</div>

					<div class="contentR">
						<br>
						<h5 class="text-center">${ roomList.sTitle }</h5>
						<h5 class="text-center">?????? ?????? : ${ roomList.memberId }</h5>

						<h5 id="searchT" class="text-center">${ roomList.srOpenedYN == 'Y' ? "?????????" :  "????????????"}
						</h5>

						<c:if test="${ roomList.srOpenedYN == 'Y'}">
						<button type="button" class="btn btn-light btn-sm"
							onclick="previewR('${ roomList.srNo }','${roomList.memberId }','${roomList.sTitle }')">????????????</button>
						<button type="button" class="btn btn-light btn-sm"
							onclick="applyR('${ roomList.srNo }')">????????????</button>	
						<button type="button" class="btn btn-danger btn-sm"
							onclick="reportR('${ roomList.srNo }','${roomList.memberId }','${roomList.sTitle }')">????????????</button>						
						</c:if>
						
					</div>
				</div>
				<br />
			</c:forEach>
		</div>
	</div>
	</div>


<!-- ???????????? -->
<div class="modal fade" id="previewFrm" role="dialog"
	aria-labelledby="deleteMemoModalTitle" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header" style="color: #E2A182;">
				<h4 class="modal-title">?????? ????????????</h4>
				<button type="button" class="close" data-dismiss="modal">??</button>
			</div>
			<!-- Modal body -->
				<div class="modal-body">
				<div id="intro"></div>
				<div id="leader"></div>
					
				</div>

			<form
				action="${ pageContext.request.contextPath }/studyroom/applystudyroom.do"
				id="applyS" method="POST">
					<input type="text" name="memberId" hidden />
					<input type="text" class="form-control" name="srNo" hidden>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="submit" class="btn btn-outline">????????????</button>
				</div>
			</form>

		</div>
	</div>
</div>

<script>
	function previewR(srNo,memberId,title) {
		$("#previewFrm").modal().find("[name=srNo]").val(srNo);
		$("#previewFrm").modal().find("[name=srNo]").val(srNo);

		var content = title+"??? ?????? ?????? ?????????.";
		var rLeader = "???????????? ????????? ?????? ????????? "+ leader+ " ?????????." 
		$("#intro").html(content);
		$("#leader").html(rLeader);
	}
</script>

<!-- ?????? -->
<div class="modal fade" id="applyRFrm" role="dialog"
	aria-labelledby="deleteMemoModalTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">????????? ??? ?????? ??????</h4>
				<button type="button" class="close" data-dismiss="modal">??</button>
			</div>

			<!-- Modal body -->
			<form
				action="${ pageContext.request.contextPath }/studyroom/applystudyroom.do"
				name="applyFrm" method="POST">
				<input type="text" class="form-control" name="srNo" id="srNo" hidden>
				<input type="text" class="form-control" name="memberId"
					id="memberId" value="${ loginMember.memberId }" hidden>
				<div class="modal-body">????????? ??? ????????? ?????? ???????????????????</div>
				<!-- Modal footer -->

				<div class="modal-footer">
					<button type="submit" class="btn btn-outline">??????</button>
					<button type="button" class="btn btn-danger" data-dismiss="modal">??????</button>
				</div>
			</form>


		</div>
	</div>
</div>

<script>
	function applyR(srNo) {
		$("#applyRFrm").modal().find("[name=srNo]").val(srNo);
	}
</script>
<!-- ?????? ?????? -->
		<div class="modal" id="reportMyModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">????????????</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">
						<input type="hidden" id="contentIdK" value="" />
						<div class="form-group">
							<label for="reportCategK">?????? ????????????</label> <select
								class="form-control" id="reportCategK" name="reportCategK">
								<option value="1">????????????</option>
								<option value="2">???????????? ??????</option>
								<option value="3">?????? ?????? ??????</option>
							</select>
						</div>
						<hr />
						<h5>
							?????? ?????? : <strong id="reportIdK"></strong>
						</h5>

						<h5>?????? ??????</h5>
						<div id="reportContents"></div>
					</div>

					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-success" data-dismiss="modal"
							onclick="doReport();">????????????</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
		<script>
		//?????? ????????? ????????? ??????
		 function reportR(no,leader,title) {
			$("#reportMyModal").modal('show');
			var content = title+"?????? ??????"+leader+"??? ???????????????.";
			$("#reportContents").html(content);
			$("#contentIdK").val(no);
			$("#reportIdK").html(leader);
		};
		//?????? ?????? ???????????? ??????
		function doReport() {
			if (confirm("?????? ???????????????????")) {
				$.ajax({
							url : "${pageContext.request.contextPath}/report/insertReport.do",
							type : "POST",
							data : {
								contentCategory : "R",
								contentId : $("#contentIdK").val(),
								reporter : "${loginMember.memberId}",
								reportedMember : $("#reportIdK").text(),
								category : $("#reportCategK").val()
							},
							dataType : "json",
							success : function(result) {
								if (result > 0)
									alert("????????? ?????????????????????.");
							},
							error : function(xhr, status, err) {
								console.log("????????????!");
								console.log(xhr);
								console.log(status);
								console.log(err);
							}
						});
			}
		}
		</script>

<div class="col-lg p-0 m-0">
<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
</div>