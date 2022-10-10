package org.examp.Service.impl;

import org.examp.Entitys.Loaihh;
import org.examp.Entitys.Loaivanchuyen;
import org.examp.Repository.LoaiHHRepository;
import org.examp.Repository.LoaiVanChuyenRepository;
import org.examp.Service.ILoaiHHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiHHService implements ILoaiHHService {
    @Autowired
    private LoaiHHRepository loaiHHRepository;
    @Override
    public List<Loaihh> getAll() {
        return loaiHHRepository.findAll();
    }

    @Override
    public Loaihh getOne(String id) {
        return loaiHHRepository.findOne(id);
    }
}
