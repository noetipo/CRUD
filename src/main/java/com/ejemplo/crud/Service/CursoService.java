package com.ejemplo.crud.Service;

import com.ejemplo.crud.Entity.CursoEntity;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<CursoEntity> findAll();
    CursoEntity save(CursoEntity cursoEntity);
    void delete(Long id);
    Optional<CursoEntity> findById(Long id);
    CursoEntity update(CursoEntity cursoEntity, Long id);
    List<CursoEntity> findByEstado(String estado);
    List<CursoEntity> findByNombre(String nombre);
    List<CursoEntity> findByDescripcion(String descripcion);
    Optional<CursoEntity> findByCodigo(String codigo);
}
