package id.ac.polbeng.yuni.test_kelas

class `4_PersonA` (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val yuni = `4_PersonA`("Yuni", "Zanika", 21)
    println("Name : ${yuni.firstName} ${yuni.lastName}")
    println("Age : ${yuni.age}")
}
/*
menginisialisasi property konstruktor yang dideklarasikan didalam tubuh kelas
 */