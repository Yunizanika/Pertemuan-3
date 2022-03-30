package id.ac.polbeng.yuni.test_kelas

data class Student(val name: String, val age: Int)

fun main() {
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is: ${boni.name}")
    println("Student Age is: ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("Student Age is: ${meri.age}")
}
/*
data kelas dikotlin digunakan untuk menangani data lebih baik.Sebuah data kelas sama seperti kelas biasa tapi memiliki tambahan funsionalitas.
Di Kotlin, kita tidak perlu menulis atau men-generate semua data kelas seperti method Getter dan Setter di
Java, Kotlin telah men-generate secara otomatis fungsi Getter dan Setter pada setiap anggota
kelas.Selain itu, ia juga menurunkan implementasi fungsi standar seperti equals(), hashCode()
dan toString() dari property yang dideklarasikan didalam data kelas kontruktor utama.
 */