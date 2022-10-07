<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">SỬA NHÂN VIÊN</h2>

<form id="formAuthentication" class="mb-3" method="post">
    <div class="form-horizontal">
        <hr />
        <div class="form-group">
            <strong>Tên nhân viên</strong>
            <div class="col-md-10">
                <input type="date" class="form-control" id="TenNV" name="TenNV" placeholder="Tên nhân viên" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Ngày sinh</strong>
            <div class="col-md-10">
                <input type="number" class="form-control" id="NgaySinh" name="NgaySinh" placeholder="Ngày sinh" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Địa chỉ</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="DiaChi" name="DiaChi" placeholder="Địa chỉ" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Chức vụ</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="ChucVu" name="ChucVu" placeholder="Chức vụ" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Bậc lương</strong>
            <div class="col-md-10">
                <input type="date" class="form-control" id="BacLuong" name="BacLuong" placeholder="Bậc lương" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Phòng ban</strong>
            <div class="col-md-10">
                <input type="number" class="form-control" id="MaPB" name="MaPB" placeholder="Phòng ban" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Số điện thoại</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="SDT" name="SDT" placeholder="Số điện thoại" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Giới tính</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="GioiTinh" name="GioiTinh" placeholder="Giới tính" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Nhà kho</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="MaNK" name="MaNK" placeholder="Nhà kho" autofocus />
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
                <a href="<c:url value="indexstaff"/>">
                    <i class="btn btn-info btn-sm">Trở lại</i>
                </a>
            </div>
        </div>
    </div>
</form>


<style>
    .header-elements {
        margin: 20px;
    }
    .form-horizontal {
        margin-left: 20px;
    }
</style>

