package org.examp.Repository;

import org.examp.Entitys.CtTuyenduong;
import org.examp.Entitys.Ctvanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtVanChuyenRepository extends JpaRepository<Ctvanchuyen, String> {
    List<Ctvanchuyen> findAllBySoHD(String SoHD);
}
