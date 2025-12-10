fun main() {
    var firstName: String = "Ricky"
    var lastName: String = "Rinaldy"

    var address: String = """
       ?Jalan Belum Jadi
       ?Kota Palembang
       ?Palembang
       ?Sumsel
       ?Indonesia
    """.trimMargin("?")

    println(firstName + " " + lastName)
    println("$firstName $lastName")
    println("ini nama depan : ${firstName}")
    println("ini nama depan jumlah : ${firstName.length}")
    println(address)
}