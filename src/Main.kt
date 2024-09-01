fun main() {
    var array = arrayOf(1,2,3,4,5,6,7)
    fuctionOne(array)


}

fun fuctionOne(array: Array<Int>){

    for (i in array.indices step 2){
        array[i] = array[i] + 1

    }
    println(array.contentToString())

}