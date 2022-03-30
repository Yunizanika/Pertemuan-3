package id.ac.polbeng.yuni.test_kelas

class Employee(_id: Int, _name: String, _age: Int) {
    // Setter Dan Getter
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
fun main() {
    val emp = Employee(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}
/*
Enkapsulasi adalah konsep OOP yang memungkinkan kita untuk menyembunyikan informasi
dari suatu kelas sehingga anggota-anggota kelas tersebut tidak bisa diakses dari luar.

Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara sefault Kotlin telah
men-generate method getter dan setter untuk property yang mutable (var) dan hanya getter
untuk property yang read-only (val). Secara default kode yang ter-generate secara otomatis
tersebut adalah seperti pada contoh diatas
 */