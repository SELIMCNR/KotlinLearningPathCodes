lateinit    var list25:ArrayList<String>
lateinit   var funClass1:funClass
lateinit  var name : String
fun main() {
    name="Kotlin"
    val kotlin = "🙂 ${name}"
    println(kotlin)

     list25 = arrayListOf("de", "mdk")
     funClass1 = funClass(1, 2, "a", list25)
    funClass1.i = 5
    println(funClass1.i)
    
    if(list25!=null){
     funClass1.i = 105
    println(funClass1.i)
    }
    list25.let{
               funClass1.i = 85
    println(funClass1.i)
    }


    funClass1.list1.add("a") // Adds "a" to the end
    if (funClass1.list1.isNotEmpty()) funClass1.list1[0] = "b" // Ensuring index exists before modifying

    funClass1.list1.forEach {
        println(it)
    }

    // Updating funClass1.list1 instead of a separate list
    funClass1.list1Update(funClass1.list1, "cherry")

    println("Updated List:")
    funClass1.list1.forEach {
        println(it)
    }
}

class funClass(var i: Int, var t: Int, var z: String, var list1: ArrayList<String>) {

    fun list1Update(list1: MutableList<String>, d: String) {
        list1.add(d)
    }
}
