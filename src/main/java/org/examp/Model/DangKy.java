package org.examp.Model;

public class DangKy {
    public DangKy() { }
    private String TenKH;

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    private String SDT;

    public String getLs_province() {
        return ls_province;
    }

    public void setLs_province(String ls_province) {
        this.ls_province = ls_province;
    }

    public String getLs_district() {
        return ls_district;
    }

    public void setLs_district(String ls_district) {
        this.ls_district = ls_district;
    }

    public String getLs_ward() {
        return ls_ward;
    }

    public void setLs_ward(String ls_ward) {
        this.ls_ward = ls_ward;
    }

    private String ls_province;
    private String ls_district;
    private String ls_ward;
    private String DiaChi;

    private String GioiTinh;

    private String MatKhau;

    private String Email;

    private String MaKH;

    private String UserName;

    public DangKy (String tenKH, String sDT, String diaChi, String gioiTinh, String matKhau, String email, String maKH, String userName)
    {
        TenKH = tenKH;
        SDT = sDT;
        DiaChi = diaChi;
        GioiTinh = gioiTinh;
        MatKhau = matKhau;
        Email = email;
        MaKH = maKH;
        UserName = userName;
    }
    public DangKy(String tenKH, String sDT, String ls_province, String ls_district, String ls_ward, String diaChi, String gioiTinh, String matKhau, String email, String maKH, String userName)
    {
        TenKH = tenKH;
        SDT = sDT;
        this.ls_province = ls_province;
        this.ls_district = ls_district;
        this.ls_ward = ls_ward;
        DiaChi = diaChi;
        GioiTinh = gioiTinh;
        MatKhau = matKhau;
        Email = email;
        MaKH = maKH;
        UserName = userName;
    }
    public String getTenKH() {
        return TenKH;
    }

    public String getFullAddress(DangKy dangKy){
        return dangKy.getDiaChi()+", " + dangKy.getLs_ward() + ", " +dangKy.getLs_district() +", "+dangKy.getLs_province();
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }
}
