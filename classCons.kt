fun main() {
    val kotlin = "🙂"
    println(kotlin)
     var yeniClassone = yeniClass()
  yeniClassone.yas = 25
  println(yeniClassone.yas)
  
  var oldClassOne = oldClass()
  oldClassOne.il = "İstanbul"
  oldClassOne.ilce = "Beykoz"
  oldClassOne.plaka = 34
  oldClassOne.mahalle = "a mahallesi"

  println(oldClassOne.il)
  println(oldClassOne.ilce)
  println(oldClassOne.plaka)
  
  var newConstructorClass = constructorClass("a","b",55,true)
  println(newConstructorClass.aTip)
  println(newConstructorClass.bTip)
  println(newConstructorClass.cTip)
  
  var newConstructorClassTwo = constructorClassTwo("Antalya","Alanya",30,"alanya mahalle")  
    println("${newConstructorClassTwo.il}, ${newConstructorClassTwo.ilce}, ${newConstructorClassTwo.plaka}, ${newConstructorClassTwo.mahalle}")

  var newConsClassOne = newConsClass("a","b",5) 
  println("${newConsClassOne.harf1}, ${newConsClassOne.harf2},${newConsClassOne.num}")
  
  var newsehirConsClass = sehirConsClass("Kahramanmaraş","Dulkadiroğlu",46,"Aksu mahallesi")
  println("${newsehirConsClass.il} ${newsehirConsClass.ilce} ${newsehirConsClass.plaka} ${newsehirConsClass.mahalle}")
}


  class  yeniClass{
      var yas = 0 
      var isim = ""
      var meslek =""
  }
  class oldClass{
      var il = ""
      var ilce = ""
      var plaka = 0
      var mahalle = ""
  }
  
  class constructorClass {
      var aTip = ""
      var bTip = ""
      var cTip = 0
      var dTip = true
      
      
      constructor(aTip:String,bTip:String,cTip:Int,dTip:Boolean)
      {
          this.aTip = aTip
          this.bTip = bTip
          this.cTip = cTip
          this.dTip = dTip
      }
  }
   
   
  class constructorClassTwo {
      var il = "" 
      var ilce = ""
      var plaka = 0 
      var mahalle = ""
      
      constructor (il:String , ilce:String,plaka:Int,mahalle:String){
          this.il = il 
          this.ilce = ilce 
          this.plaka = plaka 
          this.mahalle = mahalle 
          
      }
  } 
  
  class newConsClass (var harf1:String,var harf2:String,var num:Int){
      /*
      var harf1 = ""
      var harf2 = ""
      var num = 0
      
      constructor (harf1:String,harf2:String,num:Int){
          this.harf1=harf1
          this.harf2=harf2
          this.harf3=harf3
      }*/
  }
   
    
 class sehirConsClass (var il:String,var ilce:String,var plaka:Int,var mahalle:String){
     
 }   
   
   
   
   