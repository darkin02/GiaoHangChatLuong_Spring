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
@Table(name = "cthd")
@XmlRootElement
public class Cthd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaCTHD")
    private String maCTHD;
    @Basic(optional = false)
    @Column(name = "SoLuong")
    private int soLuong;
    @Basic(optional = false)
    @Column(name = "KG")
    private double kg;
    @JoinColumn(name = "MaHH", referencedColumnName = "MaHH")
    @ManyToOne
    private Hanghoa maHH;
    @JoinColumn(name = "SoHD", referencedColumnName = "SoHD")
    @ManyToOne
    private Hoadonvanchuyen soHD;

    public Cthd() {
    }

    public Cthd(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public Cthd(String maCTHD, int soLuong, double kg) {
        this.maCTHD = maCTHD;
        this.soLuong = soLuong;
        this.kg = kg;
    }

    public String getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public Hanghoa getMaHH() {
        return maHH;
    }

    public void setMaHH(Hanghoa maHH) {
        this.maHH = maHH;
    }

    public Hoadonvanchuyen getSoHD() {
        return soHD;
    }

    public void setSoHD(Hoadonvanchuyen soHD) {
        this.soHD = soHD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCTHD != null ? maCTHD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cthd)) {
            return false;
        }
        Cthd other = (Cthd) object;
        if ((this.maCTHD == null && other.maCTHD != null) || (this.maCTHD != null && !this.maCTHD.equals(other.maCTHD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Cthd[ maCTHD=" + maCTHD + " ]";
    }
    
}
