package id.ac.polbeng.yuni.test_kelas

// modifier open = Agar dapat diwariskan ke kelas anak, kelas induk harus memiliki akses ini.
// Kelas Induk
open class Computer(val name: String,
                    val brand: String) {
}

// Kelas anak (menginisialisasi kelas induk)
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){

    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}
/*
Inheritance adalah salah satu konsep OOP.
Inheritance mengizinkan sebuah kelas untuk mewariskan fitur kelas (property dan method) ke kelas lainnya.
Kelas yang mewarisi fitur kelas lainnya dipanggil child class atau derived class atau subclass dan
kelas yang fiturnya diwariskan dipanggil parent class atau base class atau super class.
Semua kelas di Kotlin memiliki base class yang dipanggil Any (tiga method yaitu equals() , hashCode() dan toString().).
 */