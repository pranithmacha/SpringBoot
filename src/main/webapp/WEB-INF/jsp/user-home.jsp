<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring Security Example - ProgrammingFree</title>
</head>
<body>
  <h1>user home!</h1>
  Click <a href="/hello">here</a> to see a
  greeting

  <a href="/register/admin"> admin </a>

   <form action="/logout" method="post">
    <input type="submit" class="button red big" value="Sign Out" /> <input
     type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
   </form>

  <a href="/hello"> hello </a>
</body>
</html>