package org.examp.Service.impl;

import org.examp.Entitys.Nhanvien;
import org.examp.Repository.NhanVienRepository;
import org.examp.Service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienService implements INhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Override
    public List<Nhanvien> getAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public Nhanvien getOne(String id) {
        return nhanVienRepository.findOne(id);
    }

    @Override
    public Nhanvien getOneBySdt(String sdt) {
        return nhanVienRepository.findFirstBySdt(sdt);
    }
}
