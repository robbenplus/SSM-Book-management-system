<%--
  Created by IntelliJ IDEA.
  User: Robben
  Date: 2020/5/9
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>

  <style>
      a{
          text-decoration: none;
          color: brown;
          font-size: 18px;
      }
      h3 {
          width: 180px;
          height: 38px;
          margin: 100px auto;
          text-align: center;
          line-height: 38px;
          background: deepskyblue;
          border-radius: 5px;
      }
  </style>

  <body>
        <h3>
          <a href="${pageContext.request.contextPath}/book/allBook">点击套猴</a>
        </h3>
  </body>
</html>
