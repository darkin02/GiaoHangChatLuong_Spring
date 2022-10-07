<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">DANH SÁCH KHÁCH HÀNG</h2>

<a href="<c:url value="createcustomer"/> ">
    <i class="btn btn-success btn-sm">Thêm mới</i>
</a>

<table class="table">
    <tr>
        <th>
            <strong>Mã khách hàng</strong>
        </th>
        <th>
            <strong>Tên khách hàng</strong>
        </th>
        <th>
            <strong>SDT</strong>
        </th>
        <th>
            <strong>Địa chỉ</strong>
        </th>
        <th>
            <strong>Giới tính</strong>
        </th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${list}" >
        <tr>
            <td>
                <p>${item.maKH}</p>
            </td>
            <td>
                <p>${item.tenKH}</p>
            </td>
            <td>
                <p>${item.sdt}</p>
            </td>
            <td>
                <p>${item.diaChi}</p>
            </td>
            <td>
                <p>${item.gioiTinh}</p>
            </td>
            <td>
                <a href="<c:url value="editcustomer/${item.maKH}"/>">
                <i class="fa fa-edit btn btn-info btn-sm">Chỉnh sửa</i>
                </a> |
                <a href="<c:url value="detailcustomer/${item.maKH}"/>">
                    <i class="btn btn-warning btn-sm">Chi tiết</i>
                </a> |
                <a href="<c:url value="deletecustomer/${item.maKH}"/>">
                    <i class="btn btn-danger btn-sm">Xoá</i>
                </a>
            </td>
        </tr>
    </c:forEach>

</table>

<style>
    .header-elements {
        margin: 20px;
    }

    .textDesign {
        margin-left: 20px;
    }

    .btn-success {
        margin-left: 20px;
    }
</style>
