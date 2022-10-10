package org.examp.Service.impl;

import org.examp.Entitys.Hanghoa;
import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Repository.HangHoaRepository;
import org.examp.Repository.HoaDonRepository;
import org.examp.Service.IHangHoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangHoaService implements IHangHoaService {
    @Autowired
    private HangHoaRepository hangHoaRepository;
    @Override
    public List<Hanghoa> getAll(){
        return hangHoaRepository.findAll();
    }

    @Override
    public Hanghoa getOne(String id) {
        return hangHoaRepository.findOne(id);
    }

    @Override
    public Hanghoa getName(String name) {
        return hangHoaRepository.findFirstByTenHH(name);
    }

    @Override
    public void Add(Hanghoa hanghoa) {
        hangHoaRepository.save(hanghoa);
    }
}
