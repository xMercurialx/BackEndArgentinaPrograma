package com.ap.backendap.Repository;

import com.ap.backendap.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia,Long> {
}
