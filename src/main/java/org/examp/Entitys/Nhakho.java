/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "nhakho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhakho.findAll", query = "SELECT n FROM Nhakho n")
    , @NamedQuery(name = "Nhakho.findByMaNK", query = "SELECT n FROM Nhakho n WHERE n.maNK = :maNK")
    , @NamedQuery(name = "Nhakho.findByTenNK", query = "SELECT n FROM Nhakho n WHERE n.tenNK = :tenNK")
    , @NamedQuery(name = "Nhakho.findByDienTich", query = "SELECT n FROM Nhakho n WHERE n.dienTich = :dienTich")
    , @NamedQuery(name = "Nhakho.findBySucChua", query = "SELECT n FROM Nhakho n WHERE n.sucChua = :sucChua")
    , @NamedQuery(name = "Nhakho.findByDiaChi", query = "SELECT n FROM Nhakho n WHERE n.diaChi = :diaChi")
    , @NamedQuery(name = "Nhakho.findByMaKV", query = "SELECT n FROM Nhakho n WHERE n.maKV = :maKV")})
public class Nhakho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaNK")
    private String maNK;
    @Basic(optional = false)
    @Column(name = "TenNK")
    private String tenNK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DienTich")
    private Double dienTich;
    @Column(name = "SucChua")
    private Integer sucChua;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "MaKV")
    private String maKV;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNK")
    private Collection<CtTuyenduong> ctTuyenduongCollection;
    @OneToMany(mappedBy = "maNK")
    private Collection<Nhanvien> nhanvienCollection;

    public Nhakho() {
    }

    public Nhakho(String maNK) {
        this.maNK = maNK;
    }

    public Nhakho(String maNK, String tenNK) {
        this.maNK = maNK;
        this.tenNK = tenNK;
    }

    public String getMaNK() {
        return maNK;
    }

    public void setMaNK(String maNK) {
        this.maNK = maNK;
    }

    public String getTenNK() {
        return tenNK;
    }

    public void setTenNK(String tenNK) {
        this.tenNK = tenNK;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getSucChua() {
        return sucChua;
    }

    public void setSucChua(Integer sucChua) {
        this.sucChua = sucChua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }

    @XmlTransient
    public Collection<CtTuyenduong> getCtTuyenduongCollection() {
        return ctTuyenduongCollection;
    }

    public void setCtTuyenduongCollection(Collection<CtTuyenduong> ctTuyenduongCollection) {
        this.ctTuyenduongCollection = ctTuyenduongCollection;
    }

    @XmlTransient
    public Collection<Nhanvien> getNhanvienCollection() {
        return nhanvienCollection;
    }

    public void setNhanvienCollection(Collection<Nhanvien> nhanvienCollection) {
        this.nhanvienCollection = nhanvienCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNK != null ? maNK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhakho)) {
            return false;
        }
        Nhakho other = (Nhakho) object;
        if ((this.maNK == null && other.maNK != null) || (this.maNK != null && !this.maNK.equals(other.maNK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Nhakho[ maNK=" + maNK + " ]";
    }
    
}
