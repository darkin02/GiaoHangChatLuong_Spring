/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "khachhang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachhang.findAll", query = "SELECT k FROM Khachhang k")
    , @NamedQuery(name = "Khachhang.findByMaKH", query = "SELECT k FROM Khachhang k WHERE k.maKH = :maKH")
    , @NamedQuery(name = "Khachhang.findByTenKH", query = "SELECT k FROM Khachhang k WHERE k.tenKH = :tenKH")
    , @NamedQuery(name = "Khachhang.findBySdt", query = "SELECT k FROM Khachhang k WHERE k.sdt = :sdt")
    , @NamedQuery(name = "Khachhang.findByDiaChi", query = "SELECT k FROM Khachhang k WHERE k.diaChi = :diaChi")
    , @NamedQuery(name = "Khachhang.findByGioiTinh", query = "SELECT k FROM Khachhang k WHERE k.gioiTinh = :gioiTinh")})
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaKH")
    private String maKH;
    @Basic(optional = false)
    @Column(name = "TenKH")
    private String tenKH;
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic(optional = false)
    @Column(name = "GioiTinh")
    private short gioiTinh;
    @OneToMany(mappedBy = "maKH")
    private Collection<Userkh> userkhCollection;
    @OneToMany(mappedBy = "maKH")
    private Collection<Phieuyeucau> phieuyeucauCollection;
    @OneToMany(mappedBy = "maKH")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;

    public Khachhang() {
    }

    public Khachhang(String maKH) {
        this.maKH = maKH;
    }

    public Khachhang(String maKH, String tenKH, String sdt, short gioiTinh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public short getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(short gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @XmlTransient
    public Collection<Userkh> getUserkhCollection() {
        return userkhCollection;
    }

    public void setUserkhCollection(Collection<Userkh> userkhCollection) {
        this.userkhCollection = userkhCollection;
    }

    @XmlTransient
    public Collection<Phieuyeucau> getPhieuyeucauCollection() {
        return phieuyeucauCollection;
    }

    public void setPhieuyeucauCollection(Collection<Phieuyeucau> phieuyeucauCollection) {
        this.phieuyeucauCollection = phieuyeucauCollection;
    }

    @XmlTransient
    public Collection<Hoadonvanchuyen> getHoadonvanchuyenCollection() {
        return hoadonvanchuyenCollection;
    }

    public void setHoadonvanchuyenCollection(Collection<Hoadonvanchuyen> hoadonvanchuyenCollection) {
        this.hoadonvanchuyenCollection = hoadonvanchuyenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maKH != null ? maKH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.maKH == null && other.maKH != null) || (this.maKH != null && !this.maKH.equals(other.maKH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Khachhang[ maKH=" + maKH + " ]";
    }
    
}
