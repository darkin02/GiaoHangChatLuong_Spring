/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "hoadonvanchuyen")
@XmlRootElement
public class Hoadonvanchuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SoHD")
    private String soHD;
    @Column(name = "NgayLapHD")
    @Temporal(TemporalType.DATE)
    private Date ngayLapHD;
    @Column(name = "TongTien")
    private BigInteger tongTien;
    @Column(name = "TienVC")
    private BigInteger tienVC;
    @Basic(optional = false)
    @Column(name = "COD")
    private short cod;
    @OneToMany(mappedBy = "soHD")
    private Collection<Cthd> cthdCollection;
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
    @ManyToOne
    private Khachhang maKH;
    @JoinColumn(name = "MaKN", referencedColumnName = "MaKN")
    @ManyToOne
    private Khachnhan maKN;
    @JoinColumn(name = "MaTT", referencedColumnName = "MaTT")
    @ManyToOne(optional = false)
    private Trangthai maTT;
    @JoinColumn(name = "MaLVC", referencedColumnName = "MaLVC")
    @ManyToOne
    private Loaivanchuyen maLVC;
    @JoinColumn(name = "MaTD", referencedColumnName = "MaTD")
    @ManyToOne
    private Tuyenduong maTD;
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV")
    @ManyToOne
    private Nhanvien maNV;

    public Hoadonvanchuyen() {
    }

    public Hoadonvanchuyen(String soHD) {
        this.soHD = soHD;
    }

    public Hoadonvanchuyen(String soHD, short cod) {
        this.soHD = soHD;
        this.cod = cod;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public BigInteger getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigInteger tongTien) {
        this.tongTien = tongTien;
    }

    public BigInteger getTienVC() {
        return tienVC;
    }

    public void setTienVC(BigInteger tienVC) {
        this.tienVC = tienVC;
    }

    public short getCod() {
        return cod;
    }

    public void setCod(short cod) {
        this.cod = cod;
    }

    @XmlTransient
    public Collection<Cthd> getCthdCollection() {
        return cthdCollection;
    }

    public void setCthdCollection(Collection<Cthd> cthdCollection) {
        this.cthdCollection = cthdCollection;
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

    public Trangthai getMaTT() {
        return maTT;
    }

    public void setMaTT(Trangthai maTT) {
        this.maTT = maTT;
    }

    public Loaivanchuyen getMaLVC() {
        return maLVC;
    }

    public void setMaLVC(Loaivanchuyen maLVC) {
        this.maLVC = maLVC;
    }

    public Tuyenduong getMaTD() {
        return maTD;
    }

    public void setMaTD(Tuyenduong maTD) {
        this.maTD = maTD;
    }

    public Nhanvien getMaNV() {
        return maNV;
    }

    public void setMaNV(Nhanvien maNV) {
        this.maNV = maNV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (soHD != null ? soHD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoadonvanchuyen)) {
            return false;
        }
        Hoadonvanchuyen other = (Hoadonvanchuyen) object;
        if ((this.soHD == null && other.soHD != null) || (this.soHD != null && !this.soHD.equals(other.soHD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Hoadonvanchuyen[ soHD=" + soHD + " ]";
    }
    
}
