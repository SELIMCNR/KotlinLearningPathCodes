/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
var sayac = 0
fun main() {
    println("Hello, world!!!")
    println("loglara")
    //not alma kısa satır
    /* not alma uzun satır */
    println(55*55)
    println(15/5)
    println(5/2) 
    println()
    
    var x = 10 
    println(x)
    println(x*80)
    
    x = 30 
    println(x*15)
    
    var y = 15 //var sonradan değişen değer
    println(y)
    println(x/y)
    
    val z = 200 //val sabit değer
    println(z*100)
    
    
    //implicit veri tipini belirtmeme
    var yazi = "yazi" 
    var yazi2 = "String yazi2"
   //explicit veri tipi belirtme
   var ornekShort : Short = 200
   var ornekByte : Byte = 100
   var ornekInt : Int = 300
   var ornekIntler : Int = 400
    println(ornekByte*ornekShort)
    println(ornekByte/ornekShort)


   var ornekDegiskenInt:Int = 500 
   println(ornekDegiskenInt)	

    
   val kullaniciYasi = 25
   val kullanici_yasi =45
   val kullaniciyasi =85
   var ornekYazim = "yazi"
    // snake_case
    // camelCase
    
    var m = 10
    var n = 20
    var sonuc = m+n
    println(sonuc)
    
    // double - float - kesirli sayılar
    println("-----DoubleFloat-------")
    
    val pi = 3.141529546484
    
    println(pi*2)
    
    println(5/2)
    println(5.0/2.0)
    
    val ornekDouble = 5.25
    
    val sonucDouble = pi * ornekDouble
    println(sonucDouble)
    
    val ornekFloat : Float = 2.25f
    println(ornekFloat*35)
    
    
    // unsigned integer types pozitif sayılar
      var sayi151 :UByte = 15u
    var sayi15 :UShort = 25u
    var sayi28 :UInt = 3638u
      var sayi121 :ULong = 20005u


    
    //Stringler ->
    println("-----String -----")
    
    val benimString = "Benim String'im "
    println(benimString)
    
    var ornekString : String = "ornek"
    var isim = "Selim"
    var soyisim ="Çınar"
    
    println(isim.uppercase())
    println(isim.lowercase())
    println(x.rem(5))
    println(isim+" "+soyisim)

    	
    
    val yas ="35"
    val ornekDeger = "20"
    println(yas + ornekDeger)
    
    //Dönüşümler
    println("Dönüşümler")
    
    var donusenStr : String
    donusenStr = "hello" // initalize,init,initialization
    
    var stringYeni : String = "Sayi"
    //conversion dönüşüm
    val yasInt = yas.toInt()
    val xDouble = x.toDouble()
    val xFloat = x.toFloat()
    
 
    
    println(yasInt*30)
    
    
    //Boolean
    println("--------Boolean---------")
    var benimBool : Boolean = true
    benimBool = false
    
   
    
    println(3>5) //büyük
    println(2<5)
    println(4==4) // eşit mi
    
    val kullaniciYas = "35"
    println(kullaniciYas.toInt()>18)
    
    //< ,> ,<= ,>=,==,!=,&& ve ,|| vey
    
    println("selim" == "selim")
    println(11!=11 && 12==11)
    println(4>1 || 1>4)

    
   
    
    var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

   var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate"))  // Outputs 7
    
    var firstName = "John"
var lastName = "Doe"
println("My name is $firstName $lastName")
 

   
   // Veri Yapılar
   
   //Diziler - Array  sabittir sonradan eleman eklenmez
   println("------Array------")
   
    
   val stringOrnegi = "selim" 
   val benimDizim = arrayOf(stringOrnegi,"b","d","e","f")
   println(benimDizim[0])
   println(benimDizim[1])
   println(benimDizim.last())
   
   benimDizim[1] = "sam"
   println(benimDizim[1])
   println(benimDizim.get(3))

   val numaraDizisi = arrayOf(1,10,20,15,2,4)
   println(numaraDizisi[5]*100)
   
  
   
   val karisikDizi = arrayOf(10,3,14,"a",false,true)
   println(karisikDizi[2])
   
   
   var dizim = arrayOf("s","a",5,4,true)
   println(dizim[0])
   println(dizim[2])
   
   dizim[3]=25
   println(dizim[3])


  
    
   println("-------ArrayList------")
   
   val isimListesi = arrayListOf("a","b","c","d")
   println(isimListesi[0])
   println(isimListesi[1])
   println(isimListesi[2])
   
   
   
   println(isimListesi.size)
   isimListesi.add("m")
   println(isimListesi.get(1))
   isimListesi[2] = "a"
   println(isimListesi.get(2))
   isimListesi[1] = "c"
   println(isimListesi[1])
   
   
   val numaraListesi = arrayListOf <Int>() 
   numaraListesi.add(5646)
   numaraListesi.add(30)
   println(numaraListesi[0])
   
   
   
   val digerOrnekListe = ArrayList<Int>()
   digerOrnekListe.add(20)
   digerOrnekListe.add(10)
   digerOrnekListe.add(10)
   println(digerOrnekListe[1]) 

   
   println(numaraListesi[1] * digerOrnekListe[2])
   
   val karisikListe = arrayListOf(10,3.14,"Selim",true)
   val karisikBosListe = arrayListOf<Any>()
   karisikBosListe.add(10)
   karisikBosListe.add("b")
   karisikBosListe.add(false)
   
   println(karisikBosListe.get(0))


   val yenListe = arrayListOf("a","b",4,5)
   yenListe.add("c")
   yenListe.add("d")
   println(yenListe.get(0))
   println(yenListe[1])

   //Setler sabittir
   println("--------set------")
   val ornekSet = setOf(10,10,10,20,30,30,40,50,50)
   println(ornekSet.size)
   
   ornekSet.forEach{
       println(it)
   }
   
   
   val bosSetOrnegi = HashSet<String>()
   bosSetOrnegi.add("a")
   bosSetOrnegi.add("a")
   bosSetOrnegi.add("a")
   bosSetOrnegi.add("a")
   bosSetOrnegi.add("b")
   
   bosSetOrnegi.forEach{
       println(it)
   }

   val setler1 = HashSet<String>()
   setler1 .add("bir")
   setler1.add("bir")
   setler1.forEach{
	   println(it)
   }
   
   
 
   var ornekDizi = arrayOf("a","sds","dsd","a","a")
   val ornekTekilSet = ornekDizi.toHashSet()
   ornekTekilSet.forEach{
       println(it)
   }

   
   
   println("-------Map----------")
   // Anahtar - Değer Eşleşmesi
   
   val yemekDizisi = arrayListOf("e","a","k")
     
   val kaloriDizisi = arrayListOf(100,150,200)
   
   println("${yemekDizisi[1]} 'nın kalorisi ${kaloriDizisi[1]} ")
   

   
   val yemekKaloriMapi = hashMapOf<String,Int>()
   yemekKaloriMapi.put("Elma",100)
   yemekKaloriMapi.put("Armut",150)
   yemekKaloriMapi.put("Karpuz",200)
   
   println(yemekKaloriMapi["Elma"])
   println(yemekKaloriMapi["Armut"])
   yemekKaloriMapi.put("Elma",300)
   println(yemekKaloriMapi.get("Elma"))

   val ornekHashMap = HashMap<String,String>()
   ornekHashMap.put("a","b")
   ornekHashMap.put("c","d")

   val yeniMap = hashMapOf <String,Int>()
   yeniMap.put("a",1)
   yeniMap.put("b",2)
  println(yeniMap.get("a"))
  println(yeniMap.get("b"))
   
   // if statements
   println("-------If Kontrolleri -------")
   println(3>2)
   
   var sayi = 10 
   sayi = sayi + 1 
   println(sayi) 
   
   sayi++
   println(sayi)
   sayi--
   println(sayi)
   
   //Kalanını bulma -remainder 
   println(10%4)
   
   val skor = 15
    
   if(skor<10){
       println("Oyunu kaybettiniz")
   }
   else if (skor>=10 && skor<20)
    {
        println("oyunda idare eder bir skor aldınız")
    }
   else if (skor>=20 && skor<30){
       println("güzel bir skor elde ettiniz")
   } 

  
	

   
 
   //when 
   println("-------When----------")
   
   val notRakam = 0
   var notString = ""
   
   
   when(notRakam){
       0-> notString = "Geçersiz not"
       1-> notString = "Zayıf"
       2-> notString = "Kötü"
       3-> notString = "Orta"
       4-> notString = "İyi"
       5-> notString = "Pek iyi"
       in 0..49 -> println("ortalama")
       
       else -> notString = "böyle bir not yok"
       
   } 
   
   println(notString)



    
   
   println("--------While Döngüsü----------")
   
   var j = 0 
   println("döngü başladı")
   while(j<10){
       println(j)
       j=j+1
   }
   println("döngü bitti")
	
	
   // For döngüsü 
   
   println("------For döngüsü ---------")
   
   val baskaDizi = arrayListOf(5,10,15,20,25,30)
   println(baskaDizi[0]/5*3)
   println(baskaDizi[1]/5*3)

   
   for(numara in baskaDizi){
       println(numara /5 * 3)
   }
   println("döngü bitti")
   
   for (num in 0..9){
       println(num*10)
   }
  
   
   val benimStringDizim = ArrayList<String>()
   benimStringDizim.add("Selim")
   benimStringDizim.add("A")
   benimStringDizim.add("b")
   
   for (kelime in benimStringDizim){      
       println(kelime.uppercase())
   }
   
   benimStringDizim.forEach{
       println(it.uppercase())
   }

   
   
 yazdir()
 cikarma(5,4)
 toplama(9,10)

 var carpmaSonucu =  carpma(1,5,15)*5
 println("Çarpma sonucu : ${carpmaSonucu}")
 bolme(15,5)
println( boolDogru(true,50.0))
println( boolYanlis(50,false))

var ort = ortalama(86.7,72.5)
println("Ortalama sonucu ${ort}")

var sayiPozNeg= PozitifNegatif(-15.2)
println("Sayi değeri : ${sayiPozNeg}")

var ucgenAlan= ucgenAlan(300,20)
println("Ucgenin alanı : ${ucgenAlan}")

var sayiBoyle = sayiNasıl(15,45)
println("Sayi : ${sayiBoyle}")

var ortalamaNedir=ortalamaHesap(75,85)
println("${ortalamaNedir}")

var daireHesabı = daireHesabi(85.75)
println("Daire hesab sonucu : ${daireHesabı}")
yazdırFor()
}
	fun yazdir(){
        sayac++
        println("yazdir çalıştırıldı : ${sayac}")
    }
	fun cikarma(s1:Int,s2:Int){
        println("Cikarma sonucu : ${s1-s2}")
    }

	fun toplama(s1:Int,s2:Int){
        println("Toplama sonucu : ${s1+s2}")
    }
    
    fun carpma (s1:Int,s2:Int,s3:Int):Int{
        var sonucBu = s1*s2*s3
        return sonucBu
    }
    
    fun bolme (s1:Int,s2:Int){
      println("Bolme sonucu : ${s1/s2}")
    }
    
    fun boolDogru (dogru:Boolean, not:Double):String{
        var updateNote = not
        if(dogru==true){
            updateNote +=10
            return "Not bu : ${updateNote}"
        }
        else {
        	updateNote -=10
           return "Cevap Yanlış : ${updateNote}"
        }
    }
    
    
   fun boolYanlis (not:Int,yanlismi:Boolean):String{
       var updateNot = not
       if(yanlismi == false){
           updateNot-=10 
           return "Notunuz bu : ${updateNot}"
       }
       else {
           updateNot+=10
           return "Notunuz bu : ${updateNot}"
       }
   }
   
   fun myFunction(x: Int, y: Int) = x + y

   fun ortalama(x:Double,y:Double):String {
       var ortalama = (x + y) / 2
       return "Ortalama : ${ortalama}"
   }		
   
   fun PozitifNegatif(x:Double):String{
       if(x>0.0){
           return " ${x} pozitif "
       }
       else {
           return  "${x} negatif"
       }
   }
   
   fun ucgenAlan (kenarUzunluk:Int,yükseklik:Int):String{
       var alan = (kenarUzunluk * yükseklik) / 2 
       return "Ücgenin alanı ${alan}"
   }
   
   fun sayiNasıl (s1:Int,s2:Int):String{
       if(s1>s2){
           return "İlk sayı büyük"       
       }
       else {
           return "İkinci sayı büyük"
       }
   }
   
   fun ortalamaHesap(vize:Int,final:Int):String{
       var ortalama = (0.3*vize+0.7*final)
       return "Ortalaman : ${ortalama}"
   }
   
   fun daireHesabi (r:Double):String{
       var pi = 3.14
       var cevre = 2*r*pi
       var alan = pi*r*r
       return "Cevre: $cevre  , Alan:$alan "
   }
   
   fun yazdırFor (){
       val sayi = 0
       for (sayi in 0..1000){
           println(sayi)
       }
   }
    
    
    
    





