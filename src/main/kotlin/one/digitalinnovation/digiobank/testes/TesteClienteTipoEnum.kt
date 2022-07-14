package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.ClienteTipo


fun main(){
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} -  ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
        println("${it.name} -  ${it.descricao}")
    }

    val pj = ClienteTipo.PJ
    println(">>>${pj.name} - ${pj.descricao}")
    val pf = ClienteTipo.PF
    println(">>>${pf.name} - ${pf.descricao}")
}