<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<h2 class="header-elements">THÊM PHÒNG BAN</h2>

<form id="formAuthentication" class="mb-3" method="post">
    <div class="form-horizontal">
        <hr />
        <div class="form-group">
            <strong>Phòng ban</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="TenPB" name="TenPB" placeholder="Phòng ban" autofocus />
            </div>
        </div>

        <div class="form-group">
            <strong>Nhiệm vụ</strong>
            <div class="col-md-10">
                <input type="text" class="form-control" id="NhiemVu" name="NhiemVu" placeholder="Nhiệm vụ" autofocus />
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" value="Thêm mới" class="btn btn-success btn-sm" />
                <a href="<c:url value="indexdepartment"/>">
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

