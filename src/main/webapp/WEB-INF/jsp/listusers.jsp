<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
	<!-- here should go some titles... -->
	<tr>
		<th>Name</th>
		<th>Email</th>
	</tr>
	<c:forEach items="${userList}" var="user">
		<tr>
			<td><c:out value="${user.name}" /></td>
			<td><c:out value="${user.email}" /></td>
		</tr>
	</c:forEach>
</table>