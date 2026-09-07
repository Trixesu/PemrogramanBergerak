fun main() {
    val PI = 3.14159

    print("Masukkan jari-jari lingkaran: ")
    val r = readln().toDouble()

    val luas = PI * r * r
    val keliling = 2 * PI * r

    println("\n=== HASIL PERHITUNGAN ===")
    println("Jari-jari : $r")
    println("Luas      : $luas")
    println("Keliling  : $keliling")
}