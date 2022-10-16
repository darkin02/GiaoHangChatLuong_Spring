package org.examp.Service;

import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IHoaDonService {
    List<Hoadonvanchuyen> getAll();
    Hoadonvanchuyen getOne(String id);
    void Add (Hoadonvanchuyen hoadonvanchuyen);
}
