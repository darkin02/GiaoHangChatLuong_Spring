<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h2 class="header-elements">CHI TIẾT THÔNG TIN KHÁCH NHẬN</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr />
    <dl class="dl-horizontal">
        <p><strong>Họ tên: </strong><label>${TenKN}</label></p>
        <p><strong>Số điện thoại: </strong><label>${SDT}</label></p>
        <p><strong>Địa chỉ: </strong><label>${DiaChi}</label></p>
        <p><strong>Giới tính: </strong><label>${GioiTinh}</label></p>
    </dl>
</div>
<p class="actionDesign">
    <a href="<c:url value="editrecipients/${model.id}"/>">
        <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexrecipients"/>">
        <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>

<style>
    .actionDesign {
        margin-left: 20px;
    }
</style>