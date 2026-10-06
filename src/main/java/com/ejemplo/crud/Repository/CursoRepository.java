package com.ejemplo.crud.Repository;

import com.ejemplo.crud.Entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
    List<CursoEntity> findByEstado(String estado);
    List<CursoEntity> findByNombre(String nombre);
    List<CursoEntity> findByDescripcion(String descripcion);
    Optional<CursoEntity> findByCodigo(String codigo);

}
