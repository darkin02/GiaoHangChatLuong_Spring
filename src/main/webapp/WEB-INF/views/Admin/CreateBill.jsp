<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">THÊM HÓA ĐƠN</h2>

<form id="formAuthentication" class="mb-3" method="post" modelAttribute="Hoadonvanchuyen">
<div class="form-horizontal">
    <hr />
    <div class="form-group">
        <strong>Ngày lập</strong>
        <div class="col-md-10">
            <input type="date" class="form-control" id="ngayLapHD" name="ngayLapHD" placeholder="Ngày lập hóa đơn" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Mã khách hàng</strong>
        <div class="col-md-10">
            <input list="browsersMaKH" name="maKH" id="maKH" class="form-control">
            <datalist id="browsersMaKH">
                <c:forEach items="${listKH}" var="item">
                    <option value="${item.maKH}">${item.maKH}</option>
                </c:forEach>
            </datalist>
        </div>
    </div>
    <div class="form-group">
        <strong>Mã khách nhận</strong>
        <div class="col-md-10">
            <input type="text" class="form-control" id="maKN" name="maKN" placeholder="Mã khách nhận" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Loại vận chuyển</strong>
        <div class="col-md-10">
            <select name="maLVC" class="form-select form-select-lg">
                <c:forEach items="${listLVC}" var="category">
                    <option value="${category.maLVC}">${category.tenLVC}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="form-group">
        <strong>COD</strong>
        <div class="col-md-10">
            <input type="checkbox" id="cod" name="cod" placeholder="Mã nhân viên" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Mã tuyến đường</strong>
        <div class="col-md-10">
            <input type="text" class="form-control" id="maTD" name="maTD" placeholder="Mã tuyến đường" autofocus />
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-offset-2 col-md-10">
            <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
            <a href="<c:url value="indexbill"/>">
            <i class="btn btn-info btn-sm">Trở lại</i>
            </a>
        </div>
    </div>
</div>
</form>

<script>
    var val = $("#maKH").val();

    var obj = $("#browsersMaKH").find("option[value='" + val + "']");

    if(obj != null && obj.length > 0)
        alert("duyệt");  // allow form submission
    else
        alert("Không có mã khách hàng này!"); // don't allow form submission
</script>
<style>
    .header-elements {
        margin: 20px;
    }
    .form-horizontal {
        margin-left: 20px;
    }
</style>

