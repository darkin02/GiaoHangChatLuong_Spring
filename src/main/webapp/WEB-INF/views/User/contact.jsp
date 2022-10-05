<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDWYzTzVTqAKuNalXMzt2kbUavm2tyREyg&callback=initMap&libraries=places"
        type="text/javascript"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
    var map; // Khởi tạo các biến global mã mình sẽ sử dụng.
    var directionsDisplay;
    var directionsService;
    var isbool = false;
    function initMap() {
        isbool = false;
        var lat_lng = { lat: 20.9769427, lng: 105.8921285 };  // Latitude (Kinh độ) và Longtitude (Vĩ độ) - cho biết bản đồ của bạn sẽ ở khu vực nào, khu vực mình demo là quanh Hà Nội.
        map = new google.maps.Map(document.getElementById('map'), {    // Khởi tạo map với trong id html là map (lát nữa sẽ tạo <div id="map">)
            zoom: 16,    // tỉ lệ phóng bản đồ
            center: lat_lng
        });
        directionsService = new google.maps.DirectionsService();    // Khởi tạo DirectionsService - thằng này có nhiệm vụ tính toán chỉ đường cho chúng ta.
        directionsDisplay = new google.maps.DirectionsRenderer({ map: map });    // Khởi tạo DirectionsRenderer - thằng này có nhiệm vụ hiển thị chỉ đường trên bản đồ sau khi đã tính toán.
        var input1 = (document.getElementById("source"));
        var input2 = (document.getElementById("destination"));
        var autocomplete = new google.maps.places.Autocomplete(input1);
        autocomplete.bindTo("bounds", map);
        var autocomplete1 = new google.maps.places.Autocomplete(input2);
        autocomplete1.bindTo("bounds", map);

        if (input1.value != "" && input2.value != "") {
            calculateAndDisplayRoute(directionsService, directionsDisplay);
        }
    }
    function calculateAndDisplayRoute(directionsService, directionsDisplay) {
        var myRoute = null;
        directionsService.route({    // hàm route của DirectionsService sẽ thực hiện tính toán với các tham số truyền vào
            origin: document.getElementById('source').value,    // điểm xuất phát
            destination: document.getElementById('destination').value,    // điểm đích
            travelMode: "DRIVING",     // phương tiện di chuyển
        }, function (response, status) {    // response trả về bao gồm tất cả các thông tin về chỉ đường
            if (status === google.maps.DirectionsStatus.OK) {
                directionsDisplay.setDirections(response); // hiển thị chỉ đường trên bản đồ (nét màu đỏ từ A-B)
                myRoute = response.routes[0].legs[0];
                if (isbool) {
                    document.getElementById('KM').value = myRoute.distance.text;
                    document.getElementById('action').click();
                }
                else {
                    document.getElementById('instructions').textContent = myRoute.distance.text;
                }
            } else {
                window.alert('Request for getting direction is failed due to ' + status);    // Hiển thị lỗi
            }
        });

    }
    function onChangeHandler() {
        isbool = true;
        calculateAndDisplayRoute(directionsService, directionsDisplay);
    }
</script>
<div class="jumbotron jumbotron-fluid mb-5">
    <div class="container text-center py-5">
        <h1 class="text-white display-3">Bản đồ</h1>

    </div>
</div>
<!-- Header End -->
<!-- Contact Start -->
<div class="container-fluid py-5">
    <div class="container">
        <div class="row">
            <div class="col-lg-5 pb-4 pb-lg-0">
                <div class="bg-primary text-dark text-center p-4">
                    <h4 class="m-0"><i class="fa fa-map-marker-alt text-white mr-2"></i>Giao Hàng Chất Lượng</h4>
                </div>
                <div iframe style="width: 100%; height: 470px;" id="map" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false"></div>
            </div>
            <div class="col-lg-7">
                <h6 class="text-primary text-uppercase font-weight-bold">Nhận báo giá</h6>
                <h1 class="mb-4">Hãy nhập địa điểm</h1>
                <div class="contact-form bg-secondary" style="padding: 30px;">
                    <div id="success"></div>
                    <form class="login100-form validate-form" method="post" action="/GiaoHang/Contact">
                        @model GiaoHangTietKiem.Controllers.Model.ShowPrice
                        @Html.AntiForgeryToken()
                        <div class="control-group">
                            <input type="text" class="form-control border-0 p-4" id="source" name="Diemdi" value="@Model.Diemdi" placeholder="Điểm đi"
                                   required="required" data-validation-required-message="Please enter your name" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control border-0 p-4" id="destination" name="Diemden" value="@Model.Diemden" placeholder="Điểm đến"
                                   required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <input name="KM" id="KM" hidden="hidden" />
                        @if (Session["TongTien"] != null)
                        {
                        <div class="control-group" style="margin-top:20px ; float: left; width: 50%;">
                            <b>Quãng đường:</b>
                            <label type="text" class="border-0 p-4" id="instructions"></label>
                        </div>
                        <div class="control-group" style="margin-top:20px ; float: left; width: 50%;">
                            <b>Tổng chi phí:</b>
                            <label type="text" class="border-0 p-4" id="destination">@Session["TongTien"] VNĐ</label>
                        </div>}
                        @if (Session["TongTien"] == null)
                        {
                        <div class="control-group" style="margin-top:20px ;  width: 50%;">
                            <b>Quãng đường:</b>
                            <label type="text" class="border-0 p-4" id="instructions"></label>
                        </div>}
                        <div>
                            <button class="btn btn-primary py-3 px-4" type="button" onclick="onChangeHandler()" id="sendMessageButton">Tính giá tiền</button>
                            <button type="submit" hidden="hidden" id="action"></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Contact End -->