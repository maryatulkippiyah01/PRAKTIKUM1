fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 18)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}