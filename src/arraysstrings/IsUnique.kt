package arraysstrings


// 1.1 Is Unique
// проверяет если все символы в строке уникальные
class IsUnique(private val str: String) {

    fun go1(): Boolean {

        if (str.length > 128) {
            return false
        }

        val arr = BooleanArray(128) { false }

        for (char in str) {

            if (arr[char.toInt()]) {
                return false
            }

            arr[char.toInt()] = true

        }

        return true

    }

    fun go2(): Boolean {

        if (str.length > 128) {
            return false
        }

        for (i in 0 until str.length) {
            for (j in i + 1 until str.length) {
                if (str[i] == str[j]) {
                    return false
                }
            }
        }

        return true
    }

}