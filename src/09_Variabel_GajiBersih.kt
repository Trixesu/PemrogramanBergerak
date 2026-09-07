fun main() {
    print("Nama pegawai: ")
    val namaPegawai = readln()

    print("Gaji pokok: ")
    val gajiPokok = readln().toDouble()

    print("Tunjangan: ")
    val tunjangan = readln().toDouble()

    print("Uang lembur: ")
    val uangLembur = readln().toDouble()

    print("Potongan: ")
    val potongan = readln().toDouble()

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("\n=== RINCIAN GAJI ===")
    println("Nama pegawai : $namaPegawai")
    println("Gaji pokok   : Rp%,.2f".format(gajiPokok))
    println("Tunjangan    : Rp%,.2f".format(tunjangan))
    println("Uang lembur  : Rp%,.2f".format(uangLembur))
    println("Gaji kotor   : Rp%,.2f".format(gajiKotor))
    println("Potongan     : Rp%,.2f".format(potongan))
    println("Gaji bersih  : Rp%,.2f".format(gajiBersih))
}