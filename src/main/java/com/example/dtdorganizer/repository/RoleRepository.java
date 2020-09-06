package com.example.dtdorganizer.repository;


import com.example.dtdorganizer.model.ERole;
import com.example.dtdorganizer.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
