fun main() {

    println(reverseArray(arrayListOf(32, 5, 78, 45, 3, 9)))

}
fun reverseArray(myNumbers: ArrayList<Int>): ArrayList<Int>{

    var final = arrayListOf<Int>()
    for(i in myNumbers.indices) {
        val nums = myNumbers[myNumbers.size -1 -i]
        final.add(nums)
    }
    return final
}