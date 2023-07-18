package basics

class Palindrome(private var s: String) {

    fun isPalindrome() = s.lowercase() == s.lowercase().reversed()
}