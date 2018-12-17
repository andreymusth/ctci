package arraysstrings

class StringCompression(private val str: String) {

    fun go(): String {

        var res = ""

        var currentSymbol = str[0]
        var currentCount = 0

        for (i in 0 until str.length) {

            val symbol = str[i]

            if (symbol == currentSymbol) {
                currentCount++
            } else {
                res += currentSymbol
                res += currentCount

                currentSymbol = symbol
                currentCount = 1
            }
        }

        res += currentSymbol
        res += currentCount

        return if (res.length >= str.length) {
            str
        } else {
            res
        }
    }

    fun go1(): String {

        val res = StringBuilder()

        var currentSymbolCount = 0

        for (i in 0 until str.length) {

            currentSymbolCount++

            if (i + 1 >= str.length || str[i] != str[i + 1]) {
                res.append(str[i]).append(currentSymbolCount)
                currentSymbolCount = 0
            }

        }

        return if (res.length >= str.length) {
            str
        } else {
            res.toString()
        }
    }

    fun go2(): String {

        val finalLength = countCompression()
        if (finalLength >= str.length) {
            return str
        }

        val res = StringBuilder()
        var currentSymbolCount = 0

        for (i in 0 until str.length) {

            currentSymbolCount++

            if (i + 1 >= str.length || str[i] != str[i + 1]) {
                res.append(str[i]).append(currentSymbolCount)
                currentSymbolCount = 0
            }

        }

        return str

    }

    private fun countCompression(): Int {

        var compressionLength = 0
        var currentSymbolCount = 0

        for (i in 0 until str.length) {

            currentSymbolCount++

            if (i + 1 >= str.length || str[i] != str[i + 1]) {
                compressionLength += compressionLength + currentSymbolCount
                currentSymbolCount = 0
            }

        }

        return compressionLength

    }
}