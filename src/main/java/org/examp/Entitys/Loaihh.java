/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examp.Entitys;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "loaihh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loaihh.findAll", query = "SELECT l FROM Loaihh l")
    , @NamedQuery(name = "Loaihh.findByMaLHH", query = "SELECT l FROM Loaihh l WHERE l.maLHH = :maLHH")
    , @NamedQuery(name = "Loaihh.findByTenLHH", query = "SELECT l FROM Loaihh l WHERE l.tenLHH = :tenLHH")
    , @NamedQuery(name = "Loaihh.findByPhuThu", query = "SELECT l FROM Loaihh l WHERE l.phuThu = :phuThu")})
public class Loaihh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaLHH")
    private String maLHH;
    @Basic(optional = false)
    @Column(name = "TenLHH")
    private String tenLHH;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PhuThu")
    private BigDecimal phuThu;

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

    public BigDecimal getPhuThu() {
        return phuThu;
    }

    public void setPhuThu(BigDecimal phuThu) {
        this.phuThu = phuThu;
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
