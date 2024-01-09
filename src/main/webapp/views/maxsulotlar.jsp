<%@ page import="java.util.List" %>
<%@ page import="org.najot.model.Maxsulot" %><%--
  Created by IntelliJ IDEA.
  User: khasanjontuychiboev
  Date: 09/01/24
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% List<Maxsulot> maxsulotList = (List<Maxsulot>) request.getAttribute("maxsulotlar"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="border: 1px solid black;">

    <tr style="border: 1px solid black;">
        <th>id</th>
        <th>nomi</th>
        <th>narxi</th>
        <th></th>
    </tr>


            <% for (Maxsulot maxsulot: maxsulotList) {%>
            <tr style="border: 1px solid black;">
                <td><%=maxsulot.getId()%></td>
                <td><%=maxsulot.getNomi()%></td>
                <td><%=maxsulot.getNarxi()%></td>
                <td>
                    <a href="#">view</a>
                    <a href="#">update</a>
                    <a href="#">delete</a>
                </td>
            </tr>
            <%}%>
</table>

</body>
</html>
