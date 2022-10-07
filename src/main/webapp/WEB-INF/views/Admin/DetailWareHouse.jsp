<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<h2 class="header-elements">CHI TIẾT THÔNG TIN NHÀ KHO</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr/>
    <dl class="dl-horizontal">
        <p><strong>Tên nhà kho: </strong><label>${TenNK}</label></p>
        <p><strong>Diện tích: </strong><label>${DienTich}</label></p>
        <p><strong>Sức chứa: </strong><label>${SucChua}</label></p>
        <p><strong>Địa chỉ: </strong><label>${DiaChi}</label></p>
        <p><strong>Khu vực: </strong><label>${MaKV}</label></p>
    </dl>
</div>
<p class="actionDesign">
    <a href="<c:url value="editwarehouse/${model.id}"/>">
        <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexwarehouse"/>">
        <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>

<style>
    .actionDesign {
        margin-left: 20px;
    }
</style>