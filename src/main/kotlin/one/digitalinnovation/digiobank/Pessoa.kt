package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-11"
    private set
    constructor()
    fun pessoaInfo() = "$nome + $cpf"
}



fun main(){
    val jether = Pessoa()
    println(jether)
    println(jether.pessoaInfo())

}