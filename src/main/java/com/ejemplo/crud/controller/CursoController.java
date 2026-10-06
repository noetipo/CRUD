package com.ejemplo.crud.controller;

import com.ejemplo.crud.Entity.CursoEntity;
import com.ejemplo.crud.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @GetMapping("/prueba")
    public List<CursoEntity> findAll(){
        CursoEntity cursoEntity = new CursoEntity();
        cursoEntity.setCodigo("123456");
        cursoEntity.setNombre("Java");
        cursoEntity.setDescripcion("Curso de Java");
        cursoEntity.setEstado("Activo");
        cursoService.save(cursoEntity);
        return cursoService.findAll();
    }


}
