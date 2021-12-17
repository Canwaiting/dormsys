<%@ page import="bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.impl.UserImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/glyphicon glyphicon-user">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/dashboard/">

    <title>学生宿舍管理系统</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/examples/dashboard/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<%
    /*获取前台数据*/
    String choices = request.getParameter("choices");
    String info = request.getParameter("info");
    /*获取javabean的数据*/
    List<User> userList = new ArrayList<User>(); /*创建stu数据集*/
    try {
        userList = new UserImpl().searchUser(choices,info); /*获取数据*/
    } catch (Exception e) {
        e.printStackTrace();
    }

    request.setAttribute("userList",userList);
%>



<%--顶部栏--%>
<jsp:include page="../head.jsp"></jsp:include>

<%--页面主体--%>
<div class="container-fluid">
    <div class="row">
        <%--左边--%>
        <jsp:include page="../left.jsp"></jsp:include>

        <%--右边的主体内容--%>
        <div class="col-sm-9 col-sm-offset-3 col-md-5 col-md-offset-2 main" >
                <br/><br/><br/><br/>
                <%--上半部分--%>
                <h2 class="page-header">查找用户信息</h2>
                <!-- Single button -->

                <div id="info">
                    <form class="navbar-form"  action="/servletUser" method="post" >
                        <input type="radio" name="choices" value="user_id">用户编号
                        <input type="radio" name="choices" value="user_name">用户名
                        <br/>
                        <input type="text" class="form-control" placeholder="相应信息">
                        <input type="submit" value="查找"/>
                    </form>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">帮助:</h3>
                    </div>
                    <div class="panel-body">
                        1.选择相应的数据项
                        <br/>2.输入相应信息
                        <br/>3.点击查找按钮
                        <br/>输入信息格式:
                        用户编号()
                        用户名()
                    </div>
                </div>


                <%--下半部分--%>
                <h2 class="sub-header">查询结果</h2>
                <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>用户帐号</th>
                                <th>用户名</th>
                                <th>用户密码</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach items="${userList}" var="user">
                                <tr>
                                    <td>${user.user_id}</td>
                                    <td>${user.user_name}</td>
                                    <td>${user.user_pw}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
            </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>
