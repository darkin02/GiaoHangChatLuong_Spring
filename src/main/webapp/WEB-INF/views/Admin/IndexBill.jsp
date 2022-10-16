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
            <strong>Tên nhân viên</strong>
        </th>
        <th>
            <strong>Trạng thái</strong>
        </th>
        <th>
            <strong>COD</strong>
        </th>
        <th>
            <strong>Tuyến đường</strong>
        </th>
        <th>
            <strong>Loại vận chuyển</strong>
        </th>
        <th>
            <strong>Tên khách hàng</strong>
        </th>
        <th>
            <strong>Tên khách nhận</strong>
        </th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${list}" >
    <tr>
        <td>
            <p>${item.soHD}</p>
        </td>
        <td>
            <p>${item.ngayLapHD}</p>
        </td>
        <td>
            <p>${item.tongTien}</p>
        </td>
        <td>
            <p>${item.tienVC}</p>
        </td>
        <td>
            <p>${item.maNV.tenNV}</p>
        </td>
        <td>
            <p>${item.maTT.moTa}</p>
        </td>
        <td>
            <p>${item.cod}</p>
        </td>
        <td>
            <p>${item.maTD.tenTD}</p>
        </td>
        <td>
            <p>${item.maLVC.tenLVC}</p>
        </td>
        <td>
            <p>${item.maKH.tenKH}</p>
        </td>
        <td>
            <p>${item.maKN.tenKN}</p>
        </td>
        <td>
            <a href="<c:url value="/editbill"/>">
            <i class="fa fa-edit btn btn-info btn-sm">Chỉnh sửa</i>
            </a> |
            <a href="<c:url value="/detailbill"/>">
            <i class="btn btn-warning btn-sm">Chi tiết</i>
            </a> |
            <a href="<c:url value="/deletebill"/>">
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
