package org.examp.Service.impl;

import org.examp.Entitys.Ctvanchuyen;
import org.examp.Repository.CtVanChuyenRepository;
import org.examp.Service.ICtVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CtVanChuyenService implements ICtVanChuyenService {
    @Autowired
    CtVanChuyenRepository ctVanChuyenRepository;
    @Override
    public List<Ctvanchuyen> getAll() {
        return ctVanChuyenRepository.findAll();
    }

    @Override
    public Ctvanchuyen getOne(String id) {
        return ctVanChuyenRepository.findOne(id);
    }

    @Override
    public List<Ctvanchuyen> getAllBySoHD(String SoHD) {
        return ctVanChuyenRepository.findAllBySoHD(SoHD);
    }
    @Override
    public void Add(Ctvanchuyen hoadonvanchuyen) {

    }
}
