fun tambah(a: Double, b: Double): Double = a + b

fun kurang(a: Double, b: Double): Double = a - b

fun kali(a: Double, b: Double): Double = a * b

fun bagi(a: Double, b: Double): Double = a / b

fun main() {
    print("Masukkan angka pertama: ")
    val a = readln().toDouble()

    print("Masukkan angka kedua: ")
    val b = readln().toDouble()

    println("\n=== KALKULATOR ===")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")

    print("Pilih operasi (1-4): ")
    val pilihan = readln().toInt()

    when (pilihan) {
        1 -> println("Hasil: ${tambah(a, b)}")
        2 -> println("Hasil: ${kurang(a, b)}")
        3 -> println("Hasil: ${kali(a, b)}")
        4 -> {
            if (b == 0.0) {
                println("Kesalahan: pembagian dengan nol tidak diperbolehkan.")
            } else {
                println("Hasil: ${bagi(a, b)}")
            }
        }
        else -> println("Kesalahan: pilihan operasi tidak valid.")
    }
}