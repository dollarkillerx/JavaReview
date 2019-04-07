<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-7
  Time: 下午1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%!
    boolean isPrime(int num) {
        boolean flag = true;
        for (int j=2; j<num ; j++){
            if(num % j ==0 ){
                flag = false;
                break;
            }

     } return flag;
    }
%>
<%
    List<Integer> primes = new ArrayList();
    for (int i=0;i<=1000;i++) {
        boolean flage = isPrime(i);
        if(flage){
//            out.println("<h1>" + i + "</h1>");
            primes.add(i);
        }
    }
%>

<%
    for(int p:primes){
        out.println("<h1>" + p + "</h1>");
    }
%>
</body>
</html>
