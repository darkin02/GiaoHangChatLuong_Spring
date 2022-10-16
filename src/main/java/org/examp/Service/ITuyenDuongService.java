package org.examp.Service;

import org.examp.Entitys.Taikhoan;
import org.examp.Entitys.Tuyenduong;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ITuyenDuongService {
    List<Tuyenduong> getAll();
    Tuyenduong getOne(String id);
}
