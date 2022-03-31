import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun vk() {
        val prevPayTest = 0
        val payTest = 1000
        val result = vk(
            prevPay = prevPayTest,
            pay = payTest
        )
        assertEquals(1000, result)
    }

    @Test
    fun masterCard() {
        val prevPayTest = 0
        val payTest = 1000
        val result = masterCard(
            prevPay = prevPayTest,
            pay = payTest
        )
        assertEquals(1000, result)
    }

    @Test
    fun mir() {
        val prevPayTest = 0
        val payTest = 1000
        val result = mir(
            prevPay = prevPayTest,
            pay = payTest
        )
        assertEquals(1000, result)
    }
}