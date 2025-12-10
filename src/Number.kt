fun main() {
    var age: Byte = 30

    var sample: Float = 10.11F
    //Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001
    //underscore in number
    var balance: Long = 1_000_000_000_000L
    //conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var balanceInt: Int = balance.toInt()

    println(age)
    println(sample)
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)
    println(balance)
    println(balanceInt)
}