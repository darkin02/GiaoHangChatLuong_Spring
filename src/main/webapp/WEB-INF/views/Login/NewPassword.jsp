
<form class="login100-form validate-form" method="post">
    <span class="login100-form-title p-b-43">
        Đổi Mật Khẩu
    </span>
  <div class="wrap-input100 validate-input" data-validate="Số điện thoại không được để trống!">
    <input class="input100" type="text" name="Pass">
    <span class="focus-input100"></span>
    <span class="label-input100">Mật khẩu</span>
  </div>
  <div class="wrap-input100 validate-input" data-validate="Password is required">
    <input class="input100" type="password" name="AgainPass">
    <span class="focus-input100"></span>
    <span class="label-input100">Nhập lại mật khẩu</span>
  </div>
  <div class="container-login100-form-btn">
    <button class="login100-form-btn">
      Xác nhận
    </button>
    @if (Session["successChangePass"] != null)
    {
    <button type="button" onclick="location.href='index'" class="login100-form-btn">
    Đăng Nhập
    </button>
    }
  </div>
</form>
