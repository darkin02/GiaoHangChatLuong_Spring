package org.examp.Repository;

import org.examp.Entitys.Hoadonvanchuyen;
import org.examp.Entitys.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {}
