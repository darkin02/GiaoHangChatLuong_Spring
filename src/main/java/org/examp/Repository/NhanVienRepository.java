package org.examp.Repository;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<Nhanvien, String> {
    Nhanvien findFirstBySdt(String sdt);

}
