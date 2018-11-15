<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link href="/mcss/login.css" rel="stylesheet" />
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><input type="text" id="memberid" class="form-control" placeholder="ID" required autofocus data-vali onkeypress="keyevent(this);">
</div><br>
<div><input type="password" id="memberpw" class="form-control" placeholder="Password" required data-vali>
</div><br>
<div><input type="password" id="memberpw-con" class="form-control" placeholder="Password-con" required data-vali>
</div><br>
<div><input type="text" id="membername" class="form-control" placeholder="membername" required  data-vali>
</div><br>
<div><input type="text" id="memberemail" class="form-control" placeholder="memberemail" required  data-vali>
</div><br>
<div><input type="text" id="memberphone" class="form-control" placeholder="memberphone" required  data-vali>
</div><br>
<div><input type="text" id="memberaddress" class="form-control" placeholder="memberaddress" required  data-vali>
</div><br>


<script>

var as =document.querySelectorAll('*[data-vali]');


var id = 0;

//아이디 체크하여 가입버튼 비활성화, 중복확인.
function checkId() {
	var memberid = document.querySelector('#memberid').value;
    $.ajax({
        data : {
        	memberid : memberid 
        },
        url : "checkId.jy",
        success : function(res) {
            if(inputed=="" && res=='0') {
                $("#memberid").css("background-color", "#FFCECE");
                idCheck = 0;
            } else if (res == '0') {
                $("#memberid").css("background-color", "#B0F6AC");
                idCheck = 1;
            } else if (res == '1') {
                $("#memberid").css("background-color", "#FFCECE");
                idCheck = 0;
            } 
        }
    });
}

function keyevent() {
	
    var keycode = event.keyCode;
   if(keycode==13){
	/* 버튼 클릭 */
	alert(1)
	gogo();
   }
	function gogo(){
		location.href='/'
	}
   
   
}


</script>
</body>
</html>