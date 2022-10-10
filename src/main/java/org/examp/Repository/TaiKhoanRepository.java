package org.examp.Repository;


import org.examp.Entitys.Taikhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanRepository extends JpaRepository<Taikhoan, String> {
Taikhoan findFirstByEmail(String email);
}

