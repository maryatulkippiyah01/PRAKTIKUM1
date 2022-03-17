fun main(args: Array<String>) {
    val a = 8
    val b = 20
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """ 
    ${'$'}9.99 
    """
    println(price)
}