package org.examp.Service.impl;

import org.examp.Entitys.Tuyenduong;
import org.examp.Repository.TuyenDuongRepository;
import org.examp.Service.ITuyenDuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuyenDuongService implements ITuyenDuongService {
    @Autowired
    TuyenDuongRepository tuyenDuongRepository;
    @Override
    public List<Tuyenduong> getAll() {
        return tuyenDuongRepository.findAll();
    }

    @Override
    public Tuyenduong getOne(String id) {
        return tuyenDuongRepository.findOne(id);
    }
}
