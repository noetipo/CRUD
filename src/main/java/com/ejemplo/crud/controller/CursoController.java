package com.ejemplo.crud.controller;

import com.ejemplo.crud.Entity.CursoEntity;
import com.ejemplo.crud.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @GetMapping()
    public ResponseEntity<List<CursoEntity>> findAll(){

        return new ResponseEntity<>(cursoService.findAll(), org.springframework.http.HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CursoEntity> save(@RequestBody CursoEntity cursoEntity){
        return new ResponseEntity<>(cursoService.save(cursoEntity), org.springframework.http.HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CursoEntity> findById(Long id){
        return new ResponseEntity<>(cursoService.findById(id).get(), org.springframework.http.HttpStatus.OK);
    }
    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<CursoEntity>> findByEstado(String estado){
        return new ResponseEntity<>(cursoService.findByEstado(estado), org.springframework.http.HttpStatus.OK);
    }
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<List<CursoEntity>> findByNombre(String nombre){
        return new ResponseEntity<>(cursoService.findByNombre(nombre), org.springframework.http.HttpStatus.OK);
    }
    @GetMapping("/descripcion/{descripcion}")
    public ResponseEntity<List<CursoEntity>> findByDescripcion(String descripcion){
        return new ResponseEntity<>(cursoService.findByDescripcion(descripcion), org.springframework.http.HttpStatus.OK);
    }
    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<CursoEntity> findByCodigo(String codigo){
        return new ResponseEntity<>(cursoService.findByCodigo(codigo).get(), org.springframework.http.HttpStatus.OK);
    }



}
