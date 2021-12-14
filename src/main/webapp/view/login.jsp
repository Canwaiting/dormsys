<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>登录</title>

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
    <style>
        body{
            background: url("../img/maomingshiyou.jpg");
            background-repeat: no-repeat;
            height: 800px;
            width: 1600px;
        }

    </style>

</head>

<body>

<%--<img src="../img/maomingshiyou.jpg" width="100%" height="100%"/>--%>
<%--<div class="container">--%>
<!-- div1 -->
<div style="z-index: -100">
<%--    <img src="../img/maomingshiyou.jpg" width="100%" height="100%"/>--%>

    <!-- div2 -->
<%--    <div class="col-md-10 col-md-offset-1" style="margin: 20px 100px 20px 100px;box-shadow: 0px 0px 20px;z-index: 999">--%>
        <form class="form-signin" action="/Login" method="post">
            <h2 class="form-signin-heading">用户登录</h2>
            <label for="inputEmail" class="sr-only">用户名</label>
            <input type="text" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
            <label for="inputPassword" class="sr-only">密码</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
            <input type="radio" name="sex" value="male">普通用户
            <input type="radio" name="sex" value="female">管理员
            <br/><br/>
            <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        </form>
<%--    </div>--%>

</div>

<%--    <br/><br/><br/><br/>--%>


<%--</div>--%>
<!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
