package org.examp.Repository;

import org.examp.Entitys.Hanghoa;
import org.examp.Entitys.Hoadonvanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HangHoaRepository extends JpaRepository<Hanghoa, String> {
    Long countByTenHH(String name);
    Hanghoa findFirstByTenHH(String name);

}
