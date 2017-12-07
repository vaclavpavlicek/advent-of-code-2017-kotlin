package cz.vendasky

fun parseInputToList(input: String): List<List<Int>> {
    return input.split("\n").map { it.split("\t").map { it.toInt() } }
}

fun findChecksum(input: String): Int {
    return parseInputToList(input).fold(0, {acc, it ->
        acc + it.max()!! - it.min()!!
    })
}