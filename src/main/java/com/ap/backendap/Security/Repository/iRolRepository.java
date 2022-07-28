package com.ap.backendap.Security.Repository;

import com.ap.backendap.Security.Entity.Rol;
import com.ap.backendap.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
