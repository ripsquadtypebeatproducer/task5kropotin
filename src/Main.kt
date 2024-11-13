fun main() {
    println("Введите целое число:")
    val nInput = readlnOrNull() ?: return
    println("Введите степень:")
    val xInput = readlnOrNull() ?: return

    try {
        val n = nInput.toInt()
        val x = xInput.toInt()

        var y = 0
        var power = 1

        while (power < n) {
            power *= x
            y++
        }

        if (power == n) {
            println("Показатель степени = $y")
        } else {
            println("Ошибка.")
        }
    } catch (e: NumberFormatException) {
        println("Ошибка")
    }
}