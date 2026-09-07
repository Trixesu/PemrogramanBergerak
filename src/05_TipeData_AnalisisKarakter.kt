fun main() {
    print("Masukkan satu karakter: ")
    val karakter = readln().first()

    println("\n=== ANALISIS KARAKTER ===")
    println("Karakter         : $karakter")
    println("Kode karakter   : ${karakter.code}")
    println("Termasuk huruf  : ${karakter.isLetter()}")
    println("Termasuk angka  : ${karakter.isDigit()}")
}