<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="icon" href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/favicon.ico">
<%--  <link rel="canonical" href="https://getbootstrap.com/doch/3.4/examples/cover/">--%>

  <title>宿舍管理系统</title>

  <!-- Bootstrap core CSS -->
  <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/css/bootstrap.min.css" rel="stylesheet">

  <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
  <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/examples/cover/cover.css" rel="stylesheet">

  <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
  <!--[if lt IE 9]><script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
  <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie-emulation-modes-warning.js"></script>

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <style>

    .bg{
      height:900px;
      background-image:url(../img/maomingshiyou.jpg);
      background-size:cover;
    }

    .form{
      /*padding: 40px;*/
      padding: 50px;
      margin-top: 175px;
      background: rgba(255,255,255,0.2);
    }

    .footer{
      height: 60px;
      padding-top:20px;
      font-size: 14px;
      font-weight: bold;
      text-align: center;
    }

  </style>
</head>

<body>


<div class="container-fluid">
  <div class="row bg">
<%--    <div class="col-md-offset-10 col-md-10 col-sm-offset-3 col-sm-10 col-xs-offset-2 col-xs-10 col-lg-offset-6 col-lg-3">--%>
    <div class="col-md-offset-6 col-md-4 col-sm-offset-3 col-sm-7 col-xs-offset-2 col-xs-8 col-lg-offset-6 col-lg-3 form">
      <form class="form-horizontal" id="loginForm">
        <div class="form-group">
          <label for="username" class="col-sm-4 control-label">用户名</label>
          <div class="col-sm-8">
            <input type="text" class="form-control" id="username" placeholder="请输入用户名">
          </div>
        </div>
        <div class="form-group">
          <label for="password" class="col-sm-4 control-label">密码</label>
          <div class="col-sm-8">
            <input type="password" class="form-control" id="password" placeholder="请输入密码">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
              <label>
                <input type="radio" name="sex" value="male">普通用户
                <input type="radio" name="sex" value="female">管理员
              </label>
            </div>
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="button" id="submitBtn" class="btn btn-success"  style="width: 30%;">登录</button>
          </div>
        </div>
      </form>
      <span style="color: red;" id="tip"></span>
    </div>
  </div>

  <div class="footer">
    <p>&copy;版权所有：黄伟庭Canwating</p>
  </div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>

