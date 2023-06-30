<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap');
button{
   background-color : #2DB400;
   width : 300px;
   height : 50px;
   border : 0px;
   color : white;
   font-size : 20pt;
   font-family : 'Nanum Gothic', sans-serif
}
#loginBox{
   background-color : #2DB400;
   width : 300px;
   height : 300px;
   padding : 30px 10px 30px 10px;
}
b{
   font-weight : bolder
}
input{
   width : 100%;
   height : 30px;
   text-align : center;
   padding : 0;
   margin : 0;
   border : 0;
   
   margin-bottom : 10px;
}
input[type=text]{
}
input[type=password]{
}
</style>
</head>
<body>
   <div id = "loginBox">
      <form action="./loginAction.jsp">
      <input type="text" name="id">
      <input type="password" name="pw">
      <button><b>로그인</b></button>
      </form>
   </div>
</body>
</html>