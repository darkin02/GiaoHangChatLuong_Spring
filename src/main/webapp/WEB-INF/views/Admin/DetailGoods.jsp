<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<h2 class="header-elements">CHI TIẾT THÔNG TIN HÀNG HOÁ</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr />
    <dl class="dl-horizontal">
        <p><strong>Tên hàng hóa: </strong><label>${TenHH}</label></p>
        <p><strong>Mô tả: </strong><label>${MoTa}</label></p>
        <p><strong>Đơn vị tính: </strong><label>${DonVT}</label></p>
        <p><strong>Mã LHH: </strong><label>${MaLHH}</label></p>
        <p><strong>Giá tiền: </strong><label>${GiaTien}</label></p>

    </dl>
</div>
<style>
    .dl-horizontal {
        margin-left: 20px;
    }
</style>

<p class="actionDesign">
    <a href="<c:url value="editgoods/${model.id}"/>">
        <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexgoods"/>">
        <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>

<style>
    .actionDesign {
        margin-left: 20px;
    }
</style>