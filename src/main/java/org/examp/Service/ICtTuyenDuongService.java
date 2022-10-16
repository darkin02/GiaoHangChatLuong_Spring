package org.examp.Service;

import org.examp.Entitys.CtTuyenduong;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICtTuyenDuongService {
    List<CtTuyenduong> getAll();
    CtTuyenduong getOne(String id);
}
