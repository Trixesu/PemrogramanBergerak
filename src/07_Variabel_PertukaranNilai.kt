fun main() {
    print("Masukkan nilai A: ")
    var a = readln().toInt()

    print("Masukkan nilai B: ")
    var b = readln().toInt()

    println("\nSebelum ditukar:")
    println("A = $a")
    println("B = $b")

    // Menukar nilai menggunakan satu variabel sementara.
    val sementara = a
    a = b
    b = sementara

    println("\nSetelah ditukar:")
    println("A = $a")
    println("B = $b")
}