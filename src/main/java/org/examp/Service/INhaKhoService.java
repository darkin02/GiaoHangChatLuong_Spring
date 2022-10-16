package org.examp.Service;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Nhakho;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface INhaKhoService {
    List<Nhakho> getAll();
    Nhakho getOne(String id);
}
