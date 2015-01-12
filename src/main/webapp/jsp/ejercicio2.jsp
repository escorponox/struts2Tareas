<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Data Insert</title>
</head>
<body>

<s:if test="errorMessages.size()>0">
    <label>Action Errors</label>
    <ul><s:actionerror/></ul>
</s:if>

<s:if test="errors.size()>0">
    <label>Field Errors</label>
    <ul><s:fielderror/></ul>
</s:if>

<s:form action="ejercicio2b" method="post">
    <s:label>User Data Insert Form</s:label>
    <s:textfield name="userId" id="userId" label="User"/>
    <s:password name="password" id="password" label="Password"/>
    <s:textfield name="name" id="name" label="Name"/>
    <s:radio list="sexes" label="Sex" id="sex" name="sex"/>
    <s:textfield name="age" id="age" label="Age" size="3"/>
    <s:textfield name="birthday" id="birthday" label="Birthday (dd/mm/yyyy)"/>
    <s:textfield name="email" id="email" label="e-mail"/>
    <s:textfield name="phone" id="phone" label="Phone (999-999-999)"/>
    <s:textfield name="url" id="url" label="url"/>
    <s:textarea name="presentation" id="presentation" label="Presentation" cols="20" rows="5"/>
    <s:checkbox name="wireFan" id="wireFan" label="'The Wire' Fan"/>
    <s:select list="sagas" name="saga" label="Favourite Saga" value="defaultSagas">
        <s:optgroup list="subSagas" label="Teenager"/>
    </s:select>
    <s:checkboxlist list="checklist" name="check" label="Checklist" id="checklist"/>
    <s:submit value="Submit"/>
    <s:reset/>
</s:form>

</body>
</html>