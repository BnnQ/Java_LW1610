<%--@elvariable id="history" type="java.lang.String"--%>
<%--@elvariable id="cityName" type="java.lang.String"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>History</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="h-100 d-flex flex-column align-items-center justify-content-center">
    <div class="container">
        <h1>History of ${cityName}</h1>
        <p class="fs-5">${history}</p>

        <%--@elvariable id="images" type="java.lang.String[]"--%>
        <c:forEach var="image" items="${images}">
            <img src="${image}" class="img-fluid" style="width: 429px; height: 275px;" alt="Responsive image">
        </c:forEach>

        <ul class="nav-menu">
            <%--@elvariable id="links" type="java.util.ArrayList"--%>
            <c:forEach var="link" items="${links}">
                <li><a class="link-light" href="${link}">${link}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>