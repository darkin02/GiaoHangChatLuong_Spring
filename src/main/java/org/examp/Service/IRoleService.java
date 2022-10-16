package org.examp.Service;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IRoleService{
    List<Role> getAll();
    Role getOne(Integer id);
    void Add (Role role);
}
