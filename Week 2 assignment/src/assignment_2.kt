
fun main(args:Array<String>)
{
    println("_______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 0");
}

fun getSquares(word:String)
{ 
    val myList = word.split(" ")
    val myMap = mutableMapOf<Int, Int>()
    for (i in myList) {
        var p = i.toInt()
        var square = i.toInt()*i.toInt()
        myMap.put(key = p, value = square)
    }
    println(myMap)

    
   //Complete this function to solve the question.
}
