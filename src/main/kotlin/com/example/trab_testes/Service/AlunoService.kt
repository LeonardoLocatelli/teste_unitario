package com.example.trab_testes.Service

import com.example.trab_testes.Entity.Aluno
import com.example.trab_testes.Repository.AlunoRepository

import com.example.trab_testes.Wrapper.AlunoWrapperRequest
import com.example.trab_testes.ApiResponse
import org.mortbay.jetty.HttpStatus
import org.springframework.stereotype.Service
import java.util.*


@Service
class AlunoService(
    private val alunoRepository: AlunoRepository) {

    fun Adicionar(alunoWrapperRequest: AlunoWrapperRequest): ApiResponse<Aluno> {
        val aluno = Aluno(
            id = alunoWrapperRequest.id,
            nome = alunoWrapperRequest.nome,
            turma = alunoWrapperRequest.turma
        )
        alunoRepository.save(aluno)

        return ApiResponse(
            data = aluno
//            status = HttpStatus.OK,
//            messsage = "Pessoa inserida!"
        )

//        fun buscarporid(id: Int): ApiResponse<Optional<Aluno>> {
//            val retorno = AlunoRepository.buscarporid(id)
//            return ApiResponse(HttpStatus.OK, retorno)
//        }

    }
}