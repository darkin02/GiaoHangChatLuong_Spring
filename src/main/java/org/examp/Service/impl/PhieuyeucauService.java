package org.examp.Service.impl;

import org.examp.Entitys.Phieuyeucau;
import org.examp.Repository.PhieuYeuCauRepository;
import org.examp.Service.IPhieuyeucauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhieuyeucauService implements IPhieuyeucauService {
    @Autowired
    PhieuYeuCauRepository phieuYeuCauRepository;
    @Override
    public List<Phieuyeucau> getAll() {
        return phieuYeuCauRepository.findAll();
    }

    @Override
    public Phieuyeucau getOne(String id) {
        return phieuYeuCauRepository.findOne(id);
    }

    @Override
    public void Add(Phieuyeucau phieuyeucau) {
        phieuYeuCauRepository.save(phieuyeucau);
    }
}
