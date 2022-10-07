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
@Table(name = "loaivanchuyen")
@XmlRootElement
public class Loaivanchuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaLVC")
    private String maLVC;
    @Basic(optional = false)
    @Column(name = "TenLVC")
    private String tenLVC;
    @Basic(optional = false)
    @Column(name = "Gia")
    private double gia;
    @OneToMany(mappedBy = "maLVC")
    private Collection<Tuyenduong> tuyenduongCollection;
    @OneToMany(mappedBy = "maLVC")
    private Collection<Phieuyeucau> phieuyeucauCollection;
    @OneToMany(mappedBy = "maLVC")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;

    public Loaivanchuyen() {
    }

    public Loaivanchuyen(String maLVC) {
        this.maLVC = maLVC;
    }

    public Loaivanchuyen(String maLVC, String tenLVC, double gia) {
        this.maLVC = maLVC;
        this.tenLVC = tenLVC;
        this.gia = gia;
    }

    public String getMaLVC() {
        return maLVC;
    }

    public void setMaLVC(String maLVC) {
        this.maLVC = maLVC;
    }

    public String getTenLVC() {
        return tenLVC;
    }

    public void setTenLVC(String tenLVC) {
        this.tenLVC = tenLVC;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @XmlTransient
    public Collection<Tuyenduong> getTuyenduongCollection() {
        return tuyenduongCollection;
    }

    public void setTuyenduongCollection(Collection<Tuyenduong> tuyenduongCollection) {
        this.tuyenduongCollection = tuyenduongCollection;
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
        hash += (maLVC != null ? maLVC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loaivanchuyen)) {
            return false;
        }
        Loaivanchuyen other = (Loaivanchuyen) object;
        if ((this.maLVC == null && other.maLVC != null) || (this.maLVC != null && !this.maLVC.equals(other.maLVC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Loaivanchuyen[ maLVC=" + maLVC + " ]";
    }
    
}
