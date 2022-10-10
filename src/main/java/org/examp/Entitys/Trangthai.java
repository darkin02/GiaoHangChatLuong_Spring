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
@Table(name = "trangthai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trangthai.findAll", query = "SELECT t FROM Trangthai t")
    , @NamedQuery(name = "Trangthai.findByMaTT", query = "SELECT t FROM Trangthai t WHERE t.maTT = :maTT")
    , @NamedQuery(name = "Trangthai.findByMoTa", query = "SELECT t FROM Trangthai t WHERE t.moTa = :moTa")})
public class Trangthai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaTT")
    private String maTT;
    @Column(name = "MoTa")
    private String moTa;
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
