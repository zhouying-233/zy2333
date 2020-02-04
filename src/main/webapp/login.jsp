<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="author" content="Robin Liu">

    <title>登录</title>

    <link rel="icon" href="../../favicon.ico">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/index.css" rel="stylesheet">
    <!-- font-awesome -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="js/common/jquery-1.11.3.min.js"></script>
    <script src="js/common/jquery.pin.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="js/common/bootstrap.min.js"></script>
    <!-- chart -->
    <script src="js/common/Chart.min.js"></script>
    
    <!-- 处理页面公共逻辑 -->
    <script src="js/basepath.js"></script>
    <script src="js/cookie.js"></script>
    <script src="js/local.js"></script>
    <script src="js/common.js"></script>
	
  </head>

  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#"><img src="images/logo.png"></a>
          <a class="navbar-brand" href="#"><strong>易学系统</strong></a>  
        </div>
        <div id="navbar" class="navbar-collapse collapse">
        </div>
      </div>
    </nav>
    <div class="container">
      <form method="post" action="${pageContext.request.contextPath}/login.do" id="form_login" class="form-signin">
        <h2 class="form-signin-heading">请登录</h2>
        <label for="inputName" class="sr-only">账号</label>
        <input type="text" id="inputName" name="uname" class="form-control" placeholder="账号" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password"  name="upwd"id="inputPassword" class="form-control" placeholder="密码" required>
        <div class="form-group">
         <img id="imgObj" alt=""  src="${pageContext.request.contextPath}/kaptcha.do" title="看不清，点击刷新">
          </div>
          <div class="form-group">
          <input  name ="code" type="text" class="form-control"  placeholder="验证码" >
          </div>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="记住账号"> 记住账号
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
    </div> <!-- /container -->
 
 
 <!--Begin core plugin -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- End core plugin -->
   
    <script type="text/javascript">
   $(function(){//jquery加载事件  text()、attr()、val()、html()
	   $("#imgObj").click(function(){//与imgid相同
		   $(this).attr("src","${pageContext.request.contextPath}/kaptcha.do");//attr：获取文本的值
	   })      
	   
   })
</script>
 
 
 
 
  </body>
</html>