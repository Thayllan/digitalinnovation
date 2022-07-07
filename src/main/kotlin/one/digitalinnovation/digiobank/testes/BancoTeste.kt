package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Banco

fun main(){
    val digioOneBank = Banco(nome = "DigioOne", numero = 12)
    println(digioOneBank.nome)
    println(digioOneBank.numero)

    val banco2 = digioOneBank.copy(nome = "Thayllan")
    println(banco2.info())
}