package org.examp.Service;

import org.examp.Entitys.Loaihh;
import org.examp.Entitys.Loaivanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILoaiHHService {
    List<Loaihh> getAll();
    Loaihh getOne(String id);
}
