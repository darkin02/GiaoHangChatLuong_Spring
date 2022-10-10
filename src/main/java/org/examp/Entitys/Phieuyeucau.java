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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "phieuyeucau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phieuyeucau.findAll", query = "SELECT p FROM Phieuyeucau p")
    , @NamedQuery(name = "Phieuyeucau.findBySoPYC", query = "SELECT p FROM Phieuyeucau p WHERE p.soPYC = :soPYC")
    , @NamedQuery(name = "Phieuyeucau.findByNgayLap", query = "SELECT p FROM Phieuyeucau p WHERE p.ngayLap = :ngayLap")
    , @NamedQuery(name = "Phieuyeucau.findByKhoiLuong", query = "SELECT p FROM Phieuyeucau p WHERE p.khoiLuong = :khoiLuong")
    , @NamedQuery(name = "Phieuyeucau.findByTrangThai", query = "SELECT p FROM Phieuyeucau p WHERE p.trangThai = :trangThai")
    , @NamedQuery(name = "Phieuyeucau.findByThanhToan", query = "SELECT p FROM Phieuyeucau p WHERE p.thanhToan = :thanhToan")})
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
    @Basic(optional = false)
    @Column(name = "TrangThai")
    private boolean trangThai;
    @Column(name = "ThanhToan")
    private BigInteger thanhToan;
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

    public Phieuyeucau(String soPYC, boolean trangThai) {
        this.soPYC = soPYC;
        this.trangThai = trangThai;
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

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public BigInteger getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(BigInteger thanhToan) {
        this.thanhToan = thanhToan;
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
