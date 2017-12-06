package cz.vendasky

fun sumOfDigits(input: String): Int {
    val numbers = input.toList().map { it -> Integer.parseInt(it.toString()) }
    return numbers.foldIndexed(0, { index, acc, i ->
        val nextIndex = if (index + 1 == numbers.size) {
            0
        } else {
            index + 1
        }
        acc + if (i == numbers[nextIndex]) {
            i
        } else {
            0
        }
    })
}