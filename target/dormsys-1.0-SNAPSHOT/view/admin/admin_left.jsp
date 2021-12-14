<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">


    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/examples/signin/signin.css" rel="stylesheet">

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

    <div class="col-sm-3 col-md-2 sidebar">
        <ul class="nav nav-sidebar">
            <li class="active"><a href="#">用户信息管理<span class="sr-only">(current)</span></a></li>
        </ul>

        <%--用户管理--%>
        <ul class="nav nav-sidebar">
            <li><a href="user/showUser.jsp">查看所有用户</a></li>
            <li><a href="user/addUser.jsp">增加用户</a></li>
            <li><a href="user/deleteUser.jsp">删除用户</a></li>
            <li><a href="user/editUser.jsp">修改用户</a></li>
            <li><a href="user/searchUser.jsp">查找用户</a></li>
            <li><a href="user/editpwUser.jsp">修改用户密码</a></li>
        </ul>
        <%--用户管理--%>

        <%--员工管理--%>
        <ul class="nav nav-sidebar">
            <li class="active"><a href="#">员工管理<span class="sr-only">(current)</span></a></li>
        </ul>

        <ul class="nav nav-sidebar">
            <li><a href="employee/showEmployee.jsp">查看所有员工</a></li>
            <li><a href="employee/addEmployee.jsp">增加员工</a></li>
            <li><a href="employee/deleteEmployee.jsp">删除员工</a></li>
            <li><a href="employee/editEmployee.jsp">修改员工</a></li>
            <li><a href="employee/searchEmployee.jsp">查找员工</a></li>
        </ul>
        <%--员工管理--%>

        <%--楼房管理--%>
        <ul class="nav nav-sidebar">
            <li class="active"><a href="#">楼房管理<span class="sr-only">(current)</span></a></li>
        </ul>

        <ul class="nav nav-sidebar">
            <li><a href="building/showBuilding.jsp">查看所有楼房</a></li>
            <li><a href="building/addBuilding.jsp">增加楼房</a></li>
            <li><a href="building/deleteBuilding.jsp">删除楼房</a></li>
            <li><a href="building/editBuilding.jsp">修改楼房</a></li>
            <li><a href="building/searchBuilding.jsp">查找楼房</a></li>
        </ul>
        <%--楼房管理--%>

        <%--宿舍管理--%>
        <ul class="nav nav-sidebar">
            <li class="active"><a href="#">宿舍管理<span class="sr-only">(current)</span></a></li>
        </ul>

        <ul class="nav nav-sidebar">
            <li><a href="dorm/showDorm.jsp">查看所有宿舍</a></li>
            <li><a href="dorm/addDorm.jsp">增加宿舍</a></li>
            <li><a href="dorm/deleteDorm.jsp">删除宿舍</a></li>
            <li><a href="dorm/editDorm.jsp">修改宿舍</a></li>
            <li><a href="dorm/searchDorm.jsp">查找宿舍</a></li>
        </ul>
        <%--宿舍管理--%>

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
