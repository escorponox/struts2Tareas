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
    <s:form method="POST" action="carga" enctype="multipart/form-data">
        <s:file name="file" id="fichero" label="Fichero"/>
        <s:submit value="Subir fichero"/>
    </s:form>
    <s:if test="errors.size()>0">
        <ul>
            <s:fielderror/>
        </ul>
    </s:if>


    <label>Resultados</label>
    <table id="tablaResultados">
        <tr>
            <td>Fichero</td>
            <td><s:property value="fileFileName"/></td>
        </tr>

    </table>
</head>
<body>

</body>
</html>
