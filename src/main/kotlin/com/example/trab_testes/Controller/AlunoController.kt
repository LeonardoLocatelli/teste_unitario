package com.example.trab_testes.Controller

import com.example.trab_testes.ApiResponse
import com.example.trab_testes.Entity.Aluno
import com.example.trab_testes.Service.AlunoService
import com.example.trab_testes.Wrapper.AlunoWrapperRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aluno")
class AlunoController(

    private val alunoService: AlunoService
){
    @PostMapping ("insert")
    fun adicionar(@RequestBody alunoWrapperRequest: AlunoWrapperRequest): ApiResponse<Aluno> {
        return alunoService.Adicionar(alunoWrapperRequest)
    }
}