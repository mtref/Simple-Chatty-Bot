import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val isLessThen10 = input < 10
    println(isLessThen10)
}
