<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>registration</title>
</head>
<body>
 <form action="/register" method="post">
  <div>
   <input type="text" name="username"
    placeholder="User Name" />
  </div>
  <div>
   <input type="password" name="password"
    placeholder="Password" />
  </div>
   <div>
     <input type="password" name="confirm_password"
      placeholder="Confirm Password" />
    </div>
     <div>
         <input type="text" name="role"
          placeholder="Role" />
        </div>

  <div>
   <input type="submit" value="Sign In" class="button red small" />
  </div>

  <input type="hidden" name="${_csrf.parameterName}"
   value="${_csrf.token}" />
 </form>

 <a href="/logout"> logout </a>
</body>
</html>