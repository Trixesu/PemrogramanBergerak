fun main() {
    print("Nama barang: ")
    val namaBarang = readln()

    print("Harga barang: ")
    val harga = readln().toDouble()

    print("Jumlah barang: ")
    val jumlah = readln().toInt()

    print("Diskon (%): ")
    val diskon = readln().toDouble()

    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println("\n=== RINCIAN BELANJA ===")
    println("Nama barang : $namaBarang")
    println("Harga       : Rp%,.2f".format(harga))
    println("Jumlah      : $jumlah")
    println("Subtotal    : Rp%,.2f".format(subtotal))
    println("Diskon      : $diskon%")
    println("Potongan    : Rp%,.2f".format(potongan))
    println("Total bayar : Rp%,.2f".format(totalBayar))
}