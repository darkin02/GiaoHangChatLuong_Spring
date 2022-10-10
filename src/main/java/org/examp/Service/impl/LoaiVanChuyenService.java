package org.examp.Service.impl;

import org.examp.Entitys.Loaivanchuyen;
import org.examp.Repository.LoaiVanChuyenRepository;
import org.examp.Service.ILoaiVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiVanChuyenService implements ILoaiVanChuyenService {
    @Autowired
    private LoaiVanChuyenRepository loaiVanChuyenRepository;
    @Override
    public List<Loaivanchuyen> getAll() {
        return loaiVanChuyenRepository.findAll();
    }

    @Override
    public Loaivanchuyen getOne(String id) {
        return loaiVanChuyenRepository.findOne(id);
    }
}
