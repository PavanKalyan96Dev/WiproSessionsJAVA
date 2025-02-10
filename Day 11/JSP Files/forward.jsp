<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--<jsp:forward page="form.html"></jsp:forward> 
<jsp:include page="form.html"></jsp:include> -->

<jsp:forward page="Welcome.jsp">
<jsp:param name="pavan" value="pavan kalyan"/>
</jsp:forward>
</body>
</html>