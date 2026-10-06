package com.ejemplo.crud.Service.Impl;

import com.ejemplo.crud.Entity.CursoEntity;
import com.ejemplo.crud.Repository.CursoRepository;
import com.ejemplo.crud.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<CursoEntity> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public CursoEntity save(CursoEntity cursoEntity) {
        return cursoRepository.save(cursoEntity);
    }

    @Override
    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Optional<CursoEntity> findById(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public CursoEntity update(CursoEntity cursoEntity, Long id) {
        cursoEntity.setId(id);
        return cursoRepository.save(cursoEntity);
    }

    @Override
    public List<CursoEntity> findByEstado(String estado) {
        return cursoRepository.findByEstado(estado);
    }

    @Override
    public List<CursoEntity> findByNombre(String nombre) {
        return cursoRepository.findByNombre(nombre);
    }

    @Override
    public List<CursoEntity> findByDescripcion(String descripcion) {
        return cursoRepository.findByDescripcion(descripcion);
    }

    @Override
    public Optional<CursoEntity> findByCodigo(String codigo) {
        return cursoRepository.findByCodigo(codigo);
    }
}
