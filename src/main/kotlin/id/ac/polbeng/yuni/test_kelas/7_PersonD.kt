package id.ac.polbeng.yuni.test_kelas

class `7_PersonD` {
    var firstName: String
    var lastName: String
    var age: Int

    // keyword constructor
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }

}
fun main(){
    val yuni = `7_PersonD`("Yuni", "Zanika", 21)
    println("Name : ${yuni.firstName} ${yuni.lastName}")
    println("Age : ${yuni.age}")
}

/*
        Konstruktor tambahan (secondary constructor) didefenisikan didalam tubuh kelas. Jika property
        kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di
        inisialisasi didalam konstruktor tambahan atau blok inisialisasi. Konstruktor tambahan
        memerlukan keyword constructor untuk mendefenisikannya. Selain itu konstruktor tambahan
        boleh tidak memiliki tubuh kelas dalam pendefenisiannya.
 */