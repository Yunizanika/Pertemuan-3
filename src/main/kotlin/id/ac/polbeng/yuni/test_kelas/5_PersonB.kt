package id.ac.polbeng.yuni.test_kelas

class `5_PersonB` (_firstName: String, _lastName: String, _age: Int) {

    /*
    Ringkasan kode program kelas PersonA dengan menggabungkan
    proses deklarasi dan menginisialisasi sebuah variabel pada
    blok inisialisasi kedalam satu statement
     */
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val yuni = `5_PersonB`("Yuni", "Zanika", 21)
    println("Name : ${yuni.firstName} ${yuni.lastName}")
    println("Age : ${yuni.age}")
}