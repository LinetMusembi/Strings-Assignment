fun main() {
   school()
    println(paragraph("lynet",19))
    measurement()
    personal()
}
fun school(){
    var campus = "akirachix"
    println(campus[0])
    println(campus[2])
    println(campus[3])
}
fun paragraph(name:String,age:Int):String{
    var x = "name"
    var y = age
    return("Hi,my name is $name and I am $age years old")
}
fun measurement(){
    var distance = "I love coding"
    return(println("The length is " + distance.length))

}
fun personal(){
    val name = "moureen"
    if (name == "lynet"){
        println("That's me")}
    else if (name != "lynet")
        println("I don't know who that is ")
    }
