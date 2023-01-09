package com.kdb.enrichment.controller;

import com.kdb.enrichment.model.DataBaseDTO;
import com.kdb.enrichment.service.DataBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/database")
public class DataBaseController {

    private final DataBaseServiceImpl service;

    @GetMapping
    public ResponseEntity<List<DataBaseDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataBaseDTO> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DataBaseDTO> deleteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.deleteById(id));
    }

    @PostMapping
    public ResponseEntity<DataBaseDTO> adicionar(@RequestBody DataBaseDTO dataBaseDTO){
        return ResponseEntity.ok(service.adicionar(dataBaseDTO));
    }
}
