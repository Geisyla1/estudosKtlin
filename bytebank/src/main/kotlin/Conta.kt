class Conta(var titular: String, val numeroConta:Int){
    var saldo = 0.0
        private set
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
        fun transfere(valor: Double, destino: Conta): Boolean {
            if (saldo >= valor) {
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
    }
}