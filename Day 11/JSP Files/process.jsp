<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Scriplet tag-->
<% 
int x=Integer.parseInt(request.getParameter("t1"));
int y=Integer.parseInt(request.getParameter("t2"));
int z=x+y;
//out.println("sum is:"+z);
%>
<!-- expression tag -->
<%=
"the sum is"+z 

%> 

<!-- Declarative tag -->
<%! 
    // Class-level variable
    int a = 10;

    // Function declaration (must be inside <%! ... %>)
    public static int square(int x) {
        return x*x;
    }
%>
<br/>
<%= "the value is"+a %>
 
</body>
</html>