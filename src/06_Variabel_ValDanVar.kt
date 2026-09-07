fun main() {
    val nama = "Andi Saputra"
    val npm = "123456789"
    var semester = 2
    var ipk = 3.50

    println("=== DATA SEBELUM DIPERBARUI ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")

    // Semester dan IPK dapat berubah karena menggunakan var.
    semester = 3
    ipk = 3.70

    println("\n=== DATA SESUDAH DIPERBARUI ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}