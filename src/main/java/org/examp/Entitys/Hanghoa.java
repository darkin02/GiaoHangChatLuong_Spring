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

@Table(name = "hanghoa")
@XmlRootElement
@Entity
public class Hanghoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaHH")
    private String maHH;
    @Basic(optional = false)
    @Column(name = "TenHH")
    private String tenHH;
    @Column(name = "MoTa")
    private String moTa;
    @Basic(optional = false)
    @Column(name = "DonVT")
    private String donVT;
    @Basic(optional = false)
    @Column(name = "GiaTien")
    private int giaTien;
    @OneToMany(mappedBy = "maHH")
    private Collection<Cthd> cthdCollection;
    @JoinColumn(name = "MaLHH", referencedColumnName = "MaLHH")
    @ManyToOne
    private Loaihh maLHH;

    public Hanghoa() {
    }

    public Hanghoa(String maHH) {
        this.maHH = maHH;
    }

    public Hanghoa(String maHH, String tenHH, String donVT, int giaTien) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.donVT = donVT;
        this.giaTien = giaTien;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDonVT() {
        return donVT;
    }

    public void setDonVT(String donVT) {
        this.donVT = donVT;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @XmlTransient
    public Collection<Cthd> getCthdCollection() {
        return cthdCollection;
    }

    public void setCthdCollection(Collection<Cthd> cthdCollection) {
        this.cthdCollection = cthdCollection;
    }

    public Loaihh getMaLHH() {
        return maLHH;
    }

    public void setMaLHH(Loaihh maLHH) {
        this.maLHH = maLHH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maHH != null ? maHH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hanghoa)) {
            return false;
        }
        Hanghoa other = (Hanghoa) object;
        if ((this.maHH == null && other.maHH != null) || (this.maHH != null && !this.maHH.equals(other.maHH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Hanghoa[ maHH=" + maHH + " ]";
    }
    
}
