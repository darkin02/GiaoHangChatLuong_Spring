package org.examp.Service;

import org.examp.Entitys.Khachhang;
import org.examp.Entitys.Khachnhan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IKhachNhanService {
    List<Khachnhan> getAll();
    Khachnhan getOne(String id);
    Khachnhan getOneBySdt(String sdt);
    void Add(Khachnhan khachnhan);
}
