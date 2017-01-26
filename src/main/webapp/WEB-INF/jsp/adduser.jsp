<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 
<html>
<head>
    <title>Add Employee Form</title>
    <style>
    .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
</head>
 
<body>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%><h2><spring:message code="page" text="Add New Employee" /></h2>
    <br/>
    <form:form method="post" modelAttribute="user">
        <%-- <form:errors path="*" cssClass="error" /> --%>
        <table>
            <tr>
                <td><spring:message code="name" text="First Name" /></td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="email" text="Email" /></td>
                <td><form:input path="email" /></td>
                <td><form:errors path="email" cssClass="error" /></td>
            </tr>
            
             <tr>
                <td colspan="2"><input type="submit" value="Add User"/></td>
            </tr>
            </table>
            </form:form>
            </body>
            </html>