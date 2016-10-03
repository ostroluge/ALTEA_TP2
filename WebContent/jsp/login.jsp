<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<body>
<html:form action="login.do" method="post">
  Login:<html:text property="login" />
	<br />
  Pass :<html:password property="pass" />
	<br />
	<html:submit value="Valider" />
</html:form>
<html:errors />
</body>
</html>