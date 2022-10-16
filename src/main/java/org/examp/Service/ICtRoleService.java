package org.examp.Service;

import org.examp.Entitys.CtRole;
import org.examp.Entitys.CtTuyenduong;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICtRoleService {
    List<CtRole> getAll();
    CtRole getOne(String id);
    void Add(CtRole ctRole);
    List<CtRole> getAllByTenTK(String tentk);
}
