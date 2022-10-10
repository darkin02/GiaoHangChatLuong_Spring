package org.examp.Repository;

import org.examp.Entitys.Userkh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserKHRepository extends JpaRepository<Userkh, String> {
    Userkh findFirstBySdt(String sdt);
}
