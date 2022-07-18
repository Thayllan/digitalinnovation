package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa

fun main(){
    val jether = Pessoa(nome ="Thayllan", cpf = "123.123.123.11")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario(nome = "Jether", cpf = "122.122.122.11", salario = 2000.01)
    println(joao.salario)
    println(joao.nome)
    println(joao.cpf)
}

