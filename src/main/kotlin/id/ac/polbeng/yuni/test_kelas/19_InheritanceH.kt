package id.ac.polbeng.yuni.test_kelas

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() { // anggota antarmuka 'open' secara default
        println("From interface Polygon")
    }
}
class Square() : Rectangle(), Polygon {
// Kompilator membutuhkan draw() untuk ditimpa:

    override fun draw() {
        super<Rectangle>.draw() // panggil ke Rectangle.draw()
        super<Polygon>.draw() // panggil ke Polygon.draw()
    }
}
fun main() {
    val square = Square()
    square.draw()
}
/*
menunjukan supertype dari kelas yang diwarisi oleh
anggota dapat dilakukan dengan menggunakan keyword super<Base>.
 */