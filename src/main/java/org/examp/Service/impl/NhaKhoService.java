package org.examp.Service.impl;

import org.examp.Entitys.Nhakho;
import org.examp.Repository.NhaKhoRepository;
import org.examp.Service.INhaKhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaKhoService implements INhaKhoService {
    @Autowired
    NhaKhoRepository nhaKhoRepository;
    @Override
    public List<Nhakho> getAll() {
        return nhaKhoRepository.findAll();
    }

    @Override
    public Nhakho getOne(String id) {
        return nhaKhoRepository.findOne(id);
    }
}
