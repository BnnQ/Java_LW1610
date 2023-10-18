<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Hotels</title>
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
    <%--@elvariable id="hotels" type="me.bnnq.labwork.models.Hotel[]"--%>
    <c:forEach var="hotel" items="${hotels}">
        <div class="d-flex align-items-center justify-content-center">
            <div class="card" style="width: 27rem;">
                <img src="${hotel.images[0]}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${hotel.name}</h5>
                    <p class="card-text">${hotel.shortDescription}</p>
                </div>
                <div class="card-footer">
                    <a
                            href="hotel?id=${hotel.id}"
                            class="btn btn-outline-dark d-flex justify-content-center align-items-center fw-bold"
                            style="font-size: 18px"
                    >
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