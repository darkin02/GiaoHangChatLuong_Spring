
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- Header Start -->
<div class="jumbotron jumbotron-fluid mb-5">
    <div class="container text-center py-5">
        <h1 class="text-white display-3">Về chúng tôi</h1>
    </div>
</div>
<!-- Header End -->
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
                    <div class="embed-responsive embed-responsive-16by9">
                        <iframe class="embed-responsive-item" src="" id="video" allowscriptaccess="always" allow="autoplay"></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- About End -->
<!-- Features Start -->
<div class="container-fluid bg-secondary my-5">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-5">
                <img class="img-fluid w-100" src="<c:url value='/Resources/img/feature.jpg'/>" alt="">
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
                    <img class="card-img-top" src="<c:url value='/Resources/img/Cuong.jpg'/>" alt="" style="height : 250px;">
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
                    <img class="card-img-top" src="<c:url value='/Resources/img/Thinh.jpg'/>" alt="" style="height : 250px;">
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
                    <img class="card-img-top" src="https://scontent.xx.fbcdn.net/v/t1.15752-9/307413043_638324684458409_7902304248471513772_n.jpg?stp=dst-jpg_p160x160&_nc_cat=108&ccb=1-7&_nc_sid=aee45a&_nc_ohc=FHUpriAsPfoAX9Okegz&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=03_AdS7FKGHRp___nqHeg0_hyuYAWX5x2GwKiC3wNQRNn8-OQ&oe=6371D8DE" alt="" style="height : 250px;">
                    <div class="card-body text-center p-0">
                        <div class="team-text d-flex flex-column justify-content-center bg-secondary">
                            <h5 class="font-weight-bold">Trần Trọng Nghĩa</h5>
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
                    <img class="card-img-top" src="<c:url value='/Resources/img/Thuan.jpg'/>" alt="" style="height : 250px;">
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

