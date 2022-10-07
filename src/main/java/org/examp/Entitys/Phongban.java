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
@Table(name = "phongban")
@XmlRootElement
public class Phongban implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaPB")
    private String maPB;
    @Basic(optional = false)
    @Column(name = "TenPB")
    private String tenPB;
    @Column(name = "NhiemVu")
    private String nhiemVu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maPB")
    private Collection<Nhanvien> nhanvienCollection;

    public Phongban() {
    }

    public Phongban(String maPB) {
        this.maPB = maPB;
    }

    public Phongban(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
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
        hash += (maPB != null ? maPB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phongban)) {
            return false;
        }
        Phongban other = (Phongban) object;
        if ((this.maPB == null && other.maPB != null) || (this.maPB != null && !this.maPB.equals(other.maPB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Phongban[ maPB=" + maPB + " ]";
    }
    
}
