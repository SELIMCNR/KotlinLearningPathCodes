fun main() {
    val kotlin = "🙂"
    println(kotlin)
   
    var alex = futbolcu("alex",30,"Brezilya")
    println(alex.isim)
    alex.futbolcuSoyle()
    alex.Ayakkabırengi ="mavi"
    
    var messi = futbolcu("Messi",34,"Arjantin")
    println(messi.isim)
    messi.futbolcuSoyle()
    messi. Ayakkabırengi = "sarı"
    //messi.forma="a"
    messi.kolUzunlukSet("uzun")
    println(messi.forma)

      var otomobil1 = otomobil("a","a")
    otomobil1.ad="b"
    println(otomobil1.ad)
  otomobil1.otomoBilİsim("a")
  var araçlar1 = araçlar("b","s")
  println(araçlar1.ad)
}

class araçlar( ad:String, tür:String) : otomobil(ad,tür){
    
}

open class otomobil (var ad:String, var tür:String){
    
    fun otomoBilİsim(ad:String){
        this.ad = ad
        println(ad)
    }
}

class futbolcu (var isim:String,var yas:Int,var ulke:String){
    
    fun futbolcuSoyle(){
        println("Futbolcu adı ${this.isim} yaşı : ${this.yas},ulkesi : ${this.ulke}")
    }
    
    var Ayakkabırengi =""
    //encapsulation
    var forma = "good"
    	private set 
    	public get
    private var kolUzunluk = ""
    fun kolUzunlukSet(yenikolUzunluk:String){
        this.kolUzunluk = yenikolUzunluk
    }
    fun formaYazdir(){
        println(this.forma)
    }
    
    
    
    init{
        println("Otomatik çalışacak fonksiyon.")
    }
}
