package org.examp.Service;

import org.examp.Entitys.Nhanvien;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface INhanVienService {

    List<Nhanvien> getAll();
    Nhanvien getOne(String id);
    Nhanvien getOneBySdt(String sdt);
}
