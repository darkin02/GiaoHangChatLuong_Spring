package org.examp.Model;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Khachhang;
import org.examp.Entitys.Khachnhan;
import org.examp.Service.impl.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;

public class TheoDoi {

    private String TenKH ;

    private String SDTKH ;

    private String DiaChiKH ;

    private String TenKN ;

    private String SDTKN ;

    private String DiaChiKN ;

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getSDTKH() {
        return SDTKH;
    }

    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }

    public String getDiaChiKH() {
        return DiaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        DiaChiKH = diaChiKH;
    }

    public String getTenKN() {
        return TenKN;
    }

    public void setTenKN(String tenKN) {
        TenKN = tenKN;
    }

    public String getSDTKN() {
        return SDTKN;
    }

    public void setSDTKN(String SDTKN) {
        this.SDTKN = SDTKN;
    }

    public String getDiaChiKN() {
        return DiaChiKN;
    }

    public void setDiaChiKN(String diaChiKN) {
        DiaChiKN = diaChiKN;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public long getTongTien() {
        return TongTien;
    }

    public void setTongTien(long tongTien) {
        TongTien = tongTien;
    }

    public Boolean getCOD() {
        return COD;
    }

    public void setCOD(Boolean COD) {
        this.COD = COD;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        TrangThai = trangThai;
    }

    private String MaKH ;

    private long TongTien ;

    private Boolean COD ;

    private Boolean TrangThai ;
    public TheoDoi() { }
    public TheoDoi(Hoadonvanchuyen HD)
    {
        Khachhang KH = HD.getMaKH();
        Khachnhan KN = HD.getMaKN();
        TenKH = KH.getTenKH();
        SDTKH = KH.getSdt();
        DiaChiKH = KH.getDiaChi();
        TenKN = KN.getTenKN();
        SDTKN = KN.getSdt();
        DiaChiKN = KN.getDiaChi();
        COD = HD.getCod()==Short.valueOf("0")?true:false;
        TongTien = Long.valueOf(HD.getTongTien().intValue());
        TrangThai = HD.getMaTT().getMaTT().equals("TT01");
        MaKH = KH.getMaKH();
    }
}
