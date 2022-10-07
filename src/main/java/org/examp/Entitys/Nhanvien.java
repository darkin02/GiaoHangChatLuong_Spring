/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
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
@Table(name = "nhanvien")
@XmlRootElement
public class Nhanvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaNV")
    private String maNV;
    @Basic(optional = false)
    @Column(name = "TenNV")
    private String tenNV;
    @Basic(optional = false)
    @Column(name = "NgaySinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Basic(optional = false)
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic(optional = false)
    @Column(name = "ChucVu")
    private String chucVu;
    @Basic(optional = false)
    @Column(name = "BacLuong")
    private double bacLuong;
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "GioiTinh")
    private Short gioiTinh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNV")
    private Collection<Taikhoan> taikhoanCollection;
    @OneToMany(mappedBy = "maNV")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;
    @JoinColumn(name = "MaPB", referencedColumnName = "MaPB")
    @ManyToOne(optional = false)
    private Phongban maPB;
    @JoinColumn(name = "MaNK", referencedColumnName = "MaNK")
    @ManyToOne
    private Nhakho maNK;

    public Nhanvien() {
    }

    public Nhanvien(String maNV) {
        this.maNV = maNV;
    }

    public Nhanvien(String maNV, String tenNV, Date ngaySinh, String diaChi, String chucVu, double bacLuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.bacLuong = bacLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(double bacLuong) {
        this.bacLuong = bacLuong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Short getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Short gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @XmlTransient
    public Collection<Taikhoan> getTaikhoanCollection() {
        return taikhoanCollection;
    }

    public void setTaikhoanCollection(Collection<Taikhoan> taikhoanCollection) {
        this.taikhoanCollection = taikhoanCollection;
    }

    @XmlTransient
    public Collection<Hoadonvanchuyen> getHoadonvanchuyenCollection() {
        return hoadonvanchuyenCollection;
    }

    public void setHoadonvanchuyenCollection(Collection<Hoadonvanchuyen> hoadonvanchuyenCollection) {
        this.hoadonvanchuyenCollection = hoadonvanchuyenCollection;
    }

    public Phongban getMaPB() {
        return maPB;
    }

    public void setMaPB(Phongban maPB) {
        this.maPB = maPB;
    }

    public Nhakho getMaNK() {
        return maNK;
    }

    public void setMaNK(Nhakho maNK) {
        this.maNK = maNK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNV != null ? maNV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.maNV == null && other.maNV != null) || (this.maNV != null && !this.maNV.equals(other.maNV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Nhanvien[ maNV=" + maNV + " ]";
    }
    
}
