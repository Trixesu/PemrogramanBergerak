fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main() {
    print("Masukkan panjang: ")
    val panjang = readln().toDouble()

    print("Masukkan lebar: ")
    val lebar = readln().toDouble()

    val luas = hitungLuas(panjang, lebar)

    println("\n=== HASIL PERHITUNGAN ===")
    println("Panjang : $panjang")
    println("Lebar   : $lebar")
    println("Luas    : $luas")
}