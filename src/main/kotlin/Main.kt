import basics.isAnagram
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val s1 = scanner.next()
    val s2 = scanner.next()

    println(isAnagram(s1, s2))
}