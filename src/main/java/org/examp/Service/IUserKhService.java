package org.examp.Service;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Userkh;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserKhService {
    List<Userkh> getAll();
    Userkh getOne(String id);
    Userkh getOneBySdt(String sdt);
}
