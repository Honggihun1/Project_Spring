<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<%@ include file="../include/head.jsp" %>
<style type="text/css">
h3{
	text-align: center;
	margin: 10px auto
}
.content{ 
	width: 480px;
    height: 500px;
    background: #e9e9e9;
    border-radius: 20px;
    display: flex;
    flex-direction: column;
    position: absolute;
  	left:50%; top:50%;
	transform:translate(-50%, -50%);
 	opacity: 0.9;
}
.info {
	margin: 40px 100px;
}

input {
	width: 280px;
    height: 30px;
    padding: 0 10px;
    font-size: 15px;
    border: 1px solid #AB92BF;
    margin: 10px auto;
}
a.btn-empty {
	background-color: #fff;
	color:#3367d6;	
}
.btnSet { margin-top:30px; margin-bottom:30px; }
</style>
<body class="sb-nav-fixed">

	<!-- 여기가 헤더부분 -->
	<%@ include file="../include/header.jsp" %>

	<h2>정보 수정페이지</h2>
	
	<div class="content">
		<div class="info">
		<h3>내 정보/수정</h3>
		<form action="changeInfo" method="post">
			아이디<br><input type="text" name="teacher_id" value="${vo.teacher_id}" readonly><br/>
			비밀번호 변경<br><input type="text" name="pw" value="${vo.teacher_pw}" ><br/>
			이름<br><input type="text" name="teacher_name" value="${vo.teacher_name}"><br/>
			이메일<br><input type="text" name="email" value="${vo.email}"><br/>
			전화번호<br><input type="text" name="teacher_phone" maxlength="13" value="${vo.teacher_phone}">
			<br>		
			<button type='submit'>수정</button>
		
			<a class='btn-empty' onclick='history.go(-1)'>취소</a>
		
		</form>
		</div>	
	</div>
	


<!--  여기까지 콘텐트 + 푸터 부분 -->

<!-- 부트스트랩 js -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	crossorigin="anonymous"></script>

<!-- 템플릿 js -->
<script src="js/scripts.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
	crossorigin="anonymous"></script>
<script src="/js/demo/chart-area-demo.js"></script>
<script src="/js/demo/chart-bar-demo.js"></script>

<!-- 표 / 페이징 관련 js -->
<script src="js/simple-datatables.js" crossorigin="anonymous"></script>
<script src="js/datatables-simple-demo.js"></script>



<script>
		
	 // 다크모드 버튼 (흰배경+검정배경)
	 let $darkModeBtn = document.querySelector('.darkmode');
	 let bgsclass = document.querySelector('.bg-sclass');
	 let body = document.querySelector('body');
	 let content = document.querySelector('.content');
	 let dark = 'on'; //불값을 저장하여 온오프기능 구현	
	 let play = false;
	 if(window.localStorage.getItem("darkmode") != null){
		 dark = window.localStorage.getItem("darkmode");
	 }  
	 
	 
	  if( dark == 'off' ){
	        
          body.setAttribute('style', 'background:#3d3d3d');
          content.setAttribute('style', 'background:#767676');
          bgsclass.setAttribute('class', 'sb-topnav navbar navbar-expand navbar-dark bg-dark');
        } else {
          body.setAttribute('style', 'background:#fafafa');
          content.setAttribute('style', 'background:#e9e9e9');
          bgsclass.setAttribute('class', 'sb-topnav navbar navbar-expand navbar-dark bg-sclass');
        }
       
		// 다크모드
	    $darkModeBtn.addEventListener('click', () => {
	    	if(dark == 'on'){
	    		dark='off';
	    	}else{
	    		dark = 'on';
	    	}
	    	
	      	window.localStorage.setItem("darkmode",dark);
			

	        if( dark == 'off' ){
	        	body.setAttribute('style', 'background:#3d3d3d');
	        	content.setAttribute('style', 'background:#767676');
	          bgsclass.setAttribute('class', 'sb-topnav navbar navbar-expand navbar-dark bg-dark');
	        } else {
	          body.setAttribute('style', 'background:#fafafa');
	          content.setAttribute('style', 'background:#e9e9e9');
	          bgsclass.setAttribute('class', 'sb-topnav navbar navbar-expand navbar-dark bg-sclass');
	        }
	      });
	
		

	
	</script>

</body>
</html>