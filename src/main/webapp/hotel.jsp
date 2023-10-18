<%--@elvariable id="hotel" type="me.bnnq.labwork.models.Hotel"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>${hotel.name}</title>
    <%@include file="layout.jsp" %>
    <style>
        #body {
            background-color: #292929;
        }

        body {
            overflow-x: hidden;
        }

        .bg-image {
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
        }

        .description {
            max-height: 200px;
            overflow-y: hidden;
        }

        .description:hover {
            overflow-y: scroll;
        }

        .param-name {
            color: #f7403f;
            font-weight: 600;
        }

        .ff-UB {
            font-family: "Ubuntu-Bold", Arial, Helvetica, Calibri;
        }
    </style>
</head>
<body>
<div id="body" class="container-fluid">
    <div class="container-fluid min-vh-100 px-0">
        <div class="row bg-black">
            <div class="col-7 m-auto bg-image"
                 style="min-height: 350px; background-image: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.9)), url(${hotel.images[0]});">
            <div class="row">
                <div class="col-12 text-light ps-3 pe-3 pt-2 fs-4 text-uppercase fw-semibold">
                    ${hotel.name}
                </div>
                <div class="col-12 description text-justify text-light fs-14 py-3 mt-2 fw-semibold">
                    ${hotel.fullDescription}
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-8 m-auto">
            <div class="row">
                <div class="col-12 text-light text-center fw-semibold fs-3" style="border-bottom: 1px solid #4b4848">
                    Information
                </div>
                <div class="row">
                    <div class="col-6">
                        <div class="row no-gutters pr-md-5 text-light">
                            <div class="col-12 my-1">
                                <span class="param-name ff-UB">Address:&nbsp;</span>
                                ${hotel.address}
                            </div>
                            <div class="col-12 my-1">
                                <span class="param-name ff-UB">Phone number:&nbsp;</span>
                                ${hotel.phoneNumber}
                            </div>
                            <div class="col-12 my-1">
                                <span class="param-name ff-UB">Official site:&nbsp;</span>
                                <a class="link-secondary" href="${hotel.link}">${hotel.link}</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="slick-carousel">
                        <c:forEach var="image" items="${hotel.images}">
                            <img src="${image}" class="img-fluid" alt="...">
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<script>
    $(document).ready(function() {
        $('.slick-carousel').slick({
            infinite: true,
            slidesToShow: 3,
            slidesToScroll: 1,
            arrows: true,
            draggable: true,
            dots: false
        });
    });
</script>
</body>
</html>