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
@Table(name = "shop")
@XmlRootElement
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaShop")
    private String maShop;
    @Basic(optional = false)
    @Column(name = "TenShop")
    private String tenShop;
    @Basic(optional = false)
    @Column(name = "NgayDK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDK;
    @Basic(optional = false)
    @Column(name = "TkNganHang")
    private String tkNganHang;
    @Column(name = "MaKH")
    private String maKH;

    public Shop() {
    }

    public Shop(String maShop) {
        this.maShop = maShop;
    }

    public Shop(String maShop, String tenShop, Date ngayDK, String tkNganHang) {
        this.maShop = maShop;
        this.tenShop = tenShop;
        this.ngayDK = ngayDK;
        this.tkNganHang = tkNganHang;
    }

    public String getMaShop() {
        return maShop;
    }

    public void setMaShop(String maShop) {
        this.maShop = maShop;
    }

    public String getTenShop() {
        return tenShop;
    }

    public void setTenShop(String tenShop) {
        this.tenShop = tenShop;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getTkNganHang() {
        return tkNganHang;
    }

    public void setTkNganHang(String tkNganHang) {
        this.tkNganHang = tkNganHang;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maShop != null ? maShop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.maShop == null && other.maShop != null) || (this.maShop != null && !this.maShop.equals(other.maShop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Shop[ maShop=" + maShop + " ]";
    }
    
}
