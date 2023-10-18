<%--@elvariable id="pathToCoat" type="java.lang.String"--%>
<%--@elvariable id="countryName" type="java.lang.String"--%>
<%--@elvariable id="cityName" type="java.lang.String"--%>
<%--@elvariable id="coatOfArms" type="java.lang.String"--%>
<%--@elvariable id="population" type="java.lang.String"--%>
<%--@elvariable id="description" type="java.lang.String"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>City Info</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="main-container">
    <h1>${cityName}, ${countryName}</h1>
    <img class="img-fluid" style="width: 130px; height: 180px" src="${pathToCoat}" alt="City coat image"/>
    <p><strong>Population:</strong> ${population}</p>
    <p><strong>Description:</strong> ${description}</p>
</div>
</body>
</html>