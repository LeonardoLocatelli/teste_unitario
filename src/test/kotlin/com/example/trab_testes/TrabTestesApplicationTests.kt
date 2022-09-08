package com.example.trab_testes

import com.example.trab_testes.Controller.AlunoController
import com.example.trab_testes.Wrapper.AlunoWrapperRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TrabTestesApplicationTests {


    @Autowired
    lateinit var alunoController: AlunoController
    lateinit var alunoWrapperRequest: AlunoWrapperRequest

    @Test
    fun adcionaAluno() {
        val response = ApiResponse(alunoController.adicionar((alunoWrapperRequest)))
        print("\n\n" + response.message + "\n" + response.statusCode + ";\n\n")
        Assertions.assertEquals( 200, response.statusCode)


    }

}
