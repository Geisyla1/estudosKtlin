class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    var senha: Int,
):Funcionario(nome = nome,salario = salario, cpf = cpf) {
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
    override fun bonificacao(): Double {
        return salario * 0.40
    }
}