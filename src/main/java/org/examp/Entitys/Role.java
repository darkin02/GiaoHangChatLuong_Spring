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
@Table(name = "role")
@XmlRootElement
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRole")
    private Integer iDRole;
    @Column(name = "RoleName")
    private String roleName;

    public Role() {
    }

    public Role(Integer iDRole) {
        this.iDRole = iDRole;
    }

    public Integer getIDRole() {
        return iDRole;
    }

    public void setIDRole(Integer iDRole) {
        this.iDRole = iDRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRole != null ? iDRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.iDRole == null && other.iDRole != null) || (this.iDRole != null && !this.iDRole.equals(other.iDRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testcreate.Role[ iDRole=" + iDRole + " ]";
    }
    
}
