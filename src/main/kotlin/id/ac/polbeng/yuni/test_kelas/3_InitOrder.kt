package id.ac.polbeng.yuni.test_kelas

class `3_InitOrder`(name: String) {
    val firstProperty = "Properti Pertama: $name".also(::println)
    init {
        println("Blok penginisialisasi pertama yang mencetak ${name}")
    }
    val secondProperty = "Properti Kedua: ${name.length}".also(::println)
    init {
        println("Blok penginisialisasi kedua yang mencetak ${name.length}")
    }
}
fun main(){
    val initOrder = `3_InitOrder`("RPL")
}

/*
---------- Initializer Block ------------

Blok inisialisasi diawali dengan keyword init. Selama instansiasi sebuah objek, urutan eksekusi
blok inisialisasi sama dengan urutan yang ada pada tubuh kelas, berselangkan inisialisasi
property-nya.
 */