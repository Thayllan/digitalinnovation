package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Analista


fun main(){

    val joao = Analista(nome = "João Pedro", cpf = "122.122.122.11", salario = 2000.01)
    ImprimeRelatorioFuncionario.imprime(joao)


}

