package com.example.trab_testes.Repository

import com.example.trab_testes.Wrapper.AlunoWrapper

interface AlunoQueries {
    fun update(id: Long, c: AlunoWrapper): Long
}