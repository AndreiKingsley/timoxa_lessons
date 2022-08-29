
fun response(line: String): Int{
    when(line) {
        "HELLO" ->  println("HELLO")
        "BYE" -> println("HELLO1")
        else -> println("HELLO2")
    }
    return 5
}
fun main(){
    response("HELLO")
}
