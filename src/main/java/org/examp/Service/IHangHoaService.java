package org.examp.Service;

import org.examp.Entitys.Hanghoa;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHangHoaService {
    List<Hanghoa> getAll();
    Hanghoa getOne(String id);
    Hanghoa getName(String name);
    void Add(Hanghoa hanghoa);
}
