import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FechaTest {

    @Test
    fun valida() {

        @Test
        fun valida() {
            val fch = Fecha(15, 12, 2023)
            assertTrue (fch.valida())
        }


        @Test
        fun fechaInvalidaDia() {
            val fch = Fecha(32, 5, 2022)
            assertFalse (fch.valida())
        }

        @Test
        fun fechaInvalidaMes() {
            val fch = Fecha(12, 13, 2021)
            // Assert.assertFalse(fecha.valida())
            assertFalse (fch.valida())
        }

        @Test
        fun fechaInvalidaFebreroBisiesto() {
            val fch = Fecha(29, 2, 2021)
            assertFalse (fch.valida())
            println("Fecha invalida")
            println(fch.valida())
        }

        @Test
        fun fechaValidaFebreroBisiesto() {
            val fecha = Fecha(29, 2, 2024)
            assertTrue (fecha.valida())
            println("Fecha valida Bisiesto")
            println(fecha.valida())
        }
    }
}