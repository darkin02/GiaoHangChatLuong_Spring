package org.examp.Repository;

import org.examp.Entitys.Khachhang;
import org.examp.Entitys.Tuyenduong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TuyenDuongRepository extends JpaRepository<Tuyenduong, String> {
}
