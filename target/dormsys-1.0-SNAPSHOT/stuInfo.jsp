<%--
  Created by IntelliJ IDEA.
  User: canwaiting
  Date: 2021/12/2
  Time: 下午1:36
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
    <title>StuInfo</title>
</head>
<body>
    <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                       url="jdbc:mysql://localhost/test"
                       user="root"  password="12345"/>

    <sql:query dataSource="${snapshot}" var="result">
        SELECT * from user;
    </sql:query>

    <table border="1" width="100%">
        <tr>
            <th>name</th>
            <th>password</th>
        </tr>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.name}"/></td>
                <td><c:out value="${row.password}"/></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
