<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/company" var="linkNewCompany" />

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Home</title>
  </head>
  <body>
    <c:if test="${not empty companyId}">
      <form action="${linkNewCompany}?id=${companyId}" method="post">
        Name: <input type="text" name="name" value="${companyName}" />
        <input type="submit" />
      </form>
    </c:if>

    <c:if test="${empty companyId}">
      <form action="${linkNewCompany}" method="post">
        Name: <input type="text" name="name" />
        <input type="submit" />
      </form>
    </c:if>
  </body>
</html>
