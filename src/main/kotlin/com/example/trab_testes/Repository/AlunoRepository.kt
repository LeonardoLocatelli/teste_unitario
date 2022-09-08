package com.example.trab_testes.Repository

import com.example.trab_testes.Entity.Aluno
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AlunoRepository: MongoRepository<Aluno, Long>, AlunoQueries{


}