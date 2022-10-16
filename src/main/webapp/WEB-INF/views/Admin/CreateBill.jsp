<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<script src="<c:url value='/Resources/js/Scripts/vietnamlocalselectortest.js'/>"></script>
<script>
    var localpicker = new LocalPicker({
        province: "ls_province",
        district: "ls_district",
        ward: "ls_ward"
    });
    var localpicker1 = new LocalPicker({
        province: "ls_province1",
        district: "ls_district1",
        ward: "ls_ward1"
    });
</script>
<h2 class="header-elements">THÊM HÓA ĐƠN</h2>

<form id="formAuthentication" class="mb-3" method="post" modelAttribute="CreateBill">
<div class="form-horizontal">
    <hr />
    <c:choose>
    <c:when test="${sessionScope.get('PhieuYeuCau') ne null}">
    <div class="form-group">
        <strong>Ngày lập hóa đơn</strong>
        <div class="col-md-10">
            <input type="date" class="form-control" id="ngayLapHD" disabled="disabled" name="ngayLapHD" value="${bill.ngayLapHD}" placeholder="Ngày lập hóa đơn" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Loại vận chuyển</strong>
        <div class="col-md-10">
            <input type="text" class="form-control" disabled="disabled" name="maLVC" value="${bill.maLVC}" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Thông tin khách hàng</strong>
        <div class="col-md-10">
            <input name="tenKH" placeholder="Tên người gửi" required="required" disabled="disabled" class="form-control" value="${bill.tenKH}">
        </div>
    </div>
    <div class="form-group" style="margin-top: 10px;">
        <div class="col-md-10">
            <input type="number" class="form-control" name="sDTKh" disabled="disabled" placeholder="Số điện thoại người gửi" value="${bill.sDTKh}" required="required" autofocus/>
        </div>
    </div>
    <div class="form-group" style="margin-top: 10px;">
        <span>Giới Tính:</span>
        <span>${bill.gioiTinhKH}</span
    </div>
    <div class="form-group">
        <strong>Địa chỉ người gửi</strong>
        <div class="col-md-10">
            <input name="diaChiKH" required="required" disabled="disabled" class="form-control" value="${bill.diaChiKH}">
        </div>
    </div>
        <div class="form-group">
            <strong>Thông tin khách nhận</strong>
            <div class="col-md-10">
                <input name="tenKN" placeholder="Tên người gửi" required="required" disabled="disabled" class="form-control" value="${bill.tenKN}">
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <div class="col-md-10">
                <input type="number" class="form-control" name="sDTKN" disabled="disabled" placeholder="Số điện thoại người gửi" value="${bill.sDTKN}" required="required" autofocus/>
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <span>Giới Tính:</span>
            <span>${bill.gioiTinhKN}</span>
        </div>
        <div class="form-group row">
            <strong>Địa chỉ người nhận</strong>
            <div class="col-md-10">
                <input name="diaChiKN" required="required" disabled="disabled" class="form-control" value="${bill.diaChiKN}">
            </div>
        </div>
    <div class="form-group">
        <strong>COD</strong>
        <div class="col-md-10">
            <input type="checkbox" name="cod" autofocus />
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
    </c:when>
    <c:otherwise>
        <div class="form-group">
            <strong>Ngày lập hóa đơn</strong>
            <div class="col-md-10">
                <input type="date" class="form-control"  name="ngayLapHD" placeholder="Ngày lập hóa đơn" autofocus />
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
            <strong>Thông tin khách hàng</strong>
            <div class="col-md-10">
                <input name="tenKH" placeholder="Tên người gửi" required="required" class="form-control" >
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <div class="col-md-10">
                <input type="number" class="form-control" name="sDTKh" placeholder="Số điện thoại người gửi" required="required" autofocus/>
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <span>Giới Tính:</span>
            <input checked="checked" name="gioiTinhKH" type="radio" value="Nam" /><span>Nam</span>
            <input name="gioiTinhKH" type="radio" value="Nữ" /><span >Nữ</span>
        </div>
        <div class="form-group row">
            <strong>Địa chỉ</strong>
            <div class="col-sm-3 col-md-4" style="height: 50px">
                <select name="ls_province1" id="ls_province" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;">
                </select>
            </div>
            <div class="col-sm-3 col-md-4" style="margin-left: -50px; ">
                <select name="ls_district1" id="ls_district" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;">
                </select>
            </div>
            <div class="col-sm-3 col-md-4" style="margin-left: -50px; ">
                <select name="ls_ward1" id="ls_ward" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;">
                </select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-10" style="margin-top: 10px;">
                <input type="text" class="form-control" name="diaChiKH" placeholder="Địa chỉ cụ thể" required="required" autofocus/>
            </div>
        </div>
        <div class="form-group">
            <strong>Thông tin khách nhận</strong>
            <div class="col-md-10">
                <input name="tenKN" placeholder="Tên người nhận" required="required" class="form-control">
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <div class="col-md-10">
                <input type="number" class="form-control" name="sDTKN" placeholder="Số điện thoại người nhận" required="required" autofocus/>
            </div>
        </div>
        <div class="form-group" style="margin-top: 10px;">
            <span >Giới Tính:</span>
            <input checked="checked" name="gioiTinhKN" type="radio" value="Nam" /><span >Nam</span>
            <input name="gioiTinhKN" type="radio" value="Nữ" /><span >Nữ</span>
        </div>
        <div class="form-group row">
            <strong>Địa chỉ</strong>
            <div class="col-sm-3 col-md-4" style="height: 50px">
                <select name="ls_province1" id="ls_province1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;" >
                </select>
            </div>
            <div class="col-sm-3 col-md-4" style="margin-left: -50px; ">
                <select name="ls_district1" id="ls_district1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;">
                </select>
            </div>
            <div class="col-sm-3 col-md-4" style="margin-left: -50px; ">
                <select name="ls_ward1" id="ls_ward1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;width: 70%;">
                </select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-10" style="margin-top: 10px;">
                <input type="text" class="form-control" name="diaChiKN" placeholder="Địa chỉ cụ thể" required="required" autofocus/>
            </div>
        </div>
        <div class="form-group">
            <strong>COD</strong>
            <div class="col-md-10">
                <input type="checkbox" id="cod" name="cod" autofocus />
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
    </c:otherwise>
    </c:choose>
</div>
</form>

<style>
    .header-elements {
        margin: 20px;
    }
    .form-horizontal {
        margin-left: 20px;
    }
</style>

