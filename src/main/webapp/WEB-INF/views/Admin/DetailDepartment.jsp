<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h2 class="header-elements">CHI TIẾT THÔNG TIN PHÒNG BAN</h2>
<style>
    .header-elements {
        margin: 20px;
    }
</style>

<div>
    <hr/>
    <dl class="dl-horizontal">
        <p><strong>Tên phòng ban: </strong><label>${TenPPB}</label></p>
        <p><strong>Nhiệm vụ: </strong><label>${NhiemVu}</label></p>
    </dl>
</div>

<p class="actionDesign">
    <a href="<c:url value="editdepartment/${model.id}"/>">
    <i class="btn btn-info btn-sm">Sửa</i>
    </a>
    <a href="<c:url value="indexdepartment"/>">
    <i class="btn btn-info btn-sm">Trở lại</i>
    </a>
</p>
    <style>
    .actionDesign {
    margin-left: 20px;
    }
    </style>