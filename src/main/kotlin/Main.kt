import java.text.SimpleDateFormat
import java.util.*

fun main() {

//    task1
    var array: Array<Int> = arrayOf(12,4,3,21,123,10,18,8,23,0)
    println(avgSumOfEven(array))

//    task2
    var str = "string"
//    var str = "txt"
    println(findPalindrome(str))

//    task3
    var date = Date()
    println(date.formatDateToString("dd/MM/YYYY"))
}

fun avgSumOfEven(array: Array<Int>): Int {
    var sum   = 0
    var count = 0
    for (i in array.indices ){
        if (array[i] % 2 == 0){
            count ++
            sum += array[i]
        }
    }
    return sum/count
}

fun findPalindrome(str : String):Boolean{
    return str.reversed() == str

}

fun Date.formatDateToString(pattern: String) : String{
    val formattedDate= SimpleDateFormat(pattern, Locale.getDefault())
    return formattedDate.format(this)
}