<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Carga de Fichero</title>
</head>
<body>

<s:form method="POST" action="ejercicio2b" validate="true">
    <s:textfield name="nombre" label="Nombre"/>
    <s:textfield name="age" label="Age" size="20"/>

    <s:submit value="Submit"/>
</s:form>

<ul>
    <s:fielderror/>
</ul>


<label>Resultados</label>
<table id="tablaResultados">
    <tr>
        <td>Nombre</td>
        <td><s:property value="nombre"/></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><s:property value="age"/></td>
    </tr>

</table>

</body>
</html>