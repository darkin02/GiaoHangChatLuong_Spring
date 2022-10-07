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
@Table(name = "loaihh")
@XmlRootElement
public class Loaihh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaLHH")
    private String maLHH;
    @Basic(optional = false)
    @Column(name = "TenLHH")
    private String tenLHH;
    @OneToMany(mappedBy = "maLHH")
    private Collection<Hanghoa> hanghoaCollection;

    public Loaihh() {
    }

    public Loaihh(String maLHH) {
        this.maLHH = maLHH;
    }

    public Loaihh(String maLHH, String tenLHH) {
        this.maLHH = maLHH;
        this.tenLHH = tenLHH;
    }

    public String getMaLHH() {
        return maLHH;
    }

    public void setMaLHH(String maLHH) {
        this.maLHH = maLHH;
    }

    public String getTenLHH() {
        return tenLHH;
    }

    public void setTenLHH(String tenLHH) {
        this.tenLHH = tenLHH;
    }

    @XmlTransient
    public Collection<Hanghoa> getHanghoaCollection() {
        return hanghoaCollection;
    }

    public void setHanghoaCollection(Collection<Hanghoa> hanghoaCollection) {
        this.hanghoaCollection = hanghoaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maLHH != null ? maLHH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loaihh)) {
            return false;
        }
        Loaihh other = (Loaihh) object;
        if ((this.maLHH == null && other.maLHH != null) || (this.maLHH != null && !this.maLHH.equals(other.maLHH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Loaihh[ maLHH=" + maLHH + " ]";
    }
    
}
