package org.examp.Repository;

import org.examp.Entitys.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<Khachhang, String> {
    Khachhang findFirstBySdt(String sdt);
}

