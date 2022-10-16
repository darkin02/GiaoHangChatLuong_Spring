package org.examp.Service.impl;

import org.examp.Entitys.Role;
import org.examp.Repository.RoleRepository;
import org.examp.Service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IRoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role getOne(Integer id) {
        return roleRepository.findOne(id);
    }

    @Override
    public void Add(Role role) {
      roleRepository.save(role);
    }
}
