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
@Table(name = "ct_tuyenduong")
@XmlRootElement
public class CtTuyenduong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Ma_CTTD")
    private String maCTTD;
    @Basic(optional = false)
    @Column(name = "MaKhoDen")
    private String maKhoDen;
    @JoinColumn(name = "MaNK", referencedColumnName = "MaNK")
    @ManyToOne(optional = false)
    private Nhakho maNK;
    @JoinColumn(name = "MaTD", referencedColumnName = "MaTD")
    @ManyToOne(optional = false)
    private Tuyenduong maTD;

    public CtTuyenduong() {
    }

    public CtTuyenduong(String maCTTD) {
        this.maCTTD = maCTTD;
    }

    public CtTuyenduong(String maCTTD, String maKhoDen) {
        this.maCTTD = maCTTD;
        this.maKhoDen = maKhoDen;
    }

    public String getMaCTTD() {
        return maCTTD;
    }

    public void setMaCTTD(String maCTTD) {
        this.maCTTD = maCTTD;
    }

    public String getMaKhoDen() {
        return maKhoDen;
    }

    public void setMaKhoDen(String maKhoDen) {
        this.maKhoDen = maKhoDen;
    }

    public Nhakho getMaNK() {
        return maNK;
    }

    public void setMaNK(Nhakho maNK) {
        this.maNK = maNK;
    }

    public Tuyenduong getMaTD() {
        return maTD;
    }

    public void setMaTD(Tuyenduong maTD) {
        this.maTD = maTD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCTTD != null ? maCTTD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtTuyenduong)) {
            return false;
        }
        CtTuyenduong other = (CtTuyenduong) object;
        if ((this.maCTTD == null && other.maCTTD != null) || (this.maCTTD != null && !this.maCTTD.equals(other.maCTTD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.CtTuyenduong[ maCTTD=" + maCTTD + " ]";
    }
    
}
