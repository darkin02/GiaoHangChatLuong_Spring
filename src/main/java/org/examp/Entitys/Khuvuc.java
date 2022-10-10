/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "khuvuc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khuvuc.findAll", query = "SELECT k FROM Khuvuc k")
    , @NamedQuery(name = "Khuvuc.findByMaKV", query = "SELECT k FROM Khuvuc k WHERE k.maKV = :maKV")
    , @NamedQuery(name = "Khuvuc.findByTenKV", query = "SELECT k FROM Khuvuc k WHERE k.tenKV = :tenKV")
    , @NamedQuery(name = "Khuvuc.findBySoNhaKho", query = "SELECT k FROM Khuvuc k WHERE k.soNhaKho = :soNhaKho")})
public class Khuvuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaKV")
    private String maKV;
    @Basic(optional = false)
    @Column(name = "TenKV")
    private String tenKV;
    @Basic(optional = false)
    @Column(name = "SoNhaKho")
    private int soNhaKho;

    public Khuvuc() {
    }

    public Khuvuc(String maKV) {
        this.maKV = maKV;
    }

    public Khuvuc(String maKV, String tenKV, int soNhaKho) {
        this.maKV = maKV;
        this.tenKV = tenKV;
        this.soNhaKho = soNhaKho;
    }

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }

    public String getTenKV() {
        return tenKV;
    }

    public void setTenKV(String tenKV) {
        this.tenKV = tenKV;
    }

    public int getSoNhaKho() {
        return soNhaKho;
    }

    public void setSoNhaKho(int soNhaKho) {
        this.soNhaKho = soNhaKho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maKV != null ? maKV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khuvuc)) {
            return false;
        }
        Khuvuc other = (Khuvuc) object;
        if ((this.maKV == null && other.maKV != null) || (this.maKV != null && !this.maKV.equals(other.maKV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Khuvuc[ maKV=" + maKV + " ]";
    }
    
}
