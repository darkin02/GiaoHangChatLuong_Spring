/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "phieuyeucau")
@XmlRootElement
public class Phieuyeucau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SoPYC")
    private String soPYC;
    @Column(name = "NgayLap")
    @Temporal(TemporalType.DATE)
    private Date ngayLap;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KhoiLuong")
    private BigDecimal khoiLuong;
    @Column(name = "ThanhToan")
    private BigInteger thanhToan;
    @JoinColumn(name = "MaTT", referencedColumnName = "MaTT")
    @ManyToOne(optional = false)
    private Trangthai maTT;
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
    @ManyToOne
    private Khachhang maKH;
    @JoinColumn(name = "MaKN", referencedColumnName = "MaKN")
    @ManyToOne
    private Khachnhan maKN;
    @JoinColumn(name = "MaLVC", referencedColumnName = "MaLVC")
    @ManyToOne
    private Loaivanchuyen maLVC;

    public Phieuyeucau() {
    }

    public Phieuyeucau(String soPYC) {
        this.soPYC = soPYC;
    }

    public String getSoPYC() {
        return soPYC;
    }

    public void setSoPYC(String soPYC) {
        this.soPYC = soPYC;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public BigDecimal getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(BigDecimal khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public BigInteger getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(BigInteger thanhToan) {
        this.thanhToan = thanhToan;
    }

    public Trangthai getMaTT() {
        return maTT;
    }

    public void setMaTT(Trangthai maTT) {
        this.maTT = maTT;
    }

    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }

    public Khachnhan getMaKN() {
        return maKN;
    }

    public void setMaKN(Khachnhan maKN) {
        this.maKN = maKN;
    }

    public Loaivanchuyen getMaLVC() {
        return maLVC;
    }

    public void setMaLVC(Loaivanchuyen maLVC) {
        this.maLVC = maLVC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (soPYC != null ? soPYC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phieuyeucau)) {
            return false;
        }
        Phieuyeucau other = (Phieuyeucau) object;
        if ((this.soPYC == null && other.soPYC != null) || (this.soPYC != null && !this.soPYC.equals(other.soPYC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Phieuyeucau[ soPYC=" + soPYC + " ]";
    }
    
}
