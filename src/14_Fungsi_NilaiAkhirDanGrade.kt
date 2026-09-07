fun hitungNilaiAkhir(
    tugas: Double,
    uts: Double,
    uas: Double
): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80 -> "A"
        nilai >= 70 -> "B"
        nilai >= 60 -> "C"
        nilai >= 50 -> "D"
        else -> "E"
    }
}

fun main() {
    print("Masukkan nilai tugas: ")
    val tugas = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val uts = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val uas = readln().toDouble()

    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)

    println("\n=== HASIL NILAI ===")
    println("Nilai akhir : %.2f".format(nilaiAkhir))
    println("Grade       : $grade")
}