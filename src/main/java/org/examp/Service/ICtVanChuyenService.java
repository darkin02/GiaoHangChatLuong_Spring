package org.examp.Service;

import org.examp.Entitys.Ctvanchuyen;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICtVanChuyenService {
    List<Ctvanchuyen> getAll();
    Ctvanchuyen getOne(String id);
    List<Ctvanchuyen> getAllBySoHD(String SoHD);
    void Add (Ctvanchuyen hoadonvanchuyen);
}
