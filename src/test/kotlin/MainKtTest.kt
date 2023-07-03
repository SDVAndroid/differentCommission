import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcDailyLimitMir() {
        val systemPay = "Мир"
        val previousAmount = 500_000
        val transferAmount = 150_000.10
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calcTotalLimitMir() {
        val systemPay = "Мир"
        val previousAmount = 600_001
        val transferAmount = 50_000.00
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcDailyLimitMastercard() {
        val systemPay = "Mastercard"
        val previousAmount = 500_000
        val transferAmount = 150_000.10
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcTotalLimitMastercard() {
        val systemPay = "Mastercard"
        val previousAmount = 600_001
        val transferAmount = 50_000.00
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcDailyLimitMaestro() {
        val systemPay = "Maestro"
        val previousAmount = 500_000
        val transferAmount = 150_000.10
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcTotalLimitMaestro() {
        val systemPay = "Maestro"
        val previousAmount = 600_001
        val transferAmount = 50_000.00
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcDailyLimitVisa() {
        val systemPay = "Visa"
        val previousAmount = 500_000
        val transferAmount = 150_000.10
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcTotalLimitVisa() {
        val systemPay = "Visa"
        val previousAmount = 600_001
        val transferAmount = 50_000.00
        val result = calcCommission(systemPay, previousAmount, transferAmount)
        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcMastercardNormal() {
        val systemPay = "MasterCard"
        val previousAmount = 70_000
        val transferAmount = 4999.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calcMastercardLimit() {
        val systemPay = "Mastercard"
        val previousAmount = 76_000
        val transferAmount = 15_500.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(113.0, result, 0.01)
    }

    @Test
    fun calcMaestroNormal() {
        val systemPay = "Maestro"
        val previousAmount = 70_000
        val transferAmount = 4999.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calcMaestroLimit() {
        val systemPay = "Maestro"
        val previousAmount = 76_000
        val transferAmount = 15_500.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(113.0, result, 0.01)
    }

    @Test
    fun calcVisaMin() {
        val systemPay = "Visa"
        val previousAmount = 6_000
        val transferAmount = 500.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(35.0, result, 0.01)
    }

    @Test
    fun calcVisaBig() {
        val systemPay = "Visa"
        val previousAmount = 6_000
        val transferAmount = 50_000.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(375.0, result, 0.01)
    }

    @Test
    fun calcMirMin() {
        val systemPay = "Мир"
        val previousAmount = 6_000
        val transferAmount = 500.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(35.0, result, 0.01)
    }

    @Test
    fun calcMirBig() {
        val systemPay = "Мир"
        val previousAmount = 6_000
        val transferAmount = 50_000.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(375.0, result, 0.01)
    }

    @Test
    fun calcVKPayNormal() {
        val systemPay = "VK Pay"
        val previousAmount = 6_000
        val transferAmount = 500.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calcVKPayOneTimeLimit() {
        val systemPay = "VK Pay"
        val previousAmount = 6_000
        val transferAmount = 16_000.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(-1.0, result, 0.01)
    }

    @Test
    fun calcVKPayLimit() {
        val systemPay = "VK Pay"
        val previousAmount = 41_000
        val transferAmount = 10_000.00

        val result = calcCommission(systemPay, previousAmount, transferAmount)

        assertEquals(-1.0, result, 0.01)
    }
}