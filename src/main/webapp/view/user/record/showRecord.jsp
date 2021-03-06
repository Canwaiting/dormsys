<%@ page import="bean.RecStu" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.RecPer" %>
<%@ page import="dao.impl.RecStuImpl" %>
<%@ page import="dao.impl.RecPerImpl" %>
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
    /*获取javabean的数据*/
    List<RecStu> recstuList = new ArrayList<RecStu>(); /*创建recstu数据集*/
    List<RecPer> recperList = new ArrayList<RecPer>(); /*创建recper数据集*/
    recstuList = new RecStuImpl().showRecStu(); /*获取数据*/
    recperList = new RecPerImpl().showRecPer(); /*获取数据*/

    request.setAttribute("recstuList",recstuList);
    request.setAttribute("recperList",recperList);
%>

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
            <a class="navbar-brand" href="#">学生宿舍管理系统</a>
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
<jsp:include page="../head.jsp"></jsp:include>

<div class="container-fluid">
    <div class="row">
        <%--    左边的导航栏--%>
        <jsp:include page="../left.jsp"></jsp:include>

        <%--右边的主体部分--%>
        <div class="col-sm-9 col-sm-offset-3 col-md-5 col-md-offset-2 main">

            <br/><br/>
                  <%--表格--%>
                  <h2 class="sub-header">登记表信息</h2>
                  <br/><br/>
                  <h4 class="sub-header">学生登记表信息</h4>
                  <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
                      <tr>
                        <th>登记表编号</th>
                        <th>姓名</th>
                        <th>学号</th>
                        <th>出入状态</th>
                        <th>时间</th>
                      </tr>
                      </thead>

                      <tbody>
                      <c:forEach items="${recstuList}" var="recstu">
                        <tr>
                          <td>${recstu.rec_id}</td>
                          <td>${recstu.stu_id}</td>
                          <td>${recstu.stu_name}</td>
                          <td>${recstu.rec_stu_sta}</td>
                          <td>${recstu.rec_stu_time}</td>
                        </tr>
                      </c:forEach>
                      </tbody>
                    </table>
                  </div>

            <br/><br/><br/><br/>
            <h4 class="sub-header">访客登记表信息</h4>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>登记表编号</th>
                        <th>姓名</th>
                        <th>手机号码</th>
                        <th>出入状态</th>
                        <th>时间</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${recperList}" var="recper">
                        <tr>
                            <td>${recper.rec_id}</td>
                            <td>${recper.per_name}</td>
                            <td>${recper.per_tel}</td>
                            <td>${recper.rec_per_sta}</td>
                            <td>${recper.rec_per_time}</td>
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
