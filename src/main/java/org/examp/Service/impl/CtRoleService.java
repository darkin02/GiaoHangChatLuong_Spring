package org.examp.Service.impl;

import org.examp.Entitys.CtRole;
import org.examp.Repository.CtRoleRepository;
import org.examp.Service.ICtRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CtRoleService implements ICtRoleService {
    @Autowired
    CtRoleRepository ctRoleRepository;
    @Override
    public List<CtRole> getAll() {
        return ctRoleRepository.findAll();
    }

    @Override
    public CtRole getOne(String id) {
        return ctRoleRepository.findOne(id);
    }

    @Override
    public void Add(CtRole ctRole) {
        ctRoleRepository.save(ctRole);
    }

    @Override
    public List<CtRole> getAllByTenTK(String tentk) {
        return ctRoleRepository.findAllByTenTK(tentk);
    }
}
