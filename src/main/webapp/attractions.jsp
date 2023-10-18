<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Attractions</title>
    <%@include file="layout.jsp" %>
    <style>
        .card {
            height: 450px;
            object-fit: cover;
        }

        .card-img-top {
            width: 100%;
            height: 200px;
            object-fit: cover;
        }

        .btn-outline-dark:hover {
            color: black !important;
            background-color: #eee !important;
        }
    </style>
</head>
<body>
<div class="slick-carousel">
    <%--@elvariable id="attractions" type="java.util.ArrayList"--%>
    <c:forEach var="attraction" items="${attractions}">
        <div class="d-flex align-items-center justify-content-center">
            <div class="card" style="width: 27rem;">
                <img src="${attraction.pathToImage}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${attraction.name}</h5>
                    <p class="card-text">${attraction.description}</p>
                </div>
                <div class="card-footer">
                    <a
                            href="${attraction.linkToDetails}"
                            class="btn btn-outline-dark d-flex justify-content-center align-items-center fw-bold"
                            style="font-size: 18px"
                    >
                        <img src="wwwroot/images/wikipedia.svg" alt="icon" style="width: 24px; height: 24px;" class="me-1"/>
                        See details
                    </a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

<script>
    $(document).ready(function() {
        $('.slick-carousel').slick({
            infinite: true,
            slidesToShow: 3,
            slidesToScroll: 1,
            arrows: true,
            draggable: false,
            dots: false
        });
    });
</script>

</body>
</html>