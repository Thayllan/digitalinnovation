package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Cliente
import one.digitalinnovation.digiobank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123.11",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}
