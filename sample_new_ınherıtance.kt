class Sınıflar {
    var aSınıfı = "a"
        private set 
    
    private var aNumarası = 0  
    
	fun updateA( yeniNumara:Int){
        this.aNumarası=yeniNumara
    }
    fun getA():Int{
        return aNumarası
    }
    
    private var aMesaj ="a mesaj"
    
    fun getMesaj():String {
        return aMesaj
    }
    fun setMesaj(yeniMesaj:String){
        this.aMesaj=yeniMesaj
    }
    
    private var yeniDouble = 5.0
    fun updateDouble(upDouble:Double){
        this.yeniDouble=upDouble
    }
    fun getDouble():Double{
        return yeniDouble
    }
    
    private var yeniFloat = 15.2f
    
    fun setFloat(yeniFloat1:Float){
        this.yeniFloat=yeniFloat1
    }
    fun getFloat():Float{
        return yeniFloat
    }
    


 private var dizi: Array<String> = arrayOf()
    
fun getDizi(): Array<String> = dizi
fun setDizi(diziYeni:Array<String>){
    this.dizi = diziYeni
}

private var myList:ArrayList<String> = arrayListOf()
fun getmyList() : ArrayList<String> = myList
fun setMyList(myListNew:ArrayList<String>){
    this.myList = myListNew
}

private var myMap : HashMap<String,Int> = hashMapOf()
fun getmyMap () : HashMap<String,Int> = myMap
fun setMyMap(myMapnew:HashMap<String,Int>){
    this.myMap=myMapnew
}    

    
}

fun main() {
    val kotlin = "🙂"
    println(kotlin)

    val sınıf = Sınıflar()
    println(sınıf.aSınıfı) 

    // sınıf.aSınıfı = "b" // ❌ Error! Private setter prevents modification outside the class

    sınıf. updateA(42)
    println("Numara: ${sınıf.getA()}") // ✅ Correct way to access `aNumarası`
    
    sınıf.setMesaj("Merhaba Oop ")
   	println("Mesaj : ${sınıf.getMesaj()}")
    
    sınıf.updateDouble(85.2)
    println("Double : ${sınıf.getDouble()}")
    
    sınıf.setFloat(89.2f)
   println("Float : ${ sınıf.getFloat()}")
   
    sınıf.setDizi(arrayOf("a","b","c","d"))
    println(sınıf.getDizi().joinToString())
    
    
   var Mağaza1 = Mağaza()
   var bilgisayar1 = Bilgisayar()
   Mağaza1.satış()
   bilgisayar1.satış()
   println(Mağaza1.setBilgisayar("Vestel"))
   println(Mağaza1.getBilgisayar())
   
      var ornekDizi = arrayOf(Mağaza1,bilgisayar1)
        ornekDizi.forEach {
            it.satış()
        }
   
}

class Mağaza() : Bilgisayar(){
override    fun satış(){
        println("Satış yapıldı")
    }
}

open class Bilgisayar(){
    private var bilgisayarAdı =""
   fun getBilgisayar():String{
		return bilgisayarAdı        
    }
   fun setBilgisayar(newComp:String): String{
        this.bilgisayarAdı=newComp
          return "Bilgisayar adı değiştirildi: $bilgisayarAdı"

    }
    
open    fun satış (){
        println("Bilgisayar satışı yapıldı")
    }
}
