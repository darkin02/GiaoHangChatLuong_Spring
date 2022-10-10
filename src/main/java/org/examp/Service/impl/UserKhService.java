package org.examp.Service.impl;

import org.examp.Entitys.Userkh;
import org.examp.Repository.UserKHRepository;
import org.examp.Service.IUserKhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserKhService implements IUserKhService {
    @Autowired
    private UserKHRepository userKHRepository;
    @Override
    public List<Userkh> getAll() {
        return userKHRepository.findAll();
    }

    @Override
    public Userkh getOne(String id) {
        return userKHRepository.findOne(id);
    }

    @Override
    public Userkh getOneBySdt(String sdt) {
        return userKHRepository.findFirstBySdt(sdt);
    }

    @Override
    public void Add(Userkh userkh) {
        userKHRepository.save(userkh);
    }
}
