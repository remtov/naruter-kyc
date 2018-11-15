<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="/mcss/login.css" rel="stylesheet" />
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--<%=session.getAttribute("id") 
<%=session.getId() %> --%>
<c:choose>
<c:when test="${not empty sessionScope.id}">

이미 로그인이 되어있으십니다. 홈페이지로 가시겠습니까 ?
<button type="button" onclick="location.href='/site/main/homepage'">마이페이지</button>
</c:when>
<c:otherwise>

<div class="form-signin">
	<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
	<input type="text" data-field="memberid" class="form-control" placeholder="ID" required autofocus>
	<input type="password" data-field="memberpw" class="form-control" placeholder="Password" required>
	<div class="checkbox mb-3">
		<label> <input type="checkbox" value="remember-me">Remember me
		</label>
	</div>
	<button class="btn btn-lg btn-primary btn-block" id="logbtn">Sign
		in</button>
		
		
		
		<div>
		<button class="btn btn-lg btn-primary btn-block" id="find-id" onclick="">아이디 찾기</button>
		<button class="btn btn-lg btn-primary btn-block" id="find-pass" onclick="">비밀번호 찾기</button>
		</div>
	<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</div>
</c:otherwise>
</c:choose>
<script>

var logbtn = document.querySelector('#logbtn');
logbtn.addEventListener('click',function(){
	var inputs = document.querySelectorAll('input[data-field]');
	var param ={};
	for(var i=0;i<inputs.length;i++){
		var k = inputs[i].getAttribute('data-field');
		var v = inputs[i].value;
		param[k]=v ;
	}
	param = JSON.stringify(param);
	
	var conf = {
			url : '/remyp/sign',
			param : param,
			method : 'POST',
			success : togo
	}
	
	var au = new AjaxUtil(conf);
	au.send();
});

function togo(res){
	if(res == -1){
		alert('아이디 혹은 비밀번호가 틀립니다.');
		return;
	}else{
		alert('로그인 성공');
		location.href='/remyp/uri/site/all/home';
		return;
	}
	
}
</script>
