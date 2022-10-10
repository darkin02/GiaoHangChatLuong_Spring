package org.examp.Service.impl;

import org.examp.Entitys.Khachhang;
import org.examp.Repository.KhachHangRepository;
import org.examp.Service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangService implements IKhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<Khachhang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public Khachhang getOne(String id) {
        return khachHangRepository.findOne(id);
    }

    @Override
    public Khachhang getOneBySdt(String sdt) {
        return khachHangRepository.findFirstBySdt(sdt);
    }

    @Override
    public void Add(Khachhang khachhang) {
        khachHangRepository.save(khachhang);
    }
}
