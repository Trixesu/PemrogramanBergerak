fun main() {
    print("Nama mahasiswa: ")
    val nama = readln()

    print("Nilai tugas: ")
    val tugas = readln().toDouble()

    print("Nilai kuis: ")
    val kuis = readln().toDouble()

    print("Nilai UTS: ")
    val uts = readln().toDouble()

    print("Nilai UAS: ")
    val uas = readln().toDouble()

    val nilaiAkhir = (tugas * 0.25) + (kuis * 0.15) +
            (uts * 0.25) + (uas * 0.35)

    println("\n=== NILAI AKHIR ===")
    println("Nama        : $nama")
    println("Nilai akhir : %.2f".format(nilaiAkhir))
}