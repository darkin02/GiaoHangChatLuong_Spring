<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<form class="login100-form validate-form" method="post" action="<c:url value="/login/confirmforgetpassword"/>">
    <span class="login100-form-title p-b-43">
        Xác nhận Email
    </span>
    <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
        <input class="input100" type="text" name="sms">
        <span class="focus-input100"></span>
        <span class="label-input100">Mã xác nhận</span>
    </div>
    <div class="container-login100-form-btn">
        <button class="login100-form-btn">
            Xác Nhận
        </button>
    </div>
</form>

