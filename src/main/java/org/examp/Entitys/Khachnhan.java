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
@Table(name = "khachnhan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachnhan.findAll", query = "SELECT k FROM Khachnhan k")
    , @NamedQuery(name = "Khachnhan.findByMaKN", query = "SELECT k FROM Khachnhan k WHERE k.maKN = :maKN")
    , @NamedQuery(name = "Khachnhan.findByTenKN", query = "SELECT k FROM Khachnhan k WHERE k.tenKN = :tenKN")
    , @NamedQuery(name = "Khachnhan.findBySdt", query = "SELECT k FROM Khachnhan k WHERE k.sdt = :sdt")
    , @NamedQuery(name = "Khachnhan.findByDiaChi", query = "SELECT k FROM Khachnhan k WHERE k.diaChi = :diaChi")
    , @NamedQuery(name = "Khachnhan.findByGioiTinh", query = "SELECT k FROM Khachnhan k WHERE k.gioiTinh = :gioiTinh")})
public class Khachnhan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaKN")
    private String maKN;
    @Basic(optional = false)
    @Column(name = "TenKN")
    private String tenKN;
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic(optional = false)
    @Column(name = "GioiTinh")
    private boolean gioiTinh;
    @OneToMany(mappedBy = "maKN")
    private Collection<Phieuyeucau> phieuyeucauCollection;
    @OneToMany(mappedBy = "maKN")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;

    public Khachnhan() {
    }

    public Khachnhan(String maKN) {
        this.maKN = maKN;
    }

    public Khachnhan(String maKN, String tenKN, String sdt, boolean gioiTinh) {
        this.maKN = maKN;
        this.tenKN = tenKN;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getMaKN() {
        return maKN;
    }

    public void setMaKN(String maKN) {
        this.maKN = maKN;
    }

    public String getTenKN() {
        return tenKN;
    }

    public void setTenKN(String tenKN) {
        this.tenKN = tenKN;
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

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
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
        hash += (maKN != null ? maKN.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachnhan)) {
            return false;
        }
        Khachnhan other = (Khachnhan) object;
        if ((this.maKN == null && other.maKN != null) || (this.maKN != null && !this.maKN.equals(other.maKN))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Khachnhan[ maKN=" + maKN + " ]";
    }
    
}
