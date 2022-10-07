/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "loaighg")
@XmlRootElement
public class Loaighg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaLGHG")
    private String maLGHG;
    @Basic(optional = false)
    @Column(name = "TenLGHG")
    private String tenLGHG;
    @Basic(optional = false)
    @Column(name = "GiaTien")
    private int giaTien;
    @Basic(optional = false)
    @Column(name = "KGToiDa")
    private int kGToiDa;

    public Loaighg() {
    }

    public Loaighg(String maLGHG) {
        this.maLGHG = maLGHG;
    }

    public Loaighg(String maLGHG, String tenLGHG, int giaTien, int kGToiDa) {
        this.maLGHG = maLGHG;
        this.tenLGHG = tenLGHG;
        this.giaTien = giaTien;
        this.kGToiDa = kGToiDa;
    }

    public String getMaLGHG() {
        return maLGHG;
    }

    public void setMaLGHG(String maLGHG) {
        this.maLGHG = maLGHG;
    }

    public String getTenLGHG() {
        return tenLGHG;
    }

    public void setTenLGHG(String tenLGHG) {
        this.tenLGHG = tenLGHG;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getKGToiDa() {
        return kGToiDa;
    }

    public void setKGToiDa(int kGToiDa) {
        this.kGToiDa = kGToiDa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maLGHG != null ? maLGHG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loaighg)) {
            return false;
        }
        Loaighg other = (Loaighg) object;
        if ((this.maLGHG == null && other.maLGHG != null) || (this.maLGHG != null && !this.maLGHG.equals(other.maLGHG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Loaighg[ maLGHG=" + maLGHG + " ]";
    }
    
}
