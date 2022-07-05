package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-11"
    private set

}



fun main(){
    val jether = Pessoa()
    println(jether)
    println(jether.nome)
    println(jether.cpf)



}