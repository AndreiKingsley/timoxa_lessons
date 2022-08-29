import javax.swing.text.StyledEditorKit.BoldAction


fun max(a: Int, b:Int): Int {
    if (a < b) {
        return b
    }
    return a
}
/*
class Struct {
    val valueA: Int = 12
    val valueC: String = "Aboba"
}
\
 */



fun lesson(){

    response("Hi!")

    val boolTrue: Boolean = true
    val boolFalse: Boolean = false

    val int: Int = 12
    val long: Long = 99999999999999L
    val double: Double = 12.0
    val float: Float = 14.99f

    val char: Char = '$'

    val array: Array<Int> = arrayOf(13, 19, 22, 12)

    val str: String = "UCHAPA MUNYANYA))"

    var iq = 112

    if (iq == 12) {
        println("SOSISKA")
    } else if(iq == 100) {
        // do nothing
    } else {
        System.exit(1488)
    }

    for (i in 0..12){
        if (i >= array.size) {
            break
        }
        println(array[i])
    }

    var flag = true
    var i = 0
    while (flag) {
        i++
        if (i == 3) {
            continue
        }
        if (i == 5) {
            flag = false
        }
    }

    /*
    val input = readln()
    val inputNumbers = input.split(" ")

     */


}
