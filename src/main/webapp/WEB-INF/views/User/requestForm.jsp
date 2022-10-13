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
<!-- Contact Start -->
<div class="container-fluid bg-secondary my-5" style="margin-top: 0 !important;">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-4 py-5 py-lg-0">
                <h6 class="text-primary text-uppercase font-weight-bold">Nhận Báo Giá</h6>
                <h1 class="mb-4">Yêu cầu gửi hàng</h1>
                <p class="mb-4">Hãy điền tên và Email của bạn vào khung bên trái, chọn loại dịch vụ theo nhu cầu của bạn và nhận báo giá.</p>
                <div class="row">
                    <div class="col-sm-4">
                        <h1 class="text-primary mb-2" data-toggle="counter-up">225</h1>
                        <h6 class="font-weight-bold mb-4">Dịch Vụ</h6>
                    </div>
                    <div class="col-sm-4">
                        <h1 class="text-primary mb-2" data-toggle="counter-up">1050</h1>
                        <h6 class="font-weight-bold mb-4">Khách Hàng</h6>
                    </div>
                    <div class="col-sm-4">
                        <h1 class="text-primary mb-2" data-toggle="counter-up">2500</h1>
                        <h6 class="font-weight-bold mb-4">Đơn Hàng Đã Giao</h6>
                    </div>
                </div>
            </div>
            <div class="col-lg-8">
                <div class="bg-primary py-5 px-4 px-sm-5">
                    <form class="py-5" method="post" modelAttribute="DangKyPhieuGui">
                        <div class="form-group" >
                            <input type="text" class="form-control border-0 p-4" name="tenKH" placeholder="Tên của bạn" required="required" />
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control border-0 p-4" name="sDTKh" placeholder="Số điện thoại của bạn" required="required" />
                        </div>
                        <div class="form-group">
                            <span style="color: white">Giới Tính:</span>
                            <input checked="checked" name="gioiTinhKH" type="radio" value="Nam" /><span style="color: white">Nam</span>
                            <input name="gioiTinhKH" type="radio" value="Nữ" /><span style="color: white">Nữ</span>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3 col-md-4" style="height: 50px; ">
                                <select name="ls_province" id="ls_province" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;" >
                                </select>
                            </div>
                            <div class="col-sm-3 col-md-4">
                                <select name="ls_district" id="ls_district" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;">
                                </select>
                            </div>
                            <div class="col-sm-3 col-md-4">
                                <select name="ls_ward" id="ls_ward" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;">
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control border-0 p-4" name="diaChiKH" placeholder="Địa chỉ cụ thể" required="required" />
                        </div>
                        <div class="form-group">
                            <span style="color: white">Phần người nhận</span>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control border-0 p-4" name="tenKN" placeholder="Tên người nhận" required="required" />
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control border-0 p-4" name="sDTKN" placeholder="Số điện thoại người nhận" required="required" />
                        </div>
                        <div class="form-group">
                            <span style="color: white">Giới Tính:</span>
                            <input checked="checked" name="gioiTinhKN" type="radio" value="Nam" /><span style="color: white">Nam</span>
                            <input name="gioiTinhKN" type="radio" value="Nữ" /><span style="color: white">Nữ</span>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3 col-md-4" style="height: 50px; ">
                                <select name="ls_province1" id="ls_province1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;" >
                                </select>
                            </div>
                            <div class="col-sm-3 col-md-4">
                                <select name="ls_district1" id="ls_district1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;">
                                </select>
                            </div>
                            <div class="col-sm-3 col-md-4">
                                <select name="ls_ward1" id="ls_ward1" class="custom-select border-0 px-4" style="
                                    height: 100%;border:none;">
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control border-0 p-4" name="diaChiKN" placeholder="Địa chỉ cụ thể của người nhận" required="required" />
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control border-0 p-4" name="kg" placeholder="Số cân nặng(KG)" required="required" />
                        </div>
                        <div class="form-group">
                            <select class="custom-select border-0 px-4" name="maLVC" style="height: 47px;">
                                <option selected disabled hidden>Chọn loại vận chuyển</option>
                                <c:forEach items="${listLVC}" var="category">
                                    <option value="${category.maLVC}">${category.tenLVC}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div>
                            <button class="btn btn-dark btn-block border-0 py-3" type="submit">Nhận Báo Giá</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

