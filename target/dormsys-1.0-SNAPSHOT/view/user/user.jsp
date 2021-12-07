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

<%--顶部栏--%>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="./user.jsp">学生宿舍管理系统</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">关于</a></li>
        <li><a href="#">帮助</a></li>
        <li><a href="#">退出</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid">
  <div class="row">
<%--    左边的导航栏--%>
    <div class="col-sm-3 col-md-2 sidebar">
      <ul class="nav nav-sidebar">
      <li class="active"><a href="#">学生信息管理<span class="sr-only">(current)</span></a></li>
      </ul>

      <ul class="nav nav-sidebar">
        <li><a href="./showStudent.jsp">查看所有学生信息</a></li>
        <li><a href="./addStudent.jsp">增加学生信息</a></li>
        <li><a href="./deleteStudent.jsp">删除学生信息</a></li>
        <li><a href="./editStudent.jsp">修改学生信息</a></li>
        <li><a href="./searchStudent.jsp">查找学生信息</a></li>
      </ul>

      <ul class="nav nav-sidebar">
        <li class="active"><a href="#">出入登记<span class="sr-only">(current)</span></a></li>
      </ul>

      <ul class="nav nav-sidebar">
        <li><a href="./showStudent.jsp">查看所有登记表</a></li>
        <li><a href="./addStudent.jsp">学生进入登记</a></li>
        <li><a href="./deleteStudent.jsp">学生离开登记</a></li>
        <li><a href="./editStudent.jsp">外来人员进入登记</a></li>
        <li><a href="./searchStudent.jsp">外来人员离开登记</a></li>
      </ul>
    </div>

<%--右边的主体部分--%>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
      <div class="page-header">
        <h1>欢迎使用本系统!</h1>
      </div>
      <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-generic" data-slide-to="1"></li>
          <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img data-src="holder.js/1140x500/auto/#777:#555/text:First slide" alt="First slide">
          </div>
          <div class="item">
            <img data-src="holder.js/1140x500/auto/#666:#444/text:Second slide" alt="Second slide">
          </div>
          <div class="item">
            <img data-src="holder.js/1140x500/auto/#555:#333/text:Third slide" alt="Third slide">
          </div>
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>

      <div class="jumbotron">
        <p>点击左侧按钮即可进行相应操作!</p>
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
