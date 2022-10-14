<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <meta charset="utf-8">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">
    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="https://scontent.xx.fbcdn.net/v/t1.15752-9/289919198_1031035434451524_4239668574185608115_n.png?_nc_cat=100&ccb=1-7&_nc_sid=aee45a&_nc_ohc=O1MGbP6MvHYAX-CuCP5&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AVKub3Z84-lsKuVIfsPo1prdX0h7t5lr-ebNgAzFufhpEA&oe=62E3C957" />
    <!-- Libraries Stylesheet -->
    <link href="<c:url value='/Resources/js/lib/owlcarousel/assets/owl.carousel.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/Resources/css/Content/style.css'/>" rel="stylesheet">
    <!-- Customized Bootstrap Stylesheet -->
    <title>@ViewBag.Title</title>
</head>
<body>
<!-- Topbar Start -->
<div class="container-fluid bg-dark">
    <div class="row py-2 px-lg-5">
        <div class="col-lg-6 text-center text-lg-left mb-2 mb-lg-0">
            <div class="d-inline-flex align-items-center text-white">
                <small><i class="fa fa-phone-alt mr-2"></i>+84961778731</small>
                <small class="px-3">|</small>
                <small><i class="fa fa-envelope mr-2"></i>lthuan300@gmail.com</small>
            </div>
        </div>
        <div class="col-lg-6 text-center text-lg-right">
            <div class="d-inline-flex align-items-center">
                <c:if test="${UserName ne null}">
                    <i class="fa fa-user-circle" aria-hidden="true"></i>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link" data-toggle="dropdown">${UserName}</a>
                        <div class="dropdown-menu rounded-0 m-0">
                            <a href="blog.html" class="dropdown-item">Thông Tin</a>
                            <a class="dropdown-item" href="<c:url value=""/>">Đăng Xuất</a>
                        </div>
                    </div></c:if>
                <a class="text-white px-2" href="https://www.facebook.com/mcuongbush">
                    <i class="fab fa-facebook-f"></i>
                </a>
                <a class="text-white px-2" href="">
                    <i class="fab fa-twitter"></i>
                </a>
                <a class="text-white px-2" href="">
                    <i class="fab fa-linkedin-in"></i>
                </a>
                <a class="text-white px-2" href="">
                    <i class="fab fa-instagram"></i>
                </a>
                <a class="text-white pl-2" href="">
                    <i class="fab fa-youtube"></i>
                </a>
            </div>
        </div>
    </div>
</div>
<!-- Topbar End -->
<!-- Navbar Start -->
<div class="container-fluid p-0 top-bar">
    <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-lg-5">
        <a href="<c:url value="/"/>" class="navbar-brand ml-lg-3">
            <h1 class="m-0 display-5 text-uppercase Title"><img src="<c:url value='/Resources/img/logo1.png'/>">GHChatLuong</h1>
        </a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-between px-lg-3" id="navbarCollapse">
            <div class="navbar-nav m-auto py-0">
                <a class="nav-item nav-link" href="<c:url value="/"/>">Trang Chủ</a>
                <a class="nav-item nav-link" href="<c:url value="about"/>">Về chúng tôi</a>
                <a class="nav-item nav-link" href="<c:url value="service"/>">Dịch Vụ</a>
                <a class="nav-item nav-link" href="<c:url value="price"/>">Giá</a>
                <a class="nav-item nav-link" href="<c:url value="blog/1"/>">Blog Tin Tức</a>
                <a class="nav-item nav-link" href="<c:url value="contact"/>">Bản đồ</a>
            </div>
            <a href="<c:url value="request"/>" class="btn btn-primary py-2 px-4 d-none d-lg-block">Gửi hàng</a>
        </div>
    </nav>
</div>
<!-- Navbar End -->
<div>
    <dec:body/>
</div>
<!-- Footer Start -->
<div class="container-fluid bg-dark text-white mt-5 py-5 px-sm-3 px-md-5">
    <div class="row pt-5">
        <div class="col-lg-7 col-md-6">
            <div class="row">
                <div class="col-md-6 mb-5">
                    <h3 class="text-primary mb-4">Liên Lạc</h3>
                    <p><i class="fa fa-map-marker-alt mr-2"></i>59/158 Đường 102, P.Tăng Nhơn Phú A, Quận 9</p>
                    <p><i class="fa fa-phone-alt mr-2"></i>+84961778731</p>
                    <p><i class="fa fa-envelope mr-2"></i>lthuan300@gmail.com</p>
                    <div class="d-flex justify-content-start mt-4">
                        <a class="btn btn-outline-light btn-social mr-2" href="https://www.facebook.com/profile.php?id=100014973210247"><i class="fab fa-twitter"></i></a>
                        <a class="btn btn-outline-light btn-social mr-2" href="https://www.facebook.com/profile.php?id=100014973210247"><i class="fab fa-facebook-f"></i></a>
                        <a class="btn btn-outline-light btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                        <a class="btn btn-outline-light btn-social" href="https://www.instagram.com/darkin_02/"><i class="fab fa-instagram"></i></a>
                    </div>
                </div>
                <div class="col-md-6 mb-5">
                    <h3 class="text-primary mb-4">Đường Dẫn Nhanh</h3>
                    <div class="d-flex flex-column justify-content-start">
                        <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Trang chủ</a>
                        <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Về chúng tôi</a>
                        <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Dịch vụ</a>
                        <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Giá</a>
                        <a class="text-white" href="#"><i class="fa fa-angle-right mr-2"></i>Liên hệ</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-5 col-md-6 mb-5">
            <h3 class="text-primary mb-4">Bản Tin</h3>
            <p>Hãy đăng ký Email của bạn để nhận các tin tức, khuyến mãi sớm nhất từ chúng tôi.</p>
            <div class="w-100">
                <div class="input-group">
                    <input type="text" class="form-control border-light" style="padding: 30px;" placeholder="Email của bạn">
                    <div class="input-group-append">
                        <button class="btn btn-primary px-4">Đăng Ký</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid bg-dark text-white border-top py-4 px-sm-3 px-md-5" style="border-color: #3E3E4E !important;">
    <div class="row">
        <div class="col-lg-6 text-center text-md-left mb-3 mb-md-0">
            <p class="m-0 text-white">
                &copy; <a href="#">GiaoHangTietKiem</a>. Công Ty cổ phần 4 thành viên.

                <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/-->
                <a href="https://htmlcodex.com">TCTT</a>
            </p>
        </div>
        <div class="col-lg-6 text-center text-md-right">
            <ul class="nav d-inline-flex">
                <li class="nav-item">
                    <a class="nav-link text-white py-0" href="#">Riêng tư</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white py-0" href="#">Điều kiện</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white py-0" href="#">Câu hỏi</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white py-0" href="#">Trợ giúp</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- Footer End -->
<!-- Back to Top -->
<a href="#" class="btn btn-lg btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="<c:url value='/Resources/js/lib/easing/easing.min.js'/>"></script>
<script src="<c:url value='/Resources/js/lib/waypoints/waypoints.min.js'/>"></script>
<script src="<c:url value='/Resources/js/lib/counterup/counterup.min.js'/>"></script>
<script src="<c:url value='/Resources/js/lib/owlcarousel/owl.carousel.min.js'/>"></script>

<!-- Contact Javascript File -->
<script src="<c:url value='/Resources/js/Scripts/mail/jqBootstrapValidation.min.js'/>" ></script>
<script src="<c:url value='/Resources/js/Scripts/mail/contact.js'/>"></script>

<!-- Template Javascript -->
<script src="<c:url value='/Resources/js/Scripts/main.js'/>"></script>
<script>
    $(document).ready(function () {
        var topmenu = $(".bg-light");
        var dichtop = $(".top-bar");
        var title = $(".Title");
        $(window).scroll(function () {
            if ($(this).scrollTop() > 50) {
                let chieucao = $(".bg-dark").height();
                dichtop.css("margin-top", -chieucao);
                dichtop.addClass('dichtop');
                topmenu.addClass('Sticky');
                title.removeClass('Title');
            }
            else {
                dichtop.css("margin-top", "0px");
                dichtop.removeClass('dichtop');
                topmenu.removeClass('Sticky');
                title.addClass('Title');
            }
        });
    });
</script>
<script>
    $(document).ready(function () {

        // Gets the video src from the data-src on each button

        var $videoSrc;
        $('.video-btn').click(function () {
            $videoSrc = $(this).data("src");
        });
        console.log($videoSrc);
        // when the modal is opened autoplay it
        $('#myModal').on('shown.bs.modal', function (e) {

            // set the video src to autoplay and not to show related video. Youtube related video is like a box of chocolates... you never know what you're gonna get
            $("#video").attr('src', $videoSrc + "?autoplay=1&amp;modestbranding=1&amp;showinfo=0");
        })

        // stop playing the youtube video when I close the modal
        $('#myModal').on('hide.bs.modal', function (e) {
            // a poor man's stop video
            $("#video").attr('src', $videoSrc);
        });
    });
</script>

</body>

</html>
