<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/10/8
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" width="500px">
    <tr>
        <td>预定编号</td>
        <td>会议室</td>
        <td>预定人</td>
        <td>日期</td>
    </tr>
    <c:forEach var="m" items="${meetingrooms}">
        <tr>
            <td>${m.id}</td>
            <td>${m.meetingName}</td>
            <td>${m.advanceName}</td>
            <td>
                <fmt:formatDate value="${m.meetingOrder}" pattern="yyyy-MM-dd" type="both"></fmt:formatDate>
            </td>
        </tr>
    </c:forEach>
</table>
<p><a href="/toadd">预定会议室</a></p>
</body>
</html>
