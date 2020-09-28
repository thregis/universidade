package com.invillia.crud_aluno.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invillia.crud_aluno.model.Aluno;
import com.invillia.crud_aluno.repository.AlunoRepository;

@Service
public class AlunoService {

	 private AlunoRepository alunoRepository;

	    public AlunoService(AlunoRepository contactRepository) {
	        this.alunoRepository = contactRepository;
	    }

	    public List<Aluno> findAll() {
	        return this.alunoRepository.findAll();
	    }

	    public Aluno findOne(Long id) {
	        return this.alunoRepository.findById(id).get();
	    }

	    public Aluno insert(Aluno aluno) {
	        return this.alunoRepository.saveAndFlush(aluno);
	    }

	    public void delete(Long id) {
	        this.alunoRepository.deleteById(id);
	    }

	    public Aluno update(Aluno contact) {
	        return this.alunoRepository.saveAndFlush(contact);
	    }

	}
