<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<h2 class="header-elements">CHỈNH SỬA THÔNG TIN KHÁCH HÀNG</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>



<form id="formAuthentication" class="mb-3" method="post">
    <div class="form-horizontal">
        <hr />
        <div class="form-group">
            <strong>Tên khách hàng</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="TenKH" name="TenKH" placeholder="Tên khách hàng" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Số điện thoại</strong>
            <div class="col-md-10">
                <input type="number" class="form-control" id="SDT" name="SDT" placeholder="Số điện thoại" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Địa chỉ</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="DiaChi" name="DiaChi" placeholder="Địa chỉ" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Giới tính</strong>
            <div class="col-md-10">
                <input type="checkbox" class="form-control" id="GioiTinh" name="GioiTinh" placeholder="Giới tính" autofocus />
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
                <a href="<c:url value="indexcustomer"/>">
                    <i class="btn btn-info btn-sm">Trở lại</i>
                </a>
            </div>
        </div>
    </div>
</form>
<style>
    .form-horizontal {
        margin-left: 20px;
    }
</style>}
