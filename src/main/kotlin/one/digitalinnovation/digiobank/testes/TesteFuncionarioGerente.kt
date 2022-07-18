package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Gerente

fun main(){

    val maria = Gerente(nome = "Maria do carmo", cpf = "122.122.122.11", salario = 5000.00, senha = "senha13")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}

