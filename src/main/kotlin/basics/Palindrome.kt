package basics

fun palindrome(s: String): Boolean = s.lowercase() == s.lowercase().reversed()
