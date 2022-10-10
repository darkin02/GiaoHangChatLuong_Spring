package org.examp.Service;

import org.examp.Entitys.Loaivanchuyen;
import org.examp.Entitys.Taikhoan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITaiKhoanService {
    List<Taikhoan> getAll();
    Taikhoan getOne(String id);
    void Add(Taikhoan tk);
    Taikhoan getOneByEmail(String email);
}
