<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">THÊM HÀNG HÓA</h2>

<form id="formAuthentication" class="mb-3" method="post" modelAttribute="HangHoa" action="<c:url value='/admin/creategoods'/>">
    <div class="form-horizontal">
        <hr />
        <div class="form-group">
            <strong>Tên hàng hóa</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="tenHH" name="tenHH" placeholder="Tên hàng hóa" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Mô tả</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="moTa" name="moTa" placeholder="Mô tả" autofocus />
            </div>
        </div>
        <div class="form-group">
            <strong>Đơn vị tính</strong>
            <div class="col-md-10">
                <select name="donVT" class="form-select form-select-lg">
                    <option value="Cái">Cái</option>
                    <option value="Hộp">Hộp</option>
                    <option value="Bao">Bao</option>
                    <option value="Gói">Gói</option>
                    <option value="Chiếc">Chiếc</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <strong>Loại hàng hóa</strong>
            <div class="col-md-10">
                <select name="maLHH" class="form-select form-select-lg">
                    <c:forEach items="${listLHH}" var="category">
                        <option value="${category.maLHH}">${category.tenLHH}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <strong>Giá tiền</strong>
            <div class="col-md-10">
                <input type="number" class="form-control" id="giaTien" name="giaTien" placeholder="Giá tiền" autofocus />
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
                <a href="<c:url value="indexgoods"/>">
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

