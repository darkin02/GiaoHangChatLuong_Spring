<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">THÊM HÓA ĐƠN</h2>

<form id="formAuthentication" class="mb-3" method="post">
<div class="form-horizontal">
    <hr />
    <div class="form-group">
        <strong>Ngày lập</strong>
        <div class="col-md-10">
            <input type="date" class="form-control" id="NgayLapHD" name="NgayLapHD" placeholder="Ngày lập hóa đơn" autofocus />
        </div>
    </div>

    <div class="form-group">
        <strong>Tổng tiền</strong>
        <div class="col-md-10">
            <input type="number" class="form-control" id="TongTien" name="TongTien" placeholder="Tổng tiền" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Mã nhân viên</strong>
        <div class="col-md-10">
            <input type="text" class="form-control" id="MaNV" name="MaNV" placeholder="Mã nhân viên" autofocus />
        </div>
    </div>
    <div class="form-group">
        <strong>Mã tuyến đường</strong>
        <div class="col-md-10">
            <input type="text" class="form-control" id="MaTD" name="MaTD" placeholder="Trạng thái" autofocus />
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


<style>
    .header-elements {
        margin: 20px;
    }
    .form-horizontal {
        margin-left: 20px;
    }
</style>

