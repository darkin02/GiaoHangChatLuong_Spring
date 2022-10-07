/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "ctvanchuyen")
@XmlRootElement
public class Ctvanchuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaCTVC")
    private String maCTVC;
    @Column(name = "SoHD")
    private String soHD;
    @Column(name = "MaNK")
    private String maNK;
    @Column(name = "NgayNhapKho")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNhapKho;
    @Column(name = "NgayXuatKho")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayXuatKho;

    public Ctvanchuyen() {
    }

    public Ctvanchuyen(String maCTVC) {
        this.maCTVC = maCTVC;
    }

    public String getMaCTVC() {
        return maCTVC;
    }

    public void setMaCTVC(String maCTVC) {
        this.maCTVC = maCTVC;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getMaNK() {
        return maNK;
    }

    public void setMaNK(String maNK) {
        this.maNK = maNK;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getNgayXuatKho() {
        return ngayXuatKho;
    }

    public void setNgayXuatKho(Date ngayXuatKho) {
        this.ngayXuatKho = ngayXuatKho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCTVC != null ? maCTVC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctvanchuyen)) {
            return false;
        }
        Ctvanchuyen other = (Ctvanchuyen) object;
        if ((this.maCTVC == null && other.maCTVC != null) || (this.maCTVC != null && !this.maCTVC.equals(other.maCTVC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Ctvanchuyen[ maCTVC=" + maCTVC + " ]";
    }
    
}
