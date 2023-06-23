fun main(args: Array<String>) {
    val sumCommission = calcCommission("Visa", 75000, 75000.0)
    if (sumCommission == -1.0) {
    println("Лимит превышен")
    } else {
        println("Коммиссия за перевод составит $sumCommission руб.")
    }

}

fun calcCommission(systemPay: String = "VK Pay", previousAmount: Int = 0, transferAmount: Double): Double {
    var commission = 0.0
    when (systemPay) {
        "Mastercard", "Maestro", "Visa", "Мир" -> if (previousAmount <= 600_000 && transferAmount <= 150_000) {
            when (systemPay) {
                "Mastercard", "Maestro" -> commission =
                    if (previousAmount < 75_000) 0.0 else (transferAmount * 0.006) + 20.0

                "Visa", "Мир" -> commission = if (transferAmount * 0.0075 < 35.0) 35.0 else 0.0075 * transferAmount
            }
        } else commission = -1.0
            "VK Pay" -> if (previousAmount <= 40_000 && transferAmount <= 15_000) 0.0 else commission = -1.0
    }
    return commission
}
