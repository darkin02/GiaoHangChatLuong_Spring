<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">DANH SÁCH HOÁ ĐƠN VẬN CHUYỂN</h2>

<a href="<c:url value="createbill"/> ">
<i class="btn btn-success btn-sm">Thêm mới</i>
</a>

<table class="table">
    <tr>
        <th>
            <strong>Số hóa đơn</strong>
        </th>
        <th>
            <strong>Ngày lập</strong>
        </th>
        <th>
            <strong>Tổng tiền</strong>
        </th>
        <th>
            <strong>Tiền vận chuyển</strong>
        </th>
        <th>
            <strong>Mã nhân viên</strong>
        </th>
        <th>
            <strong>Mã tuyến đường</strong>
        </th>
        <th>
            <strong>COD</strong>
        </th>
        <th>
            <strong>Mã tuyến đường</strong>
        </th>
        <th>
            <strong>Mã loại vận chuyển</strong>
        </th>
        <th>
            <strong>Mã khách hàng</strong>
        </th>
        <th>
            <strong>Mã khách nhận</strong>
        </th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${list}" >
    <tr>
        <td>
            <c:out value="${item.NgayLapHD}"/>
            @Html.DisplayFor(modelItem => item.NgayLapHD)
        </td>
        <td>
            @Html.DisplayFor(modelItem => item.TongTien)
        </td>
        <td>
            @Html.DisplayFor(modelItem => item.SoPGH)
        </td>
        <td>
            @Html.DisplayFor(modelItem => item.MaNV)
        </td>
        <td>
            @Html.DisplayFor(modelItem => item.TrangThai)
        </td>
        <td>
            @Html.DisplayFor(modelItem => item.MaTD)
        </td>
        <td>
            <a href="@Url.Action("EditBill", "Admin", new { id = item.SoHD.Replace(" ", "") })">
            <i class="fa fa-edit btn btn-info btn-sm">Chỉnh sửa</i>
            </a> |
            <a href="@Url.Action("DetailsBill", "Admin", new { id = item.SoHD.Replace(" ", "") })">
            <i class="btn btn-warning btn-sm">Chi tiết</i>
            </a> |
            <a href="@Url.Action("DeleteBill", "Admin", new { id = item.SoHD.Replace(" ", "") })">
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
