package id.ac.polbeng.yuni.test_kelas

fun main() {
    // val greeter yang memanggil class 2_Greeter
    val greeter = `2_Greeter`()

    // pemanggilan greet 1
    greeter.greet()

    // pemanggilan greet 2
    greeter.text = "Hi"
    greeter.greet("Yuni")
    greeter.greet("Zanika")

    // pemanggilan greet 3
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Yuni Zanika"))
}