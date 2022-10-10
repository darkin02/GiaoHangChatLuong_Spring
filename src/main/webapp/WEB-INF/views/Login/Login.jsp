<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<form class="login100-form validate-form" method="post">
    <span class="login100-form-title p-b-43">
        Đăng Nhập Để Tiếp Tục
    </span>
    <c:if test="${error ne null}">
        <div id="AlertBox" class="alert">
                ${error}
        </div></c:if>
    <div class="wrap-input100 validate-input" data-validate="Số điện thoại không được để trống!">
        <input class="input100" type="text" name="sDT">
        <span class="focus-input100"></span>
        <span class="label-input100">Số Điện Thoại</span>
    </div>
    <div class="wrap-input100 validate-input" data-validate="Password is required">
        <input class="input100" type="password" name="password">
        <span class="focus-input100"></span>
        <span class="label-input100">Mật Khẩu</span>
    </div>
    <div class="flex-sb-m w-full p-t-3 p-b-32">
        <div class="contact100-form-checkbox">
            <input class="input-checkbox100" id="ckb1" type="checkbox" name="RememberMe">
            <label class="label-checkbox100" for="ckb1">
                ghi nhớ
            </label>
        </div>

        <div>
            <a href="<c:url value="forgetpassword"/>" class="txt1">
                Quên mật khẩu?
            </a>
        </div>
    </div>
    <div class="container-login100-form-btn">
        <button class="login100-form-btn">
            Đăng Nhập
        </button>
    </div>
    <div class="container-login100-form-btn">
        <button class="register100-form-btn" type="button" onclick="window.location.href='register'"/>
        Đăng Ký
        </button>
    </div>
    <div class="content">
        <ul>
            <li>
                Phủ sóng 99% huyện xã
                <span>
                    Lấy hàng / Giao hàng trên 11.000 huyện xa trên toàn quốc
                </span>
            </li>
            <li>
                Giao nhanh không kịp hủy
                <span>Giao nội tỉnh 6-12h</span>
                <span>Giao nội miền 24-36h</span>
                <span>Giao liên miền 48h</span>
            </li>
            <li>
                Giao hàng linh hoạt
                <span>
                    Linh hoạt giao hàng cho khách chọn, đổi địa chỉ giao, đổi tiền CoD, đổi SĐT, đổi người nhận hàng,…
                </span>
            </li>
            <li>
                Miễn phí thu hộ tiền
            </li>
        </ul>
    </div>
</form>

