package basics
fun strToMap(s: String): HashMap<Char, Int> {
    val map = HashMap<Char, Int>()

    for (char in s.lowercase().toCharArray()) {
        val count = map[char]
        map[char] = count?.plus(1) ?: 1
    }

    return map
}

fun isAnagram(s: String, s2: String): Boolean {
    if (s.length != s2.length)
        return false

    return strToMap(s) == strToMap(s2)
}