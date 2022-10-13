package org.examp.Service;

import org.examp.Entitys.Nhanvien;
import org.examp.Entitys.Phieuyeucau;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IPhieuyeucauService {
    List<Phieuyeucau> getAll();
    Phieuyeucau getOne(String id);
    void Add(Phieuyeucau phieuyeucau);
}
