package arraysstrings

import kotlin.random.Random

class RotateMatrix(private val n: Int) {

    private val a = Array(n) { Array(n) { 0 } }

    init {
        for (i in 0 until n) {
            for (j in 0 until n) {
                a[i][j] = Random.nextInt(0, 10)
            }
        }
    }


    fun rotate() {
        for (layer in 0 until n / 2) {

            val first = layer
            val last = n - 1 - layer

            for (i in first until last) {

                val offset = i - layer
                val top = a[layer][i]

                a[first][i] = a[last - offset][first]
                a[last - offset][first] = a[last][last - offset]
                a[last][last - offset] = a[i][last]
                a[i][last] = top


            }
        }
    }


    fun display() {
        for (i in 0 until n) {
            for (j in 0 until n) {
                print("${a[i][j]} ")
            }

            println()
        }
    }

}