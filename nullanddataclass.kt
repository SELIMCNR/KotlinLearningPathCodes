fun main() {
    val kotlin = "🙂"
    println(kotlin)

    val yeniClassOne = YeniClass(25)
    println(yeniClassOne.yas)

    lateinit var oldClassOne1: OldClass
    oldClassOne1 = OldClass("İstanbul", "Beykoz", 34, "a mahallesi")
    println("${oldClassOne1.il}, ${oldClassOne1.ilce}, ${oldClassOne1.plaka}, ${oldClassOne1.mahalle}")
  
    val newConsClassOne = NewConsClass("a", "b", 5)
    println("${newConsClassOne.harf1}, ${newConsClassOne.harf2}, ${newConsClassOne.num}")

    val sehir = SehirConsClass("Kahramanmaraş", "Dulkadiroğlu", 46, "Aksu mahallesi")
    println("${sehir.il} ${sehir.ilce} ${sehir.plaka} ${sehir.mahalle}")

    val kullaniciGirdisi = "15"
    val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()
    if(kullaniciGirdisiDouble!=null){
        println(kullaniciGirdisiDouble)
    }
	kullaniciGirdisiDouble?.let{
        println(kullaniciGirdisiDouble/2)
    }
    println(kullaniciGirdisiDouble?.div(2) ?: 10)
    
    
}

data class YeniClass(var yas: Int)
data class OldClass(val il: String, val ilce: String, val plaka: Int, val mahalle: String)
data class NewConsClass(val harf1: String, val harf2: String, val num: Int)
data class SehirConsClass(val il: String, val ilce: String, val plaka: Int, val mahalle: String)