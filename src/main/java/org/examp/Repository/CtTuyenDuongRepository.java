package org.examp.Repository;

import org.examp.Entitys.CtTuyenduong;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtTuyenDuongRepository extends JpaRepository<CtTuyenduong, String> {}
