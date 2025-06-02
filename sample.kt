lateinit    var list25:ArrayList<String>
2
lateinit   var funClass1:funClass
3
lateinit  var name : String
4
fun main() {
5
    name="Kotlin"
6
    val kotlin = "🙂 ${name}"
7
    println(kotlin)
8
​
9
     list25 = arrayListOf("de", "mdk")
10
     funClass1 = funClass(1, 2, "a", list25)
11
    funClass1.i = 5
12
    println(funClass1.i)
13
    
14
    if(list25!=null){
15
     funClass1.i = 105
16
    println(funClass1.i)
17
    }
18
    list25.let{
19
               funClass1.i = 85
20
    println(funClass1.i)
21
    }
22
​
23
​
24
    funClass1.list1.add("a") // Adds "a" to the end
25
    if (funClass1.list1.isNotEmpty()) funClass1.list1[0] = "b" // Ensuring index exists before modifying
26
​
27
    funClass1.list1.forEach {
28
        println(it)
29
    }
30
​
31
    // Updating funClass1.list1 instead of a separate list
32
    funClass1.list1Update(funClass1.list1, "cherry")
33
​
34
    println("Updated List:")
35
    funClass1.list1.forEach {
36
        println(it)
37
    }
38
}
39
​
40
class funClass(var i: Int, var t: Int, var z: String, var list1: ArrayList<String>) {
41
​
42
    fun list1Update(list1: MutableList<String>, d: String) {
43
        list1.add(d)
44
    }
45
}
