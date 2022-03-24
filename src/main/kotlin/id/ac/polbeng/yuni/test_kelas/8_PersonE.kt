package id.ac.polbeng.yuni.test_kelas

class `8_PersonE` {
    var firstName: String
    var lastName: String
    var age: Int = 21

    // lebih dari konstruktor
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    /*
    Keyword this merujuk pada konstruktor kelas saat ini yang bersesuaian.
    diatas, this(_firstName, _lastName) merujuk pada konstruktor yang pertama dan akan
    memanggilnya terlebih dahulu sebelum kode didalam konstruktor yang kedua
    dieksekusi.
     */

    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val nelia = `8_PersonE`("Nelia", "Dane")
    nelia.cetakInfo()
    println()
    val yuni = `8_PersonE`("Yuni", "Zanika", 21)
    yuni.cetakInfo()
}