package com.example.trab_testes.Entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Field

class Aluno(

        @Id
        @Field
        val id: Int,

        @Field("nome")
        val nome: String,

        @Field("turma")
        val turma: Int?,
)
