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
@Table(name = "ct_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtRole.findAll", query = "SELECT c FROM CtRole c")
    , @NamedQuery(name = "CtRole.findByMaCTRole", query = "SELECT c FROM CtRole c WHERE c.maCTRole = :maCTRole")
    , @NamedQuery(name = "CtRole.findByTenTK", query = "SELECT c FROM CtRole c WHERE c.tenTK = :tenTK")
    , @NamedQuery(name = "CtRole.findByIDRole", query = "SELECT c FROM CtRole c WHERE c.iDRole = :iDRole")})
public class CtRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MaCTRole")
    private Integer maCTRole;
    @Basic(optional = false)
    @Column(name = "TenTK")
    private String tenTK;
    @Basic(optional = false)
    @Column(name = "IDRole")
    private int iDRole;

    public CtRole() {
    }

    public CtRole(Integer maCTRole) {
        this.maCTRole = maCTRole;
    }

    public CtRole(Integer maCTRole, String tenTK, int iDRole) {
        this.maCTRole = maCTRole;
        this.tenTK = tenTK;
        this.iDRole = iDRole;
    }

    public Integer getMaCTRole() {
        return maCTRole;
    }

    public void setMaCTRole(Integer maCTRole) {
        this.maCTRole = maCTRole;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public int getIDRole() {
        return iDRole;
    }

    public void setIDRole(int iDRole) {
        this.iDRole = iDRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCTRole != null ? maCTRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtRole)) {
            return false;
        }
        CtRole other = (CtRole) object;
        if ((this.maCTRole == null && other.maCTRole != null) || (this.maCTRole != null && !this.maCTRole.equals(other.maCTRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.CtRole[ maCTRole=" + maCTRole + " ]";
    }
    
}
