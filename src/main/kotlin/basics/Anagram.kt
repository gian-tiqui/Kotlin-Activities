package basics

class Anagram(private var s: String, private var s2: String) {

    private fun strToMap(s: String): HashMap<Char, Int> {
        val map = HashMap<Char, Int>()

        for (char in s.lowercase().toCharArray()) {
            val count = map[char]
            map[char] = count?.plus(1) ?: 1
        }

        return map
    }

    fun isAnagram():Boolean {

        if (s.length != s2.length)
            return false

        return strToMap(s) == strToMap(s2)
    }

}