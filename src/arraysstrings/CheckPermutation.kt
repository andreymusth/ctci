package arraysstrings

import java.util.*


// 1.2
// Проверяем что одна строка это перестановка другой

class CheckPermutation(private val str1: String, private val str2: String) {


    fun go2(): Boolean {
        return sort(str1) == sort(str2)
    }

    private fun sort(str: String): String {
        val array = str.toCharArray()
        Arrays.sort(array)
        return String(array)
    }


    fun go1(): Boolean {
        if (str1.length != str2.length) {
            return false
        }

        val count1 = countSymbols(str1)
        val count2 = countSymbols(str2)

        for (pair in count1) {

            if (count2[pair.key] == null || pair.value != count2[pair.key]) {
                return false
            }

        }

        return true
    }

    private fun countSymbols(str: String): HashMap<Char, Int> {
        val res = HashMap<Char, Int>()

        for (char in str) {
            if (res[char] != null) {
                res[char] = res[char]!! + 1
            } else {
                res[char] = 1
            }
        }

        return res
    }
}