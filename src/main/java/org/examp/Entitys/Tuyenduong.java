/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "tuyenduong")
@XmlRootElement
public class Tuyenduong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaTD")
    private String maTD;
    @Basic(optional = false)
    @Column(name = "TenTD")
    private String tenTD;
    @Basic(optional = false)
    @Column(name = "ThoiGian")
    private int thoiGian;
    @Basic(optional = false)
    @Column(name = "MaKhoBD")
    private String maKhoBD;
    @Basic(optional = false)
    @Column(name = "MaKhoKT")
    private String maKhoKT;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTD")
    private Collection<CtTuyenduong> ctTuyenduongCollection;
    @JoinColumn(name = "MaLVC", referencedColumnName = "MaLVC")
    @ManyToOne
    private Loaivanchuyen maLVC;
    @OneToMany(mappedBy = "maTD")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;

    public Tuyenduong() {
    }

    public Tuyenduong(String maTD) {
        this.maTD = maTD;
    }

    public Tuyenduong(String maTD, String tenTD, int thoiGian, String maKhoBD, String maKhoKT) {
        this.maTD = maTD;
        this.tenTD = tenTD;
        this.thoiGian = thoiGian;
        this.maKhoBD = maKhoBD;
        this.maKhoKT = maKhoKT;
    }

    public String getMaTD() {
        return maTD;
    }

    public void setMaTD(String maTD) {
        this.maTD = maTD;
    }

    public String getTenTD() {
        return tenTD;
    }

    public void setTenTD(String tenTD) {
        this.tenTD = tenTD;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getMaKhoBD() {
        return maKhoBD;
    }

    public void setMaKhoBD(String maKhoBD) {
        this.maKhoBD = maKhoBD;
    }

    public String getMaKhoKT() {
        return maKhoKT;
    }

    public void setMaKhoKT(String maKhoKT) {
        this.maKhoKT = maKhoKT;
    }

    @XmlTransient
    public Collection<CtTuyenduong> getCtTuyenduongCollection() {
        return ctTuyenduongCollection;
    }

    public void setCtTuyenduongCollection(Collection<CtTuyenduong> ctTuyenduongCollection) {
        this.ctTuyenduongCollection = ctTuyenduongCollection;
    }

    public Loaivanchuyen getMaLVC() {
        return maLVC;
    }

    public void setMaLVC(Loaivanchuyen maLVC) {
        this.maLVC = maLVC;
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
        hash += (maTD != null ? maTD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tuyenduong)) {
            return false;
        }
        Tuyenduong other = (Tuyenduong) object;
        if ((this.maTD == null && other.maTD != null) || (this.maTD != null && !this.maTD.equals(other.maTD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Tuyenduong[ maTD=" + maTD + " ]";
    }
    
}
