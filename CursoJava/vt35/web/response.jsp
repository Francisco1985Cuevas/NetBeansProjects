 <%-- 
    Document   : response
    Created on : 12/02/2020, 05:11:23 PM
    Author     : francisco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IFPWAFCAD - {placeholder}</title>
        <link rel="stylesheet" type="text/css" href="style.css" /><link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <sql:query var="counselorQuery" dataSource="jdbc/vt35">
            SELECT *
            FROM subject s, counselor c
            WHERE s.counselor_idfk = c.counselor_id
            AND s.subject_id = <sql:param value="${param.subject_id}"></sql:param>
        </sql:query>
        <c:set var="counselorDetails" value="${counselorQuery.rows[0]}"></c:set>
        
        <table border='0'>
            <thead>
                <tr>
                    <th colspan="2">${counselorDetails.name}</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><strong>Descripcion:</strong></td>
                    <td><span style="font-size: smaller; font-style: italic;">${counselorDetails.description}</span></td>
                </tr>
                <tr>
                    <td><strong>Counselor:</strong></td>
                    <td>
                        ${counselorDetails.first_name} ${counselorDetails.nick_name} ${counselorDetails.last_name} 
                        <br> 
                        <span style="font-size: smaller; font-style: italic;">
                                miembro desde: ${counselorDetails.member_since}
                        </span> 
                    </td>
                </tr>
                <tr>
                    <td><strong>Detalles contacto:</strong></td>
                    <td>
                        <strong>email:</strong> <a href="mailto:{counselorDetails.email}">{counselorDetails.email}</a>
                        <br> <strong>phone:</strong>{counselorDetails.telephone}
                    </td>
                </tr>
            </tbody>
        </table>
        
    </body>
</html>
