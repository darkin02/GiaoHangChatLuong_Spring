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
@Table(name = "trangthai")
@XmlRootElement
public class Trangthai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaTT")
    private String maTT;
    @Column(name = "MoTa")
    private String moTa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTT")
    private Collection<Phieuyeucau> phieuyeucauCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTT")
    private Collection<Hoadonvanchuyen> hoadonvanchuyenCollection;

    public Trangthai() {
    }

    public Trangthai(String maTT) {
        this.maTT = maTT;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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
        hash += (maTT != null ? maTT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trangthai)) {
            return false;
        }
        Trangthai other = (Trangthai) object;
        if ((this.maTT == null && other.maTT != null) || (this.maTT != null && !this.maTT.equals(other.maTT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Trangthai[ maTT=" + maTT + " ]";
    }
    
}
