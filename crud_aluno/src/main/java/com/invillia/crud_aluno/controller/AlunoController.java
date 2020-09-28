package com.invillia.crud_aluno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invillia.crud_aluno.model.Aluno;
import com.invillia.crud_aluno.service.AlunoService;

@RestController
@RequestMapping(value="/aluno")
public class AlunoController {

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> findAll(){
        return alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Aluno findOne(@PathVariable("id") Long id){
        return alunoService.findOne(id);
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
        return alunoService.insert(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable("id") Long id){
        alunoService.delete(id);
    }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        return alunoService.update(aluno);
    }

}
