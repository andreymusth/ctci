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

        val charArray = CharArray(realLength + numberOfSpaces * UNICODE_SPACE.length)

        var i = 0
        while (i < charArray.size) {
            
        }

    }

    companion object {
        private const val UNICODE_SPACE = "%20"
    }
}