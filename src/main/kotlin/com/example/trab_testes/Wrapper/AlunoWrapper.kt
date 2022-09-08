package com.example.trab_testes.Wrapper

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Field


data class AlunoWrapper (

    @Id
    @Field("id")
    val id: Int,

    @Field("nome")
    val nome: String,

    @Field("turma")
    val turma: Int?,
)