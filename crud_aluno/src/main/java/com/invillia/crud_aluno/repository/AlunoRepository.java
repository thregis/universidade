package com.invillia.crud_aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invillia.crud_aluno.model.Aluno;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
