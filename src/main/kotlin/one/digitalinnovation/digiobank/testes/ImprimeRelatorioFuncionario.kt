package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) = (
                println(
                    funcionario.toString()
                )
                )
    }
}