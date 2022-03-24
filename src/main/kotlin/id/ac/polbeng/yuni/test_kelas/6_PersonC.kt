package id.ac.polbeng.yuni.test_kelas

/*
ringkasnya lagi dari PersonB, mendeklarasi dan inisialisasi property yang dilakukan hanya didalam
parameter konstruktor utama
 */

class `6_PersonC` (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val yuni = `6_PersonC`("Yuni", "Zanika", 21)
    println("Name : ${yuni.firstName} ${yuni.lastName}")
    println("Age : ${yuni.age}")
}