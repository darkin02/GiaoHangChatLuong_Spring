package org.examp.Repository;

import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonRepository extends JpaRepository<Hoadonvanchuyen, String> {}

