fun main() {
    print("Masukkan suhu Celsius: ")
    val celsius = readln().toDouble()

    val fahrenheit = (celsius * 9 / 5) + 32
    val kelvin = celsius + 273.15

    println("\n=== HASIL KONVERSI ===")
    println("Celsius    : $celsius °C")
    println("Fahrenheit : $fahrenheit °F")
    println("Kelvin     : $kelvin K")
}