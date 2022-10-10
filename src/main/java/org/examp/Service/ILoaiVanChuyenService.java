package org.examp.Service;

import org.examp.Entitys.Khachhang;
import org.examp.Entitys.Loaivanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ILoaiVanChuyenService {

    List<Loaivanchuyen> getAll();
    Loaivanchuyen getOne(String id);
}
