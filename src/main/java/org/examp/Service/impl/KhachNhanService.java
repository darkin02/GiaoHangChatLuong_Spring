package org.examp.Service.impl;

import org.examp.Entitys.Khachnhan;
import org.examp.Repository.KhachNhanRepository;
import org.examp.Service.IKhachNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachNhanService implements IKhachNhanService {
    @Autowired
    KhachNhanRepository khachNhanRepository;

    @Override
    public List<Khachnhan> getAll() {
        return khachNhanRepository.findAll();
    }

    @Override
    public Khachnhan getOne(String id) {
        return khachNhanRepository.findOne(id);
    }

    @Override
    public Khachnhan getOneBySdt(String sdt) {
        return khachNhanRepository.findFirstBySdt(sdt);
    }

    @Override
    public void Add(Khachnhan khachnhan) {
       khachNhanRepository.save(khachnhan);
    }
}
