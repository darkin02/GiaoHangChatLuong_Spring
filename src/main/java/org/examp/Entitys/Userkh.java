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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "userkh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userkh.findAll", query = "SELECT u FROM Userkh u")
    , @NamedQuery(name = "Userkh.findBySdt", query = "SELECT u FROM Userkh u WHERE u.sdt = :sdt")
    , @NamedQuery(name = "Userkh.findByMatKhau", query = "SELECT u FROM Userkh u WHERE u.matKhau = :matKhau")
    , @NamedQuery(name = "Userkh.findByEmail", query = "SELECT u FROM Userkh u WHERE u.email = :email")
    , @NamedQuery(name = "Userkh.findByUserName", query = "SELECT u FROM Userkh u WHERE u.userName = :userName")
    , @NamedQuery(name = "Userkh.findByAuthkey", query = "SELECT u FROM Userkh u WHERE u.authkey = :authkey")})
public class Userkh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @Basic(optional = false)
    @Column(name = "MatKhau")
    private String matKhau;
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Column(name = "authkey")
    private String authkey;
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
    @ManyToOne
    private Khachhang maKH;

    public Userkh() {
    }

    public Userkh(String sdt) {
        this.sdt = sdt;
    }

    public Userkh(String sdt, String matKhau, String userName) {
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.userName = userName;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sdt != null ? sdt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userkh)) {
            return false;
        }
        Userkh other = (Userkh) object;
        if ((this.sdt == null && other.sdt != null) || (this.sdt != null && !this.sdt.equals(other.sdt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Userkh[ sdt=" + sdt + " ]";
    }
    
}
