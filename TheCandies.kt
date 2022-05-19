import java.util.*

object TheCandies {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val N: Int
        println("Input Jumlah Siswa :")
        N = `in`.nextInt()
        val C = IntArray(N)
        for (i in 0 until N) {
            println("Input Rating Siswa " + (i + 1) + "/" + N + " : ")
            C[i] = `in`.nextInt()
        }
        val res = IntArray(N)
        for (i in 0 until N) res[i] = 1
        while (N <= N) {
            var changed = false
            //forward
            for (i in 1 until N) {
                if (C[i - 1] < C[i] && res[i - 1] >= res[i]) {
                    res[i] = res[i - 1] + 1
                    changed = true
                }
            }
            //backward
            for (i in N - 1 downTo 1) {
                if (C[i - 1] > C[i] && res[i - 1] <= res[i]) {
                    res[i - 1] = res[i] + 1
                    changed = true
                }
            }
            if (!changed) break
        }
        var sum = 0
        for (j in res) sum += j
        println(sum)
    }
}