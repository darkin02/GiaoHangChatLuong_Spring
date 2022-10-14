package org.examp.Repository;

import org.examp.Entitys.Khachhang;
import org.examp.Entitys.Khachnhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface KhachNhanRepository extends JpaRepository<Khachnhan, String> {
    Khachnhan findFirstBySdt(String sdt);
}
