<%@ page import="dao.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>stuinfo_mvc</title>
</head>
<body>
<%
    String s = (String)request.getAttribute("test");
    System.out.println("the jsp_s:" + s);
    List<User> userList = (List<User>) request.getAttribute("userList");
    System.out.println("the UserList:" + userList); /*NULL*/
%>
test:<%=(String)request.getAttribute("test")%> </br>
test_from_el:${test}
<h1>hello world</h1>
<div id="info">
    <form action="/showAll" method="post">
        信息:<input type="text" name="info"/><br/>
        <input type="submit" value="传递"/>
    </form>
</div>


<h2>--------------</h2>
<h2>所有信息</h2>
<c:forEach items="${userList}" var="user">
    <tr>
        <td>${user.name}</td>
        <td>${user.password}</td>
    </tr>
</c:forEach>

<h2>--------------</h2>
<h2>信息查询</h2>
<div id="search">
    <form action="searchName" method="post">
        <p>hello</p>
        Name:<input type="text" name="name"/><br/>
        <input type="submit" value="确认"/>
    </form>
</div>

<tr>
    <td>${user.name}</td>
    <td>${user.password}</td>
</tr>


<h2>--------------</h2>
<h2>增加</h2>
<div id="add">
    <form action="/addName" method="post">
        Name:<input type="text" name="name"/><br/>
        password:<input type="text" name="password"/><br/>
        <input type="submit" value="添加"/>
    </form>
</div>

<h2>--------------</h2>
<h2>删除</h2>
<div id="delete">
    <form action="/deleteName" method="post">
        Name:<input type="text" name="name"/><br/>
        <input type="submit" value="删除"/>
    </form>
</div>

<h2>--------------</h2>
<h2>修改</h2>


</body>