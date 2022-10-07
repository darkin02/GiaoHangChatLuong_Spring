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
@Table(name = "taikhoan")
@XmlRootElement
public class Taikhoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TenTK")
    private String tenTK;
    @Basic(optional = false)
    @Column(name = "MatKhau")
    private String matKhau;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Column(name = "LoaiTK")
    private Short loaiTK;
    @Column(name = "TrangThai")
    private Short trangThai;
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV")
    @ManyToOne(optional = false)
    private Nhanvien maNV;

    public Taikhoan() {
    }

    public Taikhoan(String tenTK) {
        this.tenTK = tenTK;
    }

    public Taikhoan(String tenTK, String matKhau, String email) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.email = email;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(Short loaiTK) {
        this.loaiTK = loaiTK;
    }

    public Short getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Short trangThai) {
        this.trangThai = trangThai;
    }

    public Nhanvien getMaNV() {
        return maNV;
    }

    public void setMaNV(Nhanvien maNV) {
        this.maNV = maNV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenTK != null ? tenTK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taikhoan)) {
            return false;
        }
        Taikhoan other = (Taikhoan) object;
        if ((this.tenTK == null && other.tenTK != null) || (this.tenTK != null && !this.tenTK.equals(other.tenTK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Taikhoan[ tenTK=" + tenTK + " ]";
    }
    
}
