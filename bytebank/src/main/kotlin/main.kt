fun main() {
    println("Bem-vindo ao bytebank")
    testCompartmentCont()

    val Funcionario = Funcionario(
        "geisyla",
        1000.00,
        "111.1111.111-11"
    )
    println("${Funcionario.bonificacao()}")
}

