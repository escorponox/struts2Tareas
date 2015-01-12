<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Carga de Fichero</title>
</head>
<body>

<label>Resultados</label>
<table id="tablaResultados">
    <tr>
        <td>Nombre</td>
        <td><s:property value="name"/></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><s:property value="age"/></td>
    </tr>
    <tr>
        <td>Url</td>
        <td><s:a href="%{url}">Url</s:a></td>
    </tr>
    <tr>
        <td>Bean</td>
        <td><s:bean name="actions.Bean" id="bean">
            <s:param name="id" value="1"/>
            <s:param name="property" value="'hola bean'"/>
        </s:bean>
            <s:property value="#bean.property"/>
        </td>
    </tr>
    <tr>
        <td>Birthday</td>
        <td><s:date name="birthday" format="dd/MM/yyy"/></td>
    </tr>
    <tr>
        <td>New Age</td>
        <td><s:set name="newage" value="age"/>
            <s:property value="#newage"/></td>
    </tr>
    <tr>
        <td>Back</td>
        <td><s:url id="mostrarUrl" action="ejercicio2">
            <s:param name="userId" value="%{userId}"/>
            <s:param name="name" value="%{name}"/>
        </s:url>
            <s:a href="%{mostrarUrl}">Pasar el userId y el name</s:a>
        </td>
    </tr>
    <s:iterator value="sagas" var="items">
        <tr>
            <td><s:property value="#items.key"/></td>
            <td>
                <s:property value="#items.value"/></td>
        </tr>
    </s:iterator>

    <s:append var="appended">
        <s:param value="sexes"/>
        <s:param value="checklist"/>
    </s:append>
    <s:iterator value="appended" var="items">
        <tr>
            <td><s:property value="#items.key"/></td>
            <td>
                <s:property value="#items.value"/></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>