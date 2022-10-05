<%@ include file="/WEB-INF/views/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- Header Start -->
<form action="/GiaoHang/TheoDoi" method="post">
    <div class="jumbotron jumbotron-fluid mb-5">
        <div class="container text-center py-5">
            <h1 class="text-primary mb-4">An Toàn & Nhanh Chóng</h1>
            <h1 class="text-white display-3 mb-5">Theo Dõi Kiện Hàng</h1>
            <div class="mx-auto" style="width: 100%; max-width: 600px;">
                <div class="input-group">
                    <input type="text" class="form-control border-light" style="padding: 30px;" placeholder="Mã Kiện Hàng" name="SoHD">
                    <div class="input-group-append">
                        <button class="btn btn-primary px-3" id="test" type="submit">Theo Dõi Kiện Hàng</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%--    <!--Don hang-->--%>
<%--    @{ if (Session["TheoDoi"] != null)--%>
<%--    {--%>
<%--    TheoDoi td = (TheoDoi)Session["TheoDoi"];--%>
<%--    var lst = (List<HanhTrinh>)Session["QuaTrinh"];--%>
<%--    <button id="theodoi" data-toggle="modal" data-target="#exampleModal" hidden="hidden" type="button"></button>--%>
<%--    <div class="modal " id="exampleModal" tabindex="1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--        <div class="modal-dialog modal-lg" role="document">--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="exampleModalLabel">Đơn hàng</h5>--%>
<%--                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                        <span aria-hidden="true">&times;</span>--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <div class="ThongTin">--%>
<%--                        <div class="row">--%>
<%--                            <div class="card bg-light mb-3 col-sm-6" style="max-width: 18rem; float: left; height: 250px;">--%>
<%--                                <div class="card-header ">Người gửi</div>--%>
<%--                                <div class="card-body">--%>
<%--                                    <div class="customer">--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-user"><span>@td.TenKH</span></i>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-phone"><span>@td.SDTKH</span></i>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-home"><span>@td.DiaChiKH</span></i>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="card bg-light mb-3 col-sm-6" style="max-width: 18rem; height: 250px;">--%>
<%--                                <div class="card-header">Người nhận</div>--%>
<%--                                <div class="card-body">--%>
<%--                                    <div class="customer">--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-user"><span>@td.TenKN</span></i>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-phone"><span>@td.SDTKN</span></i>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <i class="fa fa-home"><span>@td.DiaChiKN</span></i>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="card bg-light mb-3 col-sm-6" style="max-width: 18rem; float: left; height: 250px;">--%>
<%--                                <div class="card-header ">Thông tin</div>--%>
<%--                                <div class="card-body">--%>
<%--                                    <div class="customer">--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <label for="">Mã Khách Hàng:<span>@td.MaKH</span></label>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            <label for="">Tổng tiền:<span>@td.TongTien VNĐ</span></label>--%>
<%--                                        </div>--%>
<%--                                        <div class="item_customer">--%>
<%--                                            @if (td.COD)--%>
<%--                                            {--%>
<%--                                            <label for="">Thu hộ:<span>Có</span></label> if (!td.TrangThai)--%>
<%--                                            {--%>
<%--                                            <div class="item_customer">--%>
<%--                                                <a class="btn-success" href="@Url.Action("Payment", "GiaoHang", new { @SoTien = td.TongTien })">Thanh Toán</a>--%>
<%--                                            </div>}--%>
<%--                                            }--%>
<%--                                            @if (!td.COD)--%>
<%--                                            {--%>
<%--                                            <label for="">Thu hộ:<span>Không</span></label>}--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="card bg-light mb-3 col-sm-6" style="max-width: 18rem; float: left; height: 250px;">--%>
<%--                                <div class="card-header ">Trạng thái đơn hàng</div>--%>
<%--                                <div class="card-body">--%>
<%--                                    <div class="customer">--%>
<%--                                        <div class="item_customer">--%>
<%--                                            @if (td.TrangThai)--%>
<%--                                            {--%>
<%--                                            <label for="">Đã giao</label>}--%>
<%--                                            @if (!td.TrangThai)--%>
<%--                                            {--%>
<%--                                            <label for="">Đang giao</label>}--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="card bg-light mb-3 col-sm-11" style=" float: left;">--%>
<%--                                <div class="card-header ">Theo dõi đơn hàng</div>--%>
<%--                                <div class="card-body">--%>
<%--                                    <div class="customer">--%>
<%--                                        @foreach (var item in lst)--%>
<%--                                        {--%>
<%--                                        <div class="item_theodoi">--%>
<%--                                            <div class="time" style="float: left;">--%>
<%--                                                <i class="fa fa-calendar-alt"><span>@item.Time</span></i>--%>
<%--                                            </div>--%>
<%--                                            @if (item.SuKien)--%>
<%--                                            {--%>
<%--                                            <div class="trangthai">--%>
<%--                                                Đã đến nhà kho @item.TenNK--%>
<%--                                            </div>}--%>
<%--                                            @if (!item.SuKien)--%>
<%--                                            {--%>
<%--                                            <div class="trangthai">--%>
<%--                                                Đã xuất kho @item.TenNK--%>
<%--                                            </div>}--%>
<%--                                        </div>}--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-primary" data-dismiss="modal">Thoát</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div> }--%>
<%--    if (Session["ErrorTheoDoi"] != null)--%>
<%--    {--%>
<%--    <button id="theodoi" data-toggle="modal" data-target="#exampleModal" hidden="hidden" type="button"></button>--%>
<%--    <div class="modal " id="exampleModal" tabindex="1" aria-labelledby="exampleModalLabel">--%>
<%--        <div class="modal-dialog modal-lg" role="document">--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="exampleModalLabel">Đơn hàng</h5>--%>
<%--                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                        <span aria-hidden="true">&times;</span>--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <label style="color:orangered;">@Session["ErrorTheoDoi"]</label>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                    <button type="button" class="btn btn-primary">Save changes</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div> } }--%>

<%--    <!--Don hang end-->--%>
<%--</form>--%>

<!-- Header End -->
<div class="top-main ">
    <div class="top-main-body">
        <div class="left">
            <div id="carouselId" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselId" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselId" data-slide-to="1"></li>
                    <li data-target="#carouselId" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img src="https://giaohangtietkiem.vn/wp-content/uploads/2021/10/BG%C4%90GHTKhotrohocphivamaytinhbang.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img src="https://giaohangtietkiem.vn/wp-content/uploads/2021/08/Tiem-vacine-copy-2.png" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img src="https://giaohangtietkiem.vn/wp-content/uploads/2020/12/DSC07880.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselId" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselId" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="right">
            <ul>
                <li><a href="">tra cứu đơn hàng</a></li>
                <li><a href="<c:url value='/login/index'/>">Đăng nhập | Đăng ký</a></li>
                <li><a href="">ứng tuyển giao hàng</a></li>
                <li><a href="">tải app giao hàng</a></li>
                <li><a href="">bảng giá</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- About Start -->
<div class="container-fluid py-5">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-5 pb-4 pb-lg-0">
                <img class="img-fluid w-100" src="https://giaohangtietkiem.vn/wp-content/plugins/ghtk-post-offices/assets/img/list-post-offices.jpg" alt="">
                <div class="bg-primary text-dark text-center p-4">
                    <h3 class="m-0">1000++ Điểm Gửi Hàng</h3>
                </div>
            </div>

            <div class="col-lg-7">
                <h6 class="text-primary text-uppercase font-weight-bold">Về Chúng Tôi</h6>
                <h1 class="mb-4">Nhà cung cấp dịch vụ vận chuyển đáng tin cậy & nhanh chóng</h1>
                <p class="mb-4">Giao Hàng Tiết Kiệm cam kết đem lại cho bạn dịch vụ vận chuyển đáng tin cậy và nhanh chóng. Với hơn 1000 điểm gửi hàng trên toàn quốc. Chúng tôi sẽ vận chuyển đơn hàng của bạn tới mọi nơi.</p>
                <div class="d-flex align-items-center pt-2">
                    <button type="button" class="btn btn-primary video-btn btn-play" data-toggle="modal" data-src="https://www.youtube.com/embed/Rrr-5-4wcEs" data-target="#myModal">
                        <span></span>
                    </button>
                    <h5 class="font-weight-bold m-0 ml-4">Play Video</h5>
                    <!-- Modal -->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-body">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                    <!-- 16:9 aspect ratio -->
                                    <div class="embed-responsive embed-responsive-16by9">
                                        <iframe class="embed-responsive-item" src="" id="video" allowscriptaccess="always" allow="autoplay"></iframe>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Video Modal -->
    <div class="modal fade" id="videoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <!-- 16:9 aspect ratio -->
<%--                    <div class="embed-responsive embed-responsive-16by9">--%>
<%--                        <iframe class="embed-responsive-item" src="" id="video" allowscriptaccess="always" allow="autoplay"></iframe>--%>
<%--                    </div>--%>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- About End -->
<!--  Quote Request Start -->
<div class="container-fluid bg-secondary my-5">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-7 py-5 py-lg-0">
                <h6 class="text-primary text-uppercase font-weight-bold">Nhận Báo Giá</h6>
                <h1 class="mb-4">Yêu cầu báo giá</h1>
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
            <div class="col-lg-5">
                <div class="bg-primary py-5 px-4 px-sm-5">
                    <form class="py-5" method="post" action="/GiaoHang/Index">
                        @model GiaoHangTietKiem.Controllers.Model.BaoGiaModel
                        @Html.AntiForgeryToken()
                        <div class="form-group">
                            <input type="text" class="form-control border-0 p-4" placeholder="Tên của bạn" required="required" name="TenKH" />
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control border-0 p-4" placeholder="Email của bạn" required="required" name="Email" />
                        </div>
<%--                        <div class="form-group">--%>
<%--                            @Html.DropDownList("TenLVC", (IEnumerable<SelectListItem>)ViewBag.TenLVC, new { @class = "custom-select border-0 px-4" })--%>
<%--                        </div>--%>
                        <div>
                            <input class="btn btn-dark btn-block border-0 py-3" type="submit" value="Nhận Báo Giá" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Quote Request Start -->
<!-- Services Start -->
<div class="container-fluid pt-5">
    <div class="container">
        <div class="text-center pb-2">
            <h6 class="text-primary text-uppercase font-weight-bold">Loại Vận Chuyển Của Chúng Tôi</h6>
            <h1 class="mb-4">Loại Vận Chuyển Tốt Nhất</h1>
        </div>
        <div class="row pb-3">
            <div class="col-lg-3 col-md-6 text-center mb-5">
                <div class="d-flex align-items-center justify-content-center bg-primary mb-4 p-4">
                    <i class="fa fa-2x fa-plane text-dark pr-3"></i>
                    <h6 class="text-white font-weight-medium m-0">Hàng Không</h6>
                </div>
                <p>Là các mặt hàng vận chuyển bằng đường hàng không mà thuộc tính không có vấn đề về kích thước, nội dung, bao bì,... Tuy nhiên không vì thế mà tất cả các lô hàng đều được chấp nhận vận tải dễ dàng bằng đường hàng không.</p>
                <a class="border-bottom text-decoration-none" href="">Đọc Thêm</a>
            </div>
            <div class="col-lg-3 col-md-6 text-center mb-5">
                <div class="d-flex align-items-center justify-content-center bg-primary mb-4 p-4">
                    <i class="fa fa-2x fa-ship text-dark pr-3"></i>
                    <h6 class="text-white font-weight-medium m-0">Đường Thủy</h6>
                </div>
                <p>Là một loại phương thức vận tải sử dụng thuyền, tàu, ghe, đò... chuyên chở hàng hoá và đưa đón du khách. Thuỷ vận chủ yếu phụ trách vận tải với số lượng lớn và khoảng cách xa, là hình thức vận tải đóng vai trò chủ lực trong vận tải đường cạn.</p>
                <a class="border-bottom text-decoration-none" href="">Đọc Thêm</a>
            </div>
            <div class="col-lg-3 col-md-6 text-center mb-5">
                <div class="d-flex align-items-center justify-content-center bg-primary mb-4 p-4">
                    <i class="fa fa-2x fa-truck text-dark pr-3"></i>
                    <h6 class="text-white font-weight-medium m-0">Đường Bộ</h6>
                </div>
                <p>Là phương thức vận chuyển hàng hoá phổ biến nhất hiện nay, vận tải đường bộ là loại hình vận tải sử dụng các phương tiện di chuyển như ô tô, xe tải, xe container, rơ moóc, sơ mi rơ moóc kéo theo ô tô,... để chuyên chở hàng hóa.</p>
                <a class="border-bottom text-decoration-none" href="">Đọc Thêm</a>
            </div>
            <div class="col-lg-3 col-md-6 text-center mb-5">
                <div class="d-flex align-items-center justify-content-center bg-primary mb-4 p-4">
                    <i class="fa fa-2x fa-train text-dark pr-3"></i>
                    <h6 class="text-white font-weight-medium m-0">Tàu Hỏa</h6>
                </div>
                <p>Dịch vụ vận chuyển hàng hóa tàu hỏa, đường sắt được rất nhiều khách hàng lựa chọn làm phương thức vận tải hàng hóa cho cá nhân, doanh nghiệp bởi những ưu việt vốn có của loại hình truyền thống lâu đời này là nhanh, giá rẻ, an toàn.</p>
                <a class="border-bottom text-decoration-none" href="">Đọc Thêm</a>
            </div>
        </div>
    </div>
</div>
<!-- Services End -->
<!-- Features Start -->
<div class="container-fluid bg-secondary my-5">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-5">
                <img class="img-fluid w-100" src="~/img/feature.jpg" alt="">
            </div>
            <div class="col-lg-7 py-5 py-lg-0">
                <h6 class="text-primary text-uppercase font-weight-bold">TẠI SAO CHỌN CHÚNG TÔI</h6>
                <h1 class="mb-4">Dịch vụ vận chuyển nhanh, an toàn và đáng tin cậy</h1>
                <p class="mb-4">Dolores lorem lorem ipsum sit et ipsum. Sadip sea amet diam dolore sed et. Sit rebum labore sit sit ut vero no sit. Et elitr stet dolor sed sit et sed ipsum et kasd ut. Erat duo eos et erat sed diam duo</p>
                <ul class="list-inline">
                    <li><h6><i class="far fa-dot-circle text-primary mr-3"></i>Tốt nhất trong ngành</h6>
                    <li><h6><i class="far fa-dot-circle text-primary mr-3"></i>Các dịch vụ khẩn cấp</h6></li>
                    <li><h6><i class="far fa-dot-circle text-primary mr-3"></i>Hỗ trợ khách hàng 24/7</h6></li>
                </ul>
                <a href="" class="btn btn-primary mt-3 py-2 px-4">Tìm hiểu thêm</a>
            </div>
        </div>
    </div>
</div>
<!-- Features End -->
<!-- Team Start -->
<div class="container-fluid pt-5">
    <div class="container">
        <div class="text-center pb-2">
            <h6 class="text-primary text-uppercase font-weight-bold">ĐỘI GIAO HÀNG</h6>
            <h1 class="mb-4">Gặp gỡ nhóm giao hàng của chúng tôi</h1>
        </div>
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="team card position-relative overflow-hidden border-0 mb-5">
                    <img class="card-img-top" src="~/img/Cuong.jpg" alt="" style="height : 250px;">
                    <div class="card-body text-center p-0">
                        <div class="team-text d-flex flex-column justify-content-center bg-secondary">
                            <h5 class="font-weight-bold">Nguyễn Mạnh Cường</h5>
                            <span>Trưởng Nhóm</span>
                        </div>
                        <div class="team-social d-flex align-items-center justify-content-center bg-primary">
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                            <a class="btn btn-outline-dark btn-social" href="#"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team card position-relative overflow-hidden border-0 mb-5">
                    <img class="card-img-top" src="~/img/Thinh.jpg" alt="" style="height : 250px;">
                    <div class="card-body text-center p-0">
                        <div class="team-text d-flex flex-column justify-content-center bg-secondary">
                            <h5 class="font-weight-bold">Nguyễn Văn Thịnh</h5>
                            <span>Thành Viên</span>
                        </div>
                        <div class="team-social d-flex align-items-center justify-content-center bg-primary">
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                            <a class="btn btn-outline-dark btn-social" href="#"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team card position-relative overflow-hidden border-0 mb-5">
                    <img class="card-img-top" src="~/img/Truong.jpg" alt="" style="height : 250px;">
                    <div class="card-body text-center p-0">
                        <div class="team-text d-flex flex-column justify-content-center bg-secondary">
                            <h5 class="font-weight-bold">Nguyễn Nhựt Trường</h5>
                            <span>Thành Viên</span>
                        </div>
                        <div class="team-social d-flex align-items-center justify-content-center bg-primary">
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                            <a class="btn btn-outline-dark btn-social" href="#"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team card position-relative overflow-hidden border-0 mb-5">
                    <img class="card-img-top" src="~/img/Thuan.jpg" alt="" style="height : 250px;">
                    <div class="card-body text-center p-0">
                        <div class="team-text d-flex flex-column justify-content-center bg-secondary">
                            <h5 class="font-weight-bold">Lê Định Thuận</h5>
                            <span>Thành Viên</span>
                        </div>
                        <div class="team-social d-flex align-items-center justify-content-center bg-primary">
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-dark btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                            <a class="btn btn-outline-dark btn-social" href="#"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Team End -->
<!-- Testimonial Start -->
<div class="container-fluid py-5">
    <div class="container">
        <div class="text-center pb-2">
            <h6 class="text-primary text-uppercase font-weight-bold">Lời Nhận Xét</h6>
            <h1 class="mb-4">Khách hàng của chúng tôi nói</h1>
        </div>
        <div class="owl-carousel testimonial-carousel">
            <div class="position-relative bg-secondary p-4">
                <i class="fa fa-3x fa-quote-right text-primary position-absolute" style="top: -6px; right: 0;"></i>
                <div class="d-flex align-items-center mb-3">
                    <img class="img-fluid rounded-circle" src="~/img/domixi.jpg" style="width: 60px; height: 60px;" alt="">
                    <div class="ml-3">
                        <h6 class="font-weight-semi-bold m-0">Độ Mixi</h6>
                        <small>Streamer</small>
                    </div>
                </div>
                <p class="m-0">Dịch vụ giao hàng nhanh, đóng gói hàng cẩn thận.</p>
            </div>
            <div class="position-relative bg-secondary p-4">
                <i class="fa fa-3x fa-quote-right text-primary position-absolute" style="top: -6px; right: 0;"></i>
                <div class="d-flex align-items-center mb-3">
                    <img class="img-fluid rounded-circle" src="~/img/sontung.jpg" style="width: 60px; height: 60px;" alt="">
                    <div class="ml-3">
                        <h6 class="font-weight-semi-bold m-0">Sơn Tùng MTP</h6>
                        <small>Ca Sĩ</small>
                    </div>
                </div>
                <p class="m-0">Dịch vụ giao hàng nhanh, đóng gói hàng cẩn thận.</p>
            </div>
            <div class="position-relative bg-secondary p-4">
                <i class="fa fa-3x fa-quote-right text-primary position-absolute" style="top: -6px; right: 0;"></i>
                <div class="d-flex align-items-center mb-3">
                    <img class="img-fluid rounded-circle" src="~/img/ngokienhuy.jpg" style="width: 60px; height: 60px;" alt="">
                    <div class="ml-3">
                        <h6 class="font-weight-semi-bold m-0">Ngô Kiến Huy</h6>
                        <small>Ca Sĩ</small>
                    </div>
                </div>
                <p class="m-0">Dịch vụ giao hàng nhanh, đóng gói hàng cẩn thận.</p>
            </div>
            <div class="position-relative bg-secondary p-4">
                <i class="fa fa-3x fa-quote-right text-primary position-absolute" style="top: -6px; right: 0;"></i>
                <div class="d-flex align-items-center mb-3">
                    <img class="img-fluid rounded-circle" src="~/img/bray.jpg" style="width: 60px; height: 60px;" alt="">
                    <div class="ml-3">
                        <h6 class="font-weight-semi-bold m-0">Bray</h6>
                        <small>- Rapper</small>
                    </div>
                </div>
                <p class="m-0">Dịch vụ giao hàng nhanh, đóng gói hàng cẩn thận.</p>
            </div>
        </div>
    </div>
</div>
<!-- Testimonial End -->
<!-- Blog Start -->
<div class="container-fluid pt-5">
    <div class="container">
        <div class="text-center pb-2">
            <h6 class="text-primary text-uppercase font-weight-bold">Blog của chúng tôi</h6>
            <h1 class="mb-4">Blog mới nhất</h1>
        </div>
        <div class="row">
            <div class="col-md-6 mb-5">
                <div class="position-relative">
                    <img class="img-fluid w-100" src="https://giaohangtietkiem.vn/wp-content/uploads/2022/05/DSC01046.png" alt="" style="height: 350px;">
                    <div class="position-absolute bg-primary d-flex flex-column align-items-center justify-content-center rounded-circle"
                         style="width: 60px; height: 60px; bottom: -30px; right: 30px;">
                        <h4 class="font-weight-bold mb-n1">28</h4>
                        <small class="text-white text-uppercase">May</small>
                    </div>
                </div>
                <div class="bg-secondary" style="padding: 30px;">
                    <div class="d-flex mb-3">
                        <div class="d-flex align-items-center">
                            <img class="rounded-circle" style="width: 40px; height: 40px;" src="~/img/Thuan.jpg" alt="">
                            <a class="text-muted ml-2" href="">Định Thuận</a>
                        </div>
                        <div class="d-flex align-items-center ml-4">
                            <i class="far fa-bookmark text-primary"></i>
                            <a class="text-muted ml-2" href="">Blog</a>
                        </div>
                    </div>
                    <h4 class="font-weight-bold mb-3 h4-tin">Ann Na Kim – chỉ cần nhẫn nại, chỉ cần chăm chỉ ắt sẽ thành công</h4>
                    <p>3 lần khởi nghiệp bán hàng online từ con số 0 và lần nào cũng thành công của một cô gái giao dịch viên ngành ngân hàng</p>
                    @Html.ActionLink("Đọc Thêm", "Single", null, new { @class = "border-bottom border-primary text-uppercase text-decoration-none" })
                </div>
            </div>
            <div class="col-md-6 mb-5">
                <div class="position-relative">
                    <img class="img-fluid w-100" src="https://giaohangtietkiem.vn/wp-content/uploads/2022/05/Dung-Poster-Kid-talent-05-2.jpg" alt="" style="height: 350px;">
                    <div class="position-absolute bg-primary d-flex flex-column align-items-center justify-content-center rounded-circle"
                         style="width: 60px; height: 60px; bottom: -30px; right: 30px;">
                        <h4 class="font-weight-bold mb-n1">01</h4>
                        <small class="text-white text-uppercase">Jan</small>
                    </div>
                </div>
                <div class="bg-secondary" style="padding: 30px;">
                    <div class="d-flex mb-3">
                        <div class="d-flex align-items-center">
                            <img class="rounded-circle" style="width: 40px; height: 40px;" src="~/img/Cuong.jpg" alt="">
                            <a class="text-muted ml-2" href="">Mạnh Cường</a>
                        </div>
                        <div class="d-flex align-items-center ml-4">
                            <i class="far fa-bookmark text-primary"></i>
                            <a class="text-muted ml-2" href="">Blog</a>
                        </div>
                    </div>
                    <h4 class="font-weight-bold mb-3 h4-tin">THÔNG BÁO PHÁT ĐỘNG CUỘC THI TÀI NĂNG NHÍ NHÀ KIỆM GHTK KID’S TALENT 2022</h4>
                    <p>Mỗi đứa trẻ đều có trong mình một ước mơ. Ba mẹ là người giúp con khám phá và nuôi dưỡng ước mơ từ những năng khiếu thuở bé. </p>
                    <a class="border-bottom border-primary text-uppercase text-decoration-none" href="">Đọc Thêm</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Blog End -->
<div class="container-fluid py-5">
    <div class="container">
        <div class="text-center pb-2">
            <h6 class="text-primary text-uppercase font-weight-bold">Đối Tác Của Chúng Tôi</h6>
            <h1 class="mb-4">Những Đối Tác Lớn</h1>
        </div>
        <div class="owl-carousel testimonial-carousel">
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/shopee-02.png" alt="" style="width: 150px; height: 100px;">
            </div>
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/vat-gia-02.png" alt="" style="width: 150px; height: 100px;">
            </div>
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/edumall-02.png" alt="" style="width: 150px; height: 100px;">
            </div>
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/sapo-02.png" alt="" style="width: 150px; height: 100px;">
            </div>
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/goship-02.png" alt="" style="width: 150px; height: 100px;">
            </div>
            <div class="position-relative p-4" style="margin-left:70px ;">
                <img src="https://giaohangtietkiem.vn/wp-content/uploads/2018/05/ship-an-toan.png" alt="" style="width: 150px; height: 100px;">
            </div>
        </div>
    </div>
</div>
