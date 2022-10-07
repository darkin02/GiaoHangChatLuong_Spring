package org.examp.Service;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Khachhang;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IKhachHangService {
    List<Khachhang> getAll();
    Khachhang getOne(String id);
}
