//CONSTANT untuk deklarasi variable yang global : bisa diakses dimana saja
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    //immutable
    val firstName = "Ricky"
    //mutable
    var lastName = "Rinaldy"
    //nullable
    var bolehNull: String? = "Ini Boleh Null"
    bolehNull = null

    println(firstName)
    println(lastName)
    //jika null harus ada tanda ?, kalau bisa jangan null kalau di kotlin
    println(bolehNull?.length)

    println("$APPLICATION $VERSION")
}