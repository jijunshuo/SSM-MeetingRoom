<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/10/8
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doadd" method="post">
    <table border="1px">
        <tr>
            <td colspan="2" align="center">会议室预定</td>
        </tr>
        <tr>
            <td>会议室</td>
            <td><select name="meetingName">
                <option value="一号会议室">一号会议室</option>
                <option value="二号会议室">二号会议室</option>
                <option value="三号会议室">三号会议室</option>
            </select></td>
        </tr>
        <tr>
            <td>申请人</td>
            <td><input type="text" name="advanceName"/></td>
        </tr>
        <tr>
            <td>预定日期</td>
            <td><input type="text" name="meetingOrder"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="申请"/>
                <input type="button" value="重置"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
