<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="메타몽">
<title>네이년 : 이년의 검색</title>
</head>
<body>
	글을 씁니다.
	<br>
	<h1>가장 큰 글씨</h1>
	<a href="https://www.naver.com">네이년</a>
	<%
	//여기는 자바입니다.
	int num = 10;
	num += 1;
	%>
	<hr><hr><hr>
	num : <%=num%>

	<%
	for(int i = 2 ; i < 10; i++){ 
	for(int j = 1 ; j < 10; j++){ 
%>
       <%= i%> X <%=j %> = <%=i*j %>   <br>
<%
}
	}

%>		

<a href ="./main "> main </a>

</body>
</html>