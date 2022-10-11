package org.examp.Model;

import java.util.ArrayList;
import java.util.List;

public class Blog_ItemModel {
    public Blog_ItemModel(String link, String author, String author_Img, String category, String title, String solution)
    {
        this.Link = link;
        this.Author = author;
        this.Author_Img = author_Img;
        this.Category = category;
        this.Title = title;
        this.Solution = solution;
    }
    public Blog_ItemModel() { }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getAuthor_Img() {
        return Author_Img;
    }

    public void setAuthor_Img(String author_Img) {
        Author_Img = author_Img;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSolution() {
        return Solution;
    }

    public void setSolution(String solution) {
        Solution = solution;
    }

    private String Link ;
    private String Author ;
    private String Author_Img ;
    private String Category ;
    private String Title ;
    private String Solution ;

    public static List<Blog_ItemModel> Init()
    {
        List<Blog_ItemModel> lst = new ArrayList<>();
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/Dung-Poster-Kid-talent-05-2.jpg", "Mạnh Cường", "/img/Cuong.jpg", "Blog", "THÔNG BÁO PHÁT ĐỘNG CUỘC THI TÀI NĂNG NHÍ NHÀ KIỆM GHTK KID’S TALENT 2022", "Mỗi đứa trẻ đều có trong mình một ước mơ. Ba mẹ là người giúp con khám phá và nuôi dưỡng ước mơ từ những năng khiếu thuở bé."));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/06/3_zing_Copy.jpg", "Định Thuận", "/img/Thuan.jpg", "Blog", "Ngày càng nhiều doanh nghiệp quan tâm đến môi trường", "Giám đốc Trung tâm Bảo tồn Thiên nhiên Gaia cho rằng ngày càng nhiều doanh nghiệp quan tâm đến môi trường, lan tỏa tình yêu thiên nhiên đến nhân viên. Báo cáo hiện trạng môi trường giai đoạn 2016-2020 chỉ ra trong 4 năm đầu 2016-2019, nền kinh tế Việt Nam đạt mức tăng trưởng …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/06/Anh_2_Zing-1.jpg", "Văn Thịnh", "/img/Thinh.jpg", "Blog", "Gieo mầm xanh, phát triển hệ sinh thái rừng ngập mặn Cần Giờ", "Từ vùng đất chết do chiến tranh tàn phá, rừng ngập mặn Cần Giờ hồi sinh kỳ diệu nhờ những mầm xanh không ngừng được gieo trồng, bảo vệ. Nằm ở phía đông nam và cách TP.HCM hơn 50 km, đặc trưng nổi tiếng của Cần Giờ là những khu rừng ngập mặn xanh mướt …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/DSC01046.png", "Văn Thịnh", "/img/Thinh.jpg", "Blog", "Ann Na Kim – chỉ cần nhẫn nại, chỉ cần chăm chỉ ắt sẽ thành công", "3 lần khởi nghiệp bán hàng online từ con số 0 và lần nào cũng thành công của một cô gái giao dịch viên ngành ngân hàng – Có thể nói em khởi nghiệp đi khởi nghiệp lại đến 3 lần. Hết bán online lại đi làm, hết đi làm lại lấy chồng đi đẻ, …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/DSC09695-1.jpg", "Nhựt Trường", "/img/Truong.jpg", "Blog", "Xưởng May HHA – Trong cái khó mình có cái hay", "Từ một tiểu thương truyền thống chuyển qua bán hàng online ở cái ngưỡng lục tuần Trước đây chị Hằng chuyên cung cấp hàng sỉ ở chợ Đồng Xuân, suốt ngày ở trên xưởng may để theo dõi lô hàng, đôi khi thiếu người ở khâu nào chị lại lao vào làm luôn tay luôn …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/280037533_3234419330132160_1044418272388862281_n-1.jpg", "Nhựt Trường", "/img/Truong.jpg", "Blog", "ĐỘI TRƯỞNG COD STAR/XSTAR ĐỨNG LỚP ĐÀO TẠO TÂN BINH TRÊN KHẮP CẢ NƯỚC", "Các lớp học đào tạo tân binh do Đội trưởng COD Star/Xstar đứng lớp vẫn liên tục được diễn ra trong thời gian qua. Đây là cơ hội để các tân binh COD/Xteam trải nghiệm những bài học thực tế đồng thời tích lũy kinh nghiệm, nâng cao khả năng nghiệp vụ của mình. ĐỘI …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/DSC01472-JPG-5943-1652526473.jpg", "Định Thuận", "/img/Thuan.jpg", "Blog", "Khởi công 6 cầu Hy Vọng", "Quỹ Hy Vọng phối hợp Tỉnh Đoàn Đồng Tháp, Công ty Cổ phần Giao Hàng Tiết Kiệm khởi công 6 cầu tại huyện Châu Thành, hôm 14/5. Sáng sớm bà Lê Thị Kim Mới khấp khởi cùng hàng xóm đến địa điểm khởi công cầu Cồn Mới (xã An Nhơn, huyện Châu Thành). Bà cho …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/5d035a08-4502-43a5-950a-abe34fc6f197-1652247208981.png", "Định Thuận", "/img/Thuan.jpg", "Blog", "Giao Hàng Tiết Kiệm ủng hộ hơn 870 triệu đồng xây nhà bán trú tặng học sinh", "Chia sẻ với gần 100 em học sinh nghèo phải nằm sạp gỗ, giường tre bám trường, Công ty cổ phần Giao Hàng Tiết Kiệm ủng hộ hơn 870 triệu đồng cùng báo Dân trí xây dựng nhà bán trú dành tặng các em. Bài báo “Xót xa gần một trăm học sinh nghèo nằm sạp …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/05/tai-ightk-website.png", "Mạnh Cường", "/img/Cuong.jpg", "Blog", "TẢI iGHTK HĂNG SAY – NHẬN TIỀN LIỀN TAY", "Chào bạn mới nhận tiền hời! “Gia nhập” iGHTK thành công để ẵm trọn 10K và vô vàn phần quà độc đáo Nhà Kiệm! Tracking đơn hàng dễ dàng, tha hồ mua sắm, nhận quà bao la. –  10.000 đồng – Vô vàn quà chất lừ Nhà Kiệm – Duy nhất 06/05/2022 – 13/05/2022 Thao …"));
        lst.add(new Blog_ItemModel("https://giaohangtietkiem.vn/wp-content/uploads/2022/04/DSC000151.jpg", "Mạnh Cường", "/img/Cuong.jpg", "Blog", "Có một Bình Book, sống vừa đủ và trọn vẹn với đam mê", "Một nửa sự thật không phải là sự thật – Một nửa sự thật không phải là sự thật  Anh Bình cười hề hề khi được hỏi về cái danh “ông Bình Book” vang tiếng mà giới sách hay quen miệng gọi anh mỗi khi nhắc tới như là một kẻ ngạo nghễ, am hiểu …"));
        return lst;
    }
}
