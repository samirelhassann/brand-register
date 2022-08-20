<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <!DOCTYPE html>
  <html>
    <head>
      <meta charset="UTF-8" />
      <title>Home</title>
    </head>
    <body>
      <h2>Company created ${companyName}</h2>
	  <hr/>
	  <ul>
		<c:forEach items="${allCompanies}" var="company">
			<li>${company.name}</li>	  
		</c:forEach>
	</ul>
    </body>
  </html>
</Company>
