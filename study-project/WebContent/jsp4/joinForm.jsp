<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script>
	function check() {
		//frm.id.value.length == 0
		if (/*document.*/frm.id.value == '') {
			alert('아이디는 필수입력 입니다.');
			frm.id.focus();
			return false;
		}
		// 아이디가 3글자 이상 13글자 이하인지 검증
		if (!(frm.id.value.length >= 3 && frm.id.value.length <= 13)) {
			alert('아이디는 3글자 이상 13글자 이하만 가능 \n다시입력하세요');
			frm.id.select();
			return false;
		}

		if (frm.passwd.value == '') {
			alert('패스워드 필수입력');
			frm.id.focus();
			return false;
		}
		if (frm.name.value == '') {
			alert('이름은 필수입력 입니다.');
			frm.id.focus();
			return false;
		}

		return true;
	}
</script>


</head>
<body>
	<h1>회원 가입</h1>


	<form name="frm" action="joinProcess.jsp" method="post"
		onsubmit="return check();">
		<fieldset>
			<legend>필수입력사항</legend>
			아이디 : <input type="text" name="id" <%--required --%>/> <br>
			패스워드 : <input type="password" name="passwd" <%--required --%>/> <br>
			이름 : <input type="text" name="name" <%--required --%>/> <br>
		</fieldset>

		<fieldset>
			나이 : <input type="text" name="age" /> <br> 
			성별 : <input
				type="radio" name="gender" value="남" />남자 
				<input type="radio"
				name="gender" value="여" />여자 <br> 
			이메일 : <input type="email"
				name="email" /> <br>
		</fieldset>


		<button type="submit">회원가입</button>

	</form>

</body>
</html>