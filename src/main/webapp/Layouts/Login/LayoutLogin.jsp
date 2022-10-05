<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>@ViewBag.Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="<c:url value='/Resources/img/icons/favicon.ico'/>" />
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/bootstrap/css/bootstrap.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/fonts/Linearicons-Free-v1.0.0/icon-font.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/animate/animate.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/css-hamburgers/hamburgers.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/animsition/css/animsition.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/select2/select2.min.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/vendor/daterangepicker/daterangepicker.css'/>">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/Content/Login/util.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/Resources/css/Content/Login/main.css'/>">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <style>
        #root ~ div, center {
            display: none !important;
        }
    </style>
    <!--===============================================================================================-->
</head>
<body style="background-color: #666666;">
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <dec:body/>
            <div class="login100-more">
                <img src="<c:url value='/Resources/img/Panel_giaohangchatluong.png'/>" alt="" style="width:100% ; height:100%;">
            </div>
        </div>
    </div>
</div>

<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/jquery/jquery-3.2.1.min.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/animsition/js/animsition.min.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/bootstrap/js/popper.js'/>"></script>
<script src="<c:url value='/Resources/css/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/select2/select2.min.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/daterangepicker/moment.min.js'/>"></script>
<script src="<c:url value='/Resources/css/vendor/daterangepicker/daterangepicker.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/css/vendor/countdowntime/countdowntime.js'/>"></script>
<!--===============================================================================================-->
<script src="<c:url value='/Resources/js/Scripts/login/main.js'/>"></script>
</body>
</html>



