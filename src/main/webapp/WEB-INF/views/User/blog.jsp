<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Header Start -->
<div class="jumbotron jumbotron-fluid mb-5">
    <div class="container text-center py-5">
        <h1 class="text-white display-3">Blog</h1>
    </div>
</div>
<!-- Header End -->
<!-- Blog Start -->
<div class="container py-5">
    <div class="row">
        <!-- Blog Grid Start -->
        <div class="col-lg-8">
            <div class="row">
                <c:forEach var="item" items="${list}" >
                <div class="col-md-12 mb-3">
                    <div class="position-relative">
                        <img class="img-fluid w-100" src="${item.link}" alt="" style="height: 350px;">
                        <div class="position-absolute bg-primary d-flex flex-column align-items-center justify-content-center rounded-circle"
                             style="width: 60px; height: 60px; bottom: -30px; right: 30px;">
                            <h4 class="font-weight-bold mb-n1">01</h4>
                            <small class="text-white text-uppercase">Jan</small>
                        </div>
                    </div>
                    <div class="bg-secondary" style="padding: 30px;">
                        <div class="d-flex mb-3">
                            <div class="d-flex align-items-center">
                                <img class="rounded-circle" style="width: 40px; height: 40px;" src="/GiaoHangChatLuong_war/Resources${item.author_Img}" alt="">
                                <a class="text-muted ml-2" href="">${item.author}</a>
                            </div>
                            <div class="d-flex align-items-center ml-4">
                                <i class="far fa-bookmark text-primary"></i>
                                <a class="text-muted ml-2" href="">Blog</a>
                            </div>
                        </div>
                        <h4 class="font-weight-bold mb-3 h4-tin">${item.title}</h4>
                        <p>${item.solution}</p>
                        <a class="border-bottom border-primary text-uppercase text-decoration-none" href="<c:url value="single"/>">Đọc Thêm</a>
                    </div>
                </div></c:forEach>
            </div>
            Trang @${PageNumber} / ${PageCount}
            <div>
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="Page navigation">
                            <ul class="pagination pagination-lg justify-content-center mb-0">
                                <li class="page-item">
                                    <c:if test="${PageNumber ne 1}">
                                <li class="page-item">
                                    <a class="page-link " href="<c:url value="${PageNumber-1}"/>">
                                    <span aria-hidden="true">&laquo;</span>
                                    <span class="sr-only">Previous</span>
                                    </a>
                                </li></c:if>
                                <c:if test="${PageNumber == 1}">
                                    <li class="page-item disabled">
                                        <a class="page-link" href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                    </li></c:if>
                                <c:forEach var = "i" begin = "1" end = "${PageCount}" >
                                    <c:if test="${PageNumber == i}">
                                    <li class="page-item active"><a class="page-link" href="<c:url value="${i}"/>">${i}</a></li></c:if>
                                    <c:if test="${PageNumber ne i}">
                                        <li class="page-item"><a class="page-link" href="<c:url value="${i}"/>">${i}</a></li></c:if>
                                </c:forEach>
                                    <c:if test="${PageNumber ne PageCount}"> <li class="page-item">
                                        <a class="page-link " href="<c:url value="${PageNumber +1}"/>" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                        <span class="sr-only">Next</span>
                                        </a>
                                    </li></c:if>
                                    <c:if test="${PageNumber == PageCount}"><li class="page-item disabled">
                                        <a class="page-link" href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </li></c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <!-- Blog Grid End -->
        <!-- Sidebar Start -->
        <div class="col-lg-4 mt-5 mt-lg-0">
            <!-- Search Form Start -->
            <div class="mb-5">
                <div class="bg-secondary" style="padding: 30px;">
                    <div class="input-group">
                        <input type="text" class="form-control border-0 p-4" placeholder="Từ khóa">
                        <div class="input-group-append">
                                <span class="input-group-text bg-primary border-primary text-white">
                                    <i class="fa fa-search"></i>
                                </span>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Search Form End -->
            <!-- Category Start -->
            <div class="mb-5">
                <h3 class="mb-4">Thể loại</h3>
                <div class="bg-secondary" style="padding: 30px;">
                    <ul class="list-inline m-0">
                        <li class="mb-1 py-2 px-3 bg-light d-flex justify-content-between align-items-center">
                            <a class="text-dark" href="#"><i class="fa fa-angle-right text-primary mr-2"></i>Về chúng tôi</a>
                            <span class="badge badge-secondary badge-pill">150</span>
                        </li>
                        <li class="mb-1 py-2 px-3 bg-light d-flex justify-content-between align-items-center">
                            <a class="text-dark" href="#"><i class="fa fa-angle-right text-primary mr-2"></i>Bí kiếp Shipper</a>
                            <span class="badge badge-secondary badge-pill">131</span>
                        </li>
                        <li class="mb-1 py-2 px-3 bg-light d-flex justify-content-between align-items-center">
                            <a class="text-dark" href="#"><i class="fa fa-angle-right text-primary mr-2"></i>Tin tức ngành</a>
                            <span class="badge badge-secondary badge-pill">78</span>
                        </li>
                        <li class="mb-1 py-2 px-3 bg-light d-flex justify-content-between align-items-center">
                            <a class="text-dark" href="#"><i class="fa fa-angle-right text-primary mr-2"></i>COD Start</a>
                            <span class="badge badge-secondary badge-pill">56</span>
                        </li>
                        <li class="py-2 px-3 bg-light d-flex justify-content-between align-items-center">
                            <a class="text-dark" href="#"><i class="fa fa-angle-right text-primary mr-2"></i>Dành cho shop</a>
                            <span class="badge badge-secondary badge-pill">98</span>
                        </li>
                    </ul>
                </div>
            </div>
            <!-- Category End -->
            <!-- Recent Post Start -->
            <div class="mb-5">
                <h3 class="mb-4">Bài đăng gần đây</h3>
                <div class="d-flex mb-3">
                    <img class="img-fluid" src="<c:url value='/Resources/img/blog-1.jpg'/>" style="width: 80px; height: 80px; object-fit: cover;" alt="">
                    <a href="" class="d-flex align-items-center bg-secondary text-dark text-decoration-none px-3" style="height: 80px;">
                        Mỗi đứa trẻ đều có trong mình một ước mơ.
                    </a>
                </div>
                <div class="d-flex mb-3">
                    <img class="img-fluid" src="<c:url value='/Resources/img/blog-2.jpg'/>" style="width: 80px; height: 80px; object-fit: cover;" alt="">
                    <a href="" class="d-flex align-items-center bg-secondary text-dark text-decoration-none px-3" style="height: 80px;">
                        Mỗi đứa trẻ đều có trong mình một ước mơ.
                    </a>
                </div>
                <div class="d-flex mb-3">
                    <img class="img-fluid" src="<c:url value='/Resources/img/blog-1.jpg'/>" style="width: 80px; height: 80px; object-fit: cover;" alt="">
                    <a href="" class="d-flex align-items-center bg-secondary text-dark text-decoration-none px-3" style="height: 80px;">
                        Mỗi đứa trẻ đều có trong mình một ước mơ.
                    </a>
                </div>
                <div class="d-flex mb-3">
                    <img class="img-fluid" src="<c:url value='/Resources/img/blog-2.jpg'/>" style="width: 80px; height: 80px; object-fit: cover;" alt="">
                    <a href="" class="d-flex align-items-center bg-secondary text-dark text-decoration-none px-3" style="height: 80px;">
                        Mỗi đứa trẻ đều có trong mình một ước mơ.
                    </a>
                </div>
                <div class="d-flex mb-3">
                    <img class="img-fluid" src="<c:url value='/Resources/img/blog-1.jpg'/>" style="width: 80px; height: 80px; object-fit: cover;" alt="">
                    <a href="" class="d-flex align-items-center bg-secondary text-dark text-decoration-none px-3" style="height: 80px;">
                        Mỗi đứa trẻ đều có trong mình một ước mơ.
                    </a>
                </div>
            </div>
            <!-- Recent Post End -->
            <!-- Image Start -->
            <div class="mb-5">
                <img src="<c:url value='/Resources/img/blog-1.jpg'/>" alt="" class="img-fluid">
            </div>
            <!-- Image End -->
            <!-- Tags Start -->
            <div class="mb-5">
                <h3 class="mb-4">Thẻ Tag</h3>
                <div class="d-flex flex-wrap m-n1">
                    <a href="" class="btn btn-secondary m-1">Shipper</a>
                    <a href="" class="btn btn-secondary m-1">Shop</a>
                    <a href="" class="btn btn-secondary m-1">Khuyến mãi</a>
                    <a href="" class="btn btn-secondary m-1">SEO</a>
                    <a href="" class="btn btn-secondary m-1">Cá nhân</a>
                    <a href="" class="btn btn-secondary m-1">Vận chuyển</a>
                </div>
            </div>
            <!-- Tags End -->
        </div>
        <!-- Sidebar End -->
    </div>
</div>
<!-- Blog End -->
