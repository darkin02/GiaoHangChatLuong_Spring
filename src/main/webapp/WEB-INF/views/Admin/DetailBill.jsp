<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h2 class="header-elements">CHI TIẾT HÓA ĐƠN</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr/>
    <dl class="dl-horizontal">
        <p><strong>Số hóa đơn: </strong><label>${hd.SoHD}</label></p>
        <p><strong>Ngày lập: </strong><label>${hd.NgayLapHD}</label></p>
        <p><strong>Tổng tiền: </strong><label>${hd.TongTien}</label></p>
        <p><strong>Mã nhân viên: </strong><label>${hd.MaNV}</label></p>
        <p><strong>Mã tuyến đường: </strong><label>${hd.MaTD}</label></p>
    </dl>
</div>

<p class="actionDesign">
    <a href="<c:url value="editbill/${model.id}"/>">
        <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexbilll"/>">
        <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>
<style>
    .actionDesign {
        margin-left: 20px;
    }
</style>