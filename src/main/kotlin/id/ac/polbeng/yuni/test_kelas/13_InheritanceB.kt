package id.ac.polbeng.yuni.test_kelas

// Kelas anak (menginisialisasi kelas induk
class LaptopB : Computer{
    val batteryLife: Double
    // Memanggil super() untuk menginisialisasi kelas Induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    // Memanggil konstruktor lain (yang memanggil super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}

/*
Jika di kelas anak tidak memiliki primary constructor, maka semua secondary constructor yang
di inisialisasi kelas induk dipanggil dengan keyword super secara langsung atau mendelegasikan
ke konstruktor yang lain.
 */