package arraysstrings

// 1.3
// Заманить все пробелы на %20
class Urlify(private val str: String, private val realLength: Int) {

    fun go(): String {

        var numberOfSpaces = 0
        val space = " "[0]

        for (i in 0 until realLength) {
            if (str[i] == space) {
                numberOfSpaces++
            }
        }

        val charArray = CharArray(realLength + numberOfSpaces * UNICODE_SPACE.length - numberOfSpaces)

        var i = 0
        var j = 0

        while (i < charArray.size && j < realLength) {
            if (str[j] == space) {

                for (k in 0 until UNICODE_SPACE.length) {
                    charArray[i] = UNICODE_SPACE[k]
                    i++
                }

                j++

            } else {
                charArray[i] = str[j]
                ++i
                ++j
            }
        }

        return String(charArray)

    }

    companion object {
        private const val UNICODE_SPACE = "%20"
    }
}