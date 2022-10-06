<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">THÊM NHÀ KHO</h2>

<form id="formAuthentication" class="mb-3" method="post">
    <div class="form-horizontal">
        <hr />
        <div class="form-group">
            <strong>Tên nhà kho</strong>
            <div class="col-md-10">
                <input type="date" class="form-control" id="TenNK" name="TenNK" placeholder="Tên nhà kho" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Diện tích</strong>
            <div class="col-md-10">
                <input type="number" class="form-control" id="DienTich" name="DienTich" placeholder="Diện tích" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Sức chứa</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="SucChua" name="SucChua" placeholder="Sức chứa" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Địa chỉ</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="DiaChi" name="DiaChi" placeholder="Địa chỉ" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Khu Vực</strong>
            <div class="col-md-10">
                <input type="date" class="form-control" id="MaKV" name="MaKV" placeholder="Khu Vực" autofocus />
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
                <a href="<c:url value="indexwarehouse"/>">
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

