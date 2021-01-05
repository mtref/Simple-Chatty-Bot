import java.util.Scanner

//fun isVowel(ch: Char): Boolean {
//    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

//    val letter = scanner.next()[0]
//
//    println(isVowel(letter.toLowerCase()))

    var num = scanner.nextInt()

    while (num > 1) {
        print("$num ")
        if (num % 2 == 0) {
            num /= 2
        } else {
            num = num * 3 + 1
        }
    }
    println(num)
}