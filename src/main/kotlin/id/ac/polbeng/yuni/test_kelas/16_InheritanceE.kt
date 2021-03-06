package id.ac.polbeng.yuni.test_kelas

open class NewPerson {
    open var age: Int = 1
}
class CheckedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}
fun main() {
    val person = NewPerson()
    person.age = -5 // Works
    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5 // Throws IllegalArgumentException : Umur tidak boleh negatif
}

/*
Kita dapat meng-override property kelas menggunakan inisialisasi atau menggunakan custom
setter dan getter function.
 */