import java.util.*

fun main(){
    array("Apiu","Joan","Juma","Miriam")
    nations()
    numbers()
  println(naming("Pauline","juja","princess"))
}
fun array(name1:String,name2:String,name3:String,name4:String){
    var names= arrayOf(name1,name2,name3,name4)
    println(names.contentToString())

    }


fun nations(){
    var Cities = arrayOf("harare","mumbai","dodoma","jakarta")
    var capitalize = (Cities.map { it.capitalize() }.sorted())
    println(capitalize)


}
fun numbers(){
   var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())


}
fun naming(name1:String,name2: String,name3: String):String{
    var words= arrayOf(name1,name2,name3)
    return words.contentToString()


}