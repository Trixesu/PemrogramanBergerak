fun main() {
    print("Masukkan bilangan desimal: ")
    val inputString = readln()

    val nilaiDouble = inputString.toDouble()
    val nilaiInt = nilaiDouble.toInt()
    val nilaiString = nilaiDouble.toString()

    println("\n=== HASIL KONVERSI ===")
    println("Nilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiString")
}