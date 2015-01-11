<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: escorpion
  Date: 11/21/14
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Carga de Fichero</title>
</head>
<body>

<s:if test="errors.size()>0">
    <ul><s:fielderror/></ul>
</s:if>

<s:form action="ejercicio2b" method="post">
    <s:textfield name="name" id="name" label="Name"/>
    <s:textfield name="age" id="age" label="Age" size="3"/>
    <s:submit value="Submit"/>
</s:form>

</body>
</html>