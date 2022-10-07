<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"
      class="light-style customizer-hide"
      dir="ltr"
      data-theme="theme-default"
      data-assets-path="<c:url value='/Resources/Admin/assets'/>"
      data-template="vertical-menu-template-free">
<head>
    <meta charset="utf-8" />
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />

    <title>Đăng nhập</title>

    <meta name="description" content="" />

    <!-- Favicon -->
    <link rel="icon" type="image/x-icon" href="https://scontent.xx.fbcdn.net/v/t1.15752-9/289919198_1031035434451524_4239668574185608115_n.png?_nc_cat=100&ccb=1-7&_nc_sid=aee45a&_nc_ohc=O1MGbP6MvHYAX-CuCP5&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AVKub3Z84-lsKuVIfsPo1prdX0h7t5lr-ebNgAzFufhpEA&oe=62E3C957" />

    <!-- Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
          rel="stylesheet" />
    <style>
        #root ~ div, center {
            display: none !important;
        }
    </style>
    <!-- Icons. Uncomment required icon fonts -->
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/vendor/fonts/boxicons.css'/>" />

    <!-- Core CSS -->
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/vendor/css/core.css" class="template-customizer-core-css'/>" />
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/vendor/css/theme-default.css'/>" class="template-customizer-theme-css" />
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/css/demo.css'/>" />

    <!-- Vendors CSS -->
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css'/>" />

    <!-- Page CSS -->
    <!-- Page -->
    <link rel="stylesheet" href="<c:url value='/Resources/Admin/assets/vendor/css/pages/page-auth.css'/>" />
    <!-- Helpers -->
    <script src="<c:url value='/Resources/Admin/assets/vendor/js/helpers.js'/>"></script>

    <!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->
    <!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->
    <script src="<c:url value='/Resources/Admin/assets/js/config.js'/>"></script>
</head>

<body>
<!-- Content -->
<div id="root">
    <div class="container-xxl">
        <div class="authentication-wrapper authentication-basic container-p-y">
            <div class="authentication-inner">
                <!-- Register -->
                <div class="card">
                    <div class="card-body">
                        <!-- Logo -->
                        <div class="app-brand justify-content-center">
                            <a href="index.html" class="app-brand-link gap-2">
                                    <span class="app-brand-logo demo">
                                        <img src="https://scontent.xx.fbcdn.net/v/t1.15752-9/285481094_589074539164207_7432184863322530013_n.png?stp=dst-png_p206x206&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=EV0O0aLQeCoAX-WrwFM&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AVIgpCpuBaWUN6hlPPok1tI1A-p8A_kNaDCimbvtwwVa-w&oe=62CB2106" alt="">
                                    </span>
                            </a>
                        </div>
                        <!-- /Logo -->
                        <h4 class="mb-2">Quên mật khẩu 👋</h4>
                        <p class="mb-4">Vui lòng nhập Email của bạn</p>
<%--                        @if (TempData["AlretMessage"] != null)--%>
<%--                        {--%>
<%--                        <div id="AlertBox" class="alert @TempData["AlretType"] hide">--%>
<%--                        @TempData["AlretMessage"]--%>
<%--                    </div>}--%>
                    <form id="formAuthentication" class="mb-3" method="post">
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="text" class="form-control" id="email" name="Email" placeholder="Email" autofocus />
                        </div>
                        <div class="mb-3">
                            <button class="btn btn-primary d-grid w-100" type="submit">Xác nhận</button>
                        </div>
                    </form>
                </div>
            </div>
            <!-- /Register -->
        </div>
    </div>
</div>
    <!-- / Content -->
    <!-- Core JS -->
    <!-- build:js assets/vendor/js/core.js -->
    <script src="<c:url value='/Resources/Admin/assets/vendor/libs/jquery/jquery.js'/>"></script>
    <script src="<c:url value='/Resources/Admin/assets/vendor/libs/popper/popper.js'/>"></script>
    <script src="<c:url value='/Resources/Admin/assets/vendor/js/bootstrap.js'/>"></script>
    <script src="<c:url value='/Resources/Admin/assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js'/>"></script>

    <script src="<c:url value='/Resources/Admin/assets/vendor/js/menu.js'/>"></script>
    <!-- endbuild -->
    <!-- Vendors JS -->
    <!-- Main JS -->
    <script src="<c:url value='/Resources/Admin/assets/js/main.js'/>"></script>

    <!-- Page JS -->
    <!-- Place this tag in your head or just before your close body tag. -->
    <script async defer src="https://buttons.github.io/buttons.js"></script>
</div>
</body>
</html>

