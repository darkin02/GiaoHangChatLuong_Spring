<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">DANH SÁCH PHIẾU YÊU CẦU</h2>
<table class="table">
    <tr>
        <th>
            <strong>Số phiếu yêu cầu</strong>
        </th>
        <th>
            <strong>Ngày lập</strong>
        </th>
        <th>
            <strong>Tên khách hàng</strong>
        </th>
        <th>
            <strong>Khối lượng</strong>
        </th>
        <th>
            <strong>Tên khách nhận</strong>
        </th>
        <th>
            <strong>Loại vận chuyển</strong>
        </th>
        <th>
            <strong>Thanh toán</strong>
        </th>
        <th>
            <strong>Trạng thái</strong>
        </th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${list}" >
        <tr>
            <td>
                <p>${item.soPYC}</p>
            </td>
            <td>
                <p>${item.ngayLap}</p>
            </td>
            <td>
                <p>${item.maKH.tenKH}</p>
            </td>
            <td>
                <p>${item.khoiLuong}</p>
            </td>
            <td>
                <p>${item.maKN.tenKN}</p>
            </td>
            <td>
                <p>${item.maLVC.tenLVC}</p>
            </td>
            <td>
                <p>${item.thanhToan}</p>
            </td>
            <td>
                <p>${item.trangThai}</p>
            </td>
            <td>
                <a href="<c:url value="createbill/${item.soPYC}"/>">
                    <i class="fa fa-edit btn btn-info btn-sm">Xác nhận</i>
                </a> |
                <a href="<c:url value="detailrecipients/${item.soPYC}"/>">
                    <i class="btn btn-warning btn-sm">Chi tiết</i>
                </a> |
                <a href="<c:url value="deleterecipients/${item.soPYC}"/>">
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
