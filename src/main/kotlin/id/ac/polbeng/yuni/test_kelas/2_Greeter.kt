package id.ac.polbeng.yuni.test_kelas

class `2_Greeter` {
    // var text dengan tipe string
    var text: String = ""

    // fungsi greet 1 yang akan dipanggil
    fun greet() {
        println("Hello object world!")
    }
    // fungsi greet 2 yang dipanggil dengan memanngil variabel text dan name
    fun greet(name: String) {
        println("$text $name")
    }

    // fungsi with_ret_val yang dipanggil dengan memangil variabel text dan name
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}