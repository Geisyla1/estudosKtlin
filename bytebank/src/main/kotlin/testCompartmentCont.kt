fun testCompartmentCont() {
    val contaGeisyla = Conta("Geisyla", 1002)
    val contaRangel = Conta("Rangel", 1001)
    contaGeisyla.titular = "Geisyla"
    contaGeisyla.deposita(100.0)
    println("${contaGeisyla.saldo}")
    println("Titular da conta é ${contaGeisyla.titular}")
}