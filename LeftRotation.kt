import java.util.*

object LeftRotation {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Jumlah Array")
        val n = scanner.nextInt()

//      Simpan Array
        val numbers = IntArray(n)

        // input array
        for (i in 0 until n) {
            println("Input Index : $i = ")
            numbers[i] = scanner.nextInt()
        }
        println("Jumlah Rotasi Kiri :")
        val d = scanner.nextInt()
        scanner.close()
        println(Arrays.toString(rotLeft(numbers, d)))
    }

    fun rotLeft(a: IntArray, d: Int): IntArray {
        val size = a.size
        val rotated_array = IntArray(size)
        var i = 0
        var rotate_index = d
        while (rotate_index < size) {
            rotated_array[i] = a[rotate_index]
            i++
            rotate_index++
        }
        rotate_index = 0
        while (rotate_index < d) {
            rotated_array[i] = a[rotate_index]
            i++
            rotate_index++
        }
        return rotated_array
    }
}