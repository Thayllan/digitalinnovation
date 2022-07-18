package one.digitalinnovation.digiobank

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        salario: $salario
        auxilio: ${calculoAuxilio()}
    """.trimIndent()
}