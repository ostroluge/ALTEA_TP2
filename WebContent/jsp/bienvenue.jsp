<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
<title>Bienvenue</title>
</head>
<body bgcolor="#FFFFFF">

<h3>Id User :<bean:write name="logFor" property="user.idUser" /><br />
Login :<bean:write name="logFor" property="user.login" /><br />
Pass :<bean:write name="logFor" property="user.pass" /><br />
Email:<bean:write name="logFor" property="user.email" /><br />
Ville :<bean:write name="logFor" property="user.ville" /><br />
</h3>
</body>
</html>