package org.examp.Repository;

import org.examp.Entitys.CtRole;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtRoleRepository extends JpaRepository<CtRole, String> {
    List<CtRole> findAllByTenTK(String tentk);
}
