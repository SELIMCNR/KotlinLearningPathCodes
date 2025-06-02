fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    //Static polymorphism
    var math1 = Math()
    println(math1.cikarma(10,1))
    println(math1.cikarma(10,5,2))
    println(math1.cikarma(15,2,1,1))
    
    println(math1.toplama(10,1))
    println(math1.toplama(15,5,4))
    println(math1.toplama(10,4,2,8))
    println(math1.testFunc())
    println(math1.testFuncInterface())
    
    
    //Lambda
    println("-----Lambda-----")
   
    var yazdigimiYazdir = {verilenString:String->println(verilenString)}
	 yazdigimiYazdir("A")
     
   	var carmpaİslemiLambda = {a:Int,b:Int -> a*b}  
    
     
     var bolmeİslemiLambda = {a:Int,b:Int -> a/b}
     println(bolmeİslemiLambda(10,2))
     
     
     
     var yazdirLambda = {yazi:String -> println(yazi)}
     println(yazdirLambda("a"))
     
     var takımYazdir = {Takım:String,Puan:Int -> println( "${Takım} + ${Puan}  ")}
     
     takımYazdir("Fenerbahçe",150) 
}



 class Math ():testClass(),testInterface{
     
    fun  cikarma(s1:Int,s2:Int):Int{
        return s1-s2
    }
    
    fun cikarma(s1:Int,s2:Int,s3:Int):Int{
        return s1 -(s2+s3)
    }
    
    fun cikarma(s1:Int,s2:Int,s3:Int,s4:Int):Int{
        return s1-(s2+s3+s4)
    }
    
    fun toplama(s1:Int,s2:Int):Int{
        return s1+s2
    }
    fun toplama(s1:Int,s2:Int,s3:Int):Int{
        return s1+s2+s3
    }
    fun toplama(s1:Int,s2:Int,s3:Int,s4:Int):Int{
        return s1+s2+s3+s4
    }
    
    override fun testFunc():Int{
       return 2
    }
    override fun testFuncInterface():Double{
		return 5.0
    }
 }
 
 abstract class testClass {
     open abstract fun testFunc():Int
 }
 interface testInterface{
     fun testFuncInterface():Double{
         return 0.0
     }
 }
 
 
 
 
