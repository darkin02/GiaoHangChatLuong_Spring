package org.examp.Repository;

import org.examp.Entitys.Ctvanchuyen;
import org.examp.Entitys.Nhakho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NhaKhoRepository extends JpaRepository<Nhakho, String> {
}
