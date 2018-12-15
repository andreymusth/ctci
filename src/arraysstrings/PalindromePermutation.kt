package arraysstrings

class PalindromePermutation(input: String) {

    private val str = input.toLowerCase()
    private val charsCount = IntArray(128)

    fun go(): Boolean {

        val space = ' '

        for (char in str) {
            if (char != space) {
                charsCount[char.toInt()]++
            }
        }


        var countOfNotEvenNumbers = 0

        for (i in 0 until charsCount.size) {

            val count = charsCount[i]

            if (count != 0 && count % 2 == 1) {
                countOfNotEvenNumbers++
                if (countOfNotEvenNumbers > 1) {
                    return false
                }
            }
        }

        return true
    }

}