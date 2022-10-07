package org.examp.Service.impl;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Repository.HoaDonRepository;
import org.examp.Service.IHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoaDonService implements IHoaDonService {
    @Autowired
    private HoaDonRepository hoadonRepository;
    @Override
    public List<Hoadonvanchuyen> getAll(){
        return hoadonRepository.findAll();
    }

    @Override
    public Hoadonvanchuyen getOne(String id) {
        return hoadonRepository.findOne(id);
    }
}
