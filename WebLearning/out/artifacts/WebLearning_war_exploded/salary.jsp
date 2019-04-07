<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>year</th>
                <th>salary</th>
            </tr>
            <%
                for(int i =0;i<=50;i++) {
                    int sal = 0;
                    if(i <= 5) {
                        sal = 1500 + i * 150;
                    }else if(i>5 && i<=10) {
                        sal = 1500 + 150 * 5  + 300 * (i-5);
                    }else if(i>10){
                        sal = 1500 + 150 * 5 + 300 * 5 + 375 * (i-10);
                    }
                    out.println("<tr>");
                    out.println("<td>"+ i +"<td>");
                    out.println("<td>"+ sal +"<td>");
                    out.println("</tr>");
                }
            %>
        </table>
    </div>
</body>
</html>