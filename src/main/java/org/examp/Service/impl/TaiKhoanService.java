package org.examp.Service.impl;

import org.examp.Entitys.Taikhoan;
import org.examp.Repository.TaiKhoanRepository;
import org.examp.Service.ITaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaiKhoanService implements ITaiKhoanService {
    @Autowired
    TaiKhoanRepository taiKhoanRepository;
    @Override
    public List<Taikhoan> getAll() {
        return taiKhoanRepository.findAll();
    }

    @Override
    public Taikhoan getOne(String id) {
        return taiKhoanRepository.findOne(id);
    }

    @Override
    public void Add(Taikhoan tk) {
        taiKhoanRepository.save(tk);
    }

    @Override
    public Taikhoan getOneByEmail(String email) {
        return taiKhoanRepository.findFirstByEmail(email);
    }
}
