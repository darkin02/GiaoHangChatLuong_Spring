<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<form class="login100-form validate-form" method="post" action="<c:url value='/login/forgetpassword'/>">
    <span class="login100-form-title p-b-43">
        Nhập Số Điện Thoại
    </span>
    <div class="wrap-input100 validate-input" data-validate="Nhập dúng số điện thoại">
        <input class="input100" type="number" name="sdt">
        <span class="focus-input100"></span>
        <span class="label-input100">Số điện thoại</span>
    </div>
    <div class="container-login100-form-btn">
        <button class="login100-form-btn">
            Xác Nhận
        </button>
    </div>
</form>
