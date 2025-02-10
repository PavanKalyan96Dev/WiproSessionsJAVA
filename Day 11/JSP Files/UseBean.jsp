<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.wipro.Student" %>	<!-- imported this bcoz it exist in another package-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.wipro.Student" />	<!--  exactly same like object creation -->

<!_--by using the setProperty-->
<jsp:setProperty property="stid" name="obj" value="200"/>	<!-- instead of setters -->

<jsp:setProperty property="stname" name="obj" value="prem"/>

<b>"Student is is:"</b><jsp:getProperty property="stid" name="obj"/></br>		<!-- instead of getters -->
<b>"Student name is:"</b><jsp:getProperty property="stname" name="obj"/>


</body>
</html>