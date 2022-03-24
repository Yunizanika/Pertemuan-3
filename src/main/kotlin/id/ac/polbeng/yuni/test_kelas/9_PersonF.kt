package id.ac.polbeng.yuni.test_kelas
//
class `9_PersonF` (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val anton = `9_PersonF`("Anton", "Sejati")
    val budi = `9_PersonF`("Budi", "Gunawan", 21)
    val caca = `9_PersonF`("Caca", "Andika", "Indonesia")
    val dono = `9_PersonF`("Dono", "Putri", 25, "Indonesia")
}
/*
Terdapat 1 konstruktor utama dan 3 buah konstruktor tambahan.
Konstruktor tambahan pertama dan kedua mendelegasikan konstruktor
utama. Sedangkan konstruktor tambahan ketiga medelegasikan konstruktor
tambahan pertamayang secara tidak langsung juga mendelegasikan
konstruktor utama.
 */