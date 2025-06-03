fun main() {
    val kotlin = "🙂"
    println(kotlin)

    val benimListem = arrayListOf(1,2,3,4,5,6,7,8,9,10)

    // Liste elemanlarını doğrudan yazdırma (map gereksizdi)
    benimListem.forEach { println(it) }

    // Karesi hesaplanan elemanlar
    benimListem.map { it * it }.forEach { println(it) }

    // Küpü hesaplanan elemanlar
    benimListem.map { it * it * it }.forEach { println(it) }

    // 2'ye göre mod alma
    benimListem.map { it % 2 }.forEach { println(it) }

    // 5'ten küçük sayıları filtreleme
    benimListem.filter { it < 5 }.forEach { println(it) }

    // 5 ile 10 arasındaki sayıları filtreleme
    benimListem.filter { it > 5 && it < 10 }.forEach { println(it) }

    // Oyuncular
    val player1 = Player("as", 50, 25)
    val player2 = Player("asasa", 100, 20)
    
    println(player1.playerTalk())

    val players = arrayListOf(player1, player2)

    // Boyu 60'tan büyük ve ismi "asasa" olan oyuncuları filtreleme
    val yirmi = players.filter { it.playerHeight > 60 && it.playerName == "asasa" }
    yirmi.forEach {
        println(it.playerName)
    }
    
    var benimInteger : Int? = null 
    benimInteger = 5 
    benimInteger?.let{
        println(it)
    }
    
}

class Player(val playerName: String, val playerHeight: Int, val playerAge: Int) {
    fun playerTalk(): String {
        return "$playerName: $playerAge"
    }
}
