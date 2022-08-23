<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/company" var="linkNewCompany" />

  <!DOCTYPE html>
  <html>
    <head>
      <meta charset="UTF-8" />
      <title>Home</title>
      <style type="text/css">
         #linkCreate {
            float: right;
          }

      </style>
    </head>
    <body>
      <span>
        ${message}
      </span>
    <span id="linkCreate">
      <a href="/java-web-demo/formNewCompany.jsp" method="get">Click here to create another company</a>
    </span>
      
	  <hr/>
	  <ul>
		<c:forEach items="${allCompanies}" var="company">
			<li>
        <strong>Company Name:</strong> ${company.name} - <strong>Created at:</strong> <fmt:formatDate value="${company.createdDate}" pattern="dd/MM/yyyy"/>
        <a href="/java-web-demo/editCompany?id=${company.id}" method="get">edit</a>
        <a href="/java-web-demo/removeCompany?id=${company.id}" method="get">remove</a>
      </li>	  
		</c:forEach>

    
	</ul>
    </body>
  </html>
</Company>
