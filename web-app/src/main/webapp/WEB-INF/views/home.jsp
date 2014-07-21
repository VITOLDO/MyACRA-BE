<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World! from Home</h2>

<table>
<c:forEach var="request" items="${mainRequests}">
<tr>
    <td>${request.id}</td>
    <td>${request.value}</td>
</tr>
</c:forEach>
</table>

</body>
</html>
