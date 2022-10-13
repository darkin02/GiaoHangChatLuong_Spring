<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<script src="<c:url value='/Resources/js/Scripts/vietnamlocalselectortest.js'/>"></script>
<script>
  var localpicker = new LocalPicker({
    province: "ls_province",
    district: "ls_district",
    ward: "ls_ward"
  });
</script>
<form class="login100-form validate-form" method="post" action="<c:url value="/login/register"/>" modelAttribute="DangKy" >
    <span class="login100-form-title p-b-43">
        Đăng Ký Tài Khoản
    </span>
  <c:if test="${error ne null}">
    <div id="AlertBox" class="alert">
        ${error}
    </div></c:if>
  <div class="wrap-input100 validate-input" data-validate="Họ tên là bắt buộc">
    <input class="input100" type="text" name="TenKH">
    <span class="focus-input100"></span>
    <span class="label-input100">Họ Tên</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="Số điện thoại là bắt buộc">
    <input class="input100" type="text" name="SDT">
    <span class="focus-input100"></span>
    <span class="label-input100">Số Điện Thoại</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="Tên tài khoản là bắt buộc">
    <input class="input100" type="text" name="UserName">
    <span class="focus-input100"></span>
    <span class="label-input100">Tên tài khoản</span>
  </div>
  <div class="gender">
    <span>Giới Tính:</span>
    <input checked="checked" name="GioiTinh" type="radio" value="Nam" />Nam
    <input name="GioiTinh" type="radio" value="Nữ" />Nữ
  </div>
  <div class="wrap-input100 validate-input">
    <select name="ls_province" id="ls_province" class="input100" style="
    height: 100%;border:none;"></select>
    <span class="focus-input100"></span>
    <span class="label-input100">Tỉnh/Thành phố</span>
  </div>
  <div class="wrap-input100 validate-input">
    <select name="ls_district" class="input100" style="
    height: 100%;border:none;"></select>
    <span class="focus-input100"></span>
    <span class="label-input100">Quận/Huyện</span>
  </div>
  <div class="wrap-input100 validate-input">
    <select name="ls_ward" class="input100" style="
    height: 100%;border:none;"></select>
    <span class="focus-input100"></span>
    <span class="label-input100">Xã/Phường</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="">
    <input class="input100" type="text" name="DiaChi" />
    <span class="focus-input100"></span>
    <span class="label-input100">Số nhà/Đường</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="Nhập sai định dạng Email: ex@abc.xyz">
    <input class="input100" type="text" name="Email" />
    <span class="focus-input100"></span>
    <span class="label-input100">Email</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="Mật khẩu là bắt buộc">
    <input class="input100" type="password" name="MatKhau" />
    <span class="focus-input100"></span>
    <span class="label-input100">Mật Khẩu</span>
  </div>
  <div class="container-login100-form-btn">
    <button class="login100-form-btn" type="submit">
      Đăng Ký
    </button>
  </div>
  <div class="container-login100-form-btn">
    <button class="register100-form-btn" type="button" onclick="<c:url value = '/login'/>">
    Đăng Nhập
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
  <script>
    // $("#ls_province").on('change', function (e) {
    //   $("#ls_province").val() = $("#ls_province option:selected").text();
    // });
  </script>
</form>

