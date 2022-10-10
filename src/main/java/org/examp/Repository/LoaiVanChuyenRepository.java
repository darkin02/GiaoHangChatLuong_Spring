package org.examp.Repository;

import org.examp.Entitys.Loaivanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiVanChuyenRepository extends JpaRepository<Loaivanchuyen, String> {}

