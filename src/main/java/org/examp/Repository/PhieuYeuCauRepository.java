package org.examp.Repository;

import org.examp.Entitys.Khachnhan;
import org.examp.Entitys.Phieuyeucau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuYeuCauRepository  extends JpaRepository<Phieuyeucau, String> {

}
