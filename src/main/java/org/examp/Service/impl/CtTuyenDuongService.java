package org.examp.Service.impl;

import org.examp.Entitys.CtTuyenduong;
import org.examp.Repository.CtTuyenDuongRepository;
import org.examp.Service.ICtTuyenDuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CtTuyenDuongService implements ICtTuyenDuongService {
    @Autowired
    CtTuyenDuongRepository ctTuyenDuongRepository;
    @Override
    public List<CtTuyenduong> getAll() {
        return ctTuyenDuongRepository.findAll();
    }

    @Override
    public CtTuyenduong getOne(String id) {
        return ctTuyenDuongRepository.findOne(id);
    }
}
