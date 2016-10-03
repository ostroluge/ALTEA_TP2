<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>Utilisateurs</title>
</head>
<body bgcolor="#FFFFFF">
	<table border="1" width="75%" align="center">
		<tr>
			<td>Id</td>
			<td>Login</td>
			<td>Pass</td>
			<td>Ville</td>
			<td>Email</td>
		</tr>
		<logic:iterate id="user" name="usersForm" property="user"
			type="bean.User">
			<tr>
				<td><bean:write name="user" property="idUser" /></td>
				<td><bean:write name="user" property="login" /></td>
				<td><bean:write name="user" property="pass" /></td>
				<td><bean:write name="user" property="ville" /></td>
				<td><bean:write name="user" property="email" /></td>
				<td><html:link action="/removeUser" paramName="user" paramId="idUser" paramProperty="idUser">Supprimer</html:link></td>
			</tr>
		</logic:iterate>
		<html:form action="addUser.do">
			<tr>
				<td></td>
				<td><html:text property="login" /></td>
				<td><html:text property="pass" /></td>
				<td><html:text property="email" /></td>
				<td><html:text property="ville" /></td>
				<td><html:submit value="Ajouter" /></td>
			</tr>
		</html:form>
	</table>
</body>
</html>