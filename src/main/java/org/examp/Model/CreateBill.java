package org.examp.Model;


import java.util.Date;

public class CreateBill {
    public CreateBill(String tenKH, String sDTKh, Date ngayLapHD, String ls_province, String ls_district, String ls_ward, String diaChiKH, String gioiTinhKH, String tenKN, String sDTKN, String ls_province1, String ls_district1, String ls_ward1, String diaChiKN, String gioiTinhKN, int kg, String maLVC) {
        this.tenKH = tenKH;
        this.sDTKh = sDTKh;
        this.ls_province = ls_province;
        this.ls_district = ls_district;
        this.ls_ward = ls_ward;
        this.diaChiKH = diaChiKH;
        this.gioiTinhKH = gioiTinhKH;
        this.tenKN = tenKN;
        this.sDTKN = sDTKN;
        this.ls_province1 = ls_province1;
        this.ls_district1 = ls_district1;
        this.ls_ward1 = ls_ward1;
        this.diaChiKN = diaChiKN;
        this.gioiTinhKN = gioiTinhKN;
        this.kg = kg;
        this.maLVC = maLVC;
        this.ngayLapHD = ngayLapHD;
    }
    public CreateBill(){}
    private String tenKH;
    private String sDTKh;

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    private Date ngayLapHD;
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getsDTKh() {
        return sDTKh;
    }

    public void setsDTKh(String sDTKh) {
        this.sDTKh = sDTKh;
    }

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

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public String getGioiTinhKH() {
        return gioiTinhKH;
    }

    public void setGioiTinhKH(String gioiTinhKH) {
        this.gioiTinhKH = gioiTinhKH;
    }

    public String getTenKN() {
        return tenKN;
    }

    public void setTenKN(String tenKN) {
        this.tenKN = tenKN;
    }

    public String getsDTKN() {
        return sDTKN;
    }

    public void setsDTKN(String sDTKN) {
        this.sDTKN = sDTKN;
    }

    public String getLs_province1() {
        return ls_province1;
    }

    public void setLs_province1(String ls_province1) {
        this.ls_province1 = ls_province1;
    }

    public String getLs_district1() {
        return ls_district1;
    }

    public void setLs_district1(String ls_district1) {
        this.ls_district1 = ls_district1;
    }

    public String getLs_ward1() {
        return ls_ward1;
    }

    public void setLs_ward1(String ls_ward1) {
        this.ls_ward1 = ls_ward1;
    }

    public String getDiaChiKN() {
        return diaChiKN;
    }

    public void setDiaChiKN(String diaChiKN) {
        this.diaChiKN = diaChiKN;
    }

    public String getGioiTinhKN() {
        return gioiTinhKN;
    }

    public void setGioiTinhKN(String gioiTinhKN) {
        this.gioiTinhKN = gioiTinhKN;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public String getMaLVC() {
        return maLVC;
    }

    public void setMaLVC(String maLVC) {
        this.maLVC = maLVC;
    }
    public String getFullAddressKH(DangKyPhieuGui dangKy){
        return dangKy.getDiaChiKH()+", " + dangKy.getLs_ward() + ", " +dangKy.getLs_district() +", "+dangKy.getLs_province();
    }
    public String getFullAddressKN(DangKyPhieuGui dangKy){
        return dangKy.getDiaChiKN()+", " + dangKy.getLs_ward1() + ", " +dangKy.getLs_district1() +", "+dangKy.getLs_province1();
    }
    private String ls_province;
    private String ls_district;
    private String ls_ward;
    private String diaChiKH;
    private String gioiTinhKH;

    private String tenKN;
    private String sDTKN;
    private String ls_province1;
    private String ls_district1;
    private String ls_ward1;
    private String diaChiKN;
    private String gioiTinhKN;
    private int kg;
    private String maLVC;
}
