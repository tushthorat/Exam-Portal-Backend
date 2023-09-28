package com.exam.repo;

import com.exam.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
//import org.springframework.boot:spring-boot-starter-data-jpa;

public interface RoleRepository extends JpaRepository<Role,Long> {
    //void save(Role role);
}
