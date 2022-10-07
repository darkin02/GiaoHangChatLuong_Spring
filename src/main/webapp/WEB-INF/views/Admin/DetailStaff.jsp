<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h2 class="header-elements">CHI TIẾT THÔNG TIN NHÂN VIÊN</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr />
    <dl class="dl-horizontal">
        <p><strong>Họ tên: </strong><label>${TenNV}</label></p>
        <p><strong>Ngày sinh: </strong><label>${SDT}</label></p>
        <p><strong>Địa chỉ: </strong><label>${DiaChi}</label></p>
        <p><strong>Chức vụ: </strong><label>${ChucVu}</label></p>
        <p><strong>Bậc lương: </strong><label>${BacLuong}</label></p>
        <p><strong>Mã phòng ban: </strong><label>${MaPB}</label></p>
        <p><strong>SDT: </strong><label>${SDT}</label></p>
        <p><strong>Giới tính: </strong><label>${GioiTinh}</label></p>
        <p><strong>Mã nhà kho: </strong><label>${MaNK}</label></p>


    </dl>
</div>

<p class="actionDesign">
    <a href="<c:url value="editstaff/${model.id}"/>">
        <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexstaff"/>">
        <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>

<style>
    .actionDesign {
        margin-left: 20px;
    }
</style>