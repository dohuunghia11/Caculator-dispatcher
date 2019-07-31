<%--
  Created by IntelliJ IDEA.
  User: dohuunghia
  Date: 7/12/19
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <form action="/caculator" method="post">
    <table>
      <tr>
        <th><input type="text" name="numberOne" style="width: 200px; height: 50px"></th>
        <th><input type="text" name="numberTwo" style="width: 200px; height: 50px"></th>
        <th><br></th>
        <th><br></th>
      </tr>
      <tr>
        <th><input type="submit" name="caculate" value="Addtion(+)" style="width: 200px; height: 50px"></th>
        <th><input type="submit" name="caculate" value="Subtraction(-)" style="width: 200px; height: 50px"></th>
        <th><input type="submit" name="caculate" value="Multiplication(X)" style="width: 200px; height: 50px"></th>
        <th><input type="submit" name="caculate" value="Division(/)" style="width: 200px; height: 50px"></th>
      </tr>
    </table>
  </form>
  <h1>${add}</h1>
  </body>
</html>
