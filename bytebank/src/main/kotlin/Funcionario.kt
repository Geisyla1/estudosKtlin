open class Funcionario(
    val nome: String,
    val salario: Double,
    val cpf: String,
)
{
    open fun bonificacao():Double{
        return salario*0.10
    }
}