package com.example.kotlinappone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var sayac = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("onCreate çalıştırıldı")

        birinciFonksiyon()
        ikinciFonksiyon()
        cikarma(10,15) // *5 veri tipi unit işleme izin vermez
        toplama(15,35) *5 // veri tipi int işleme izin verir
        val sonuc = cikarma(5,8) //unit veri tipinde return yok
        val digerSonuc = toplama(15,4)

        println(sonuc)
        println(digerSonuc)
    }
    fun birinciFonksiyon(){
        sayac++
        println("birinci fonksiyon çalıştırıldı : ${sayac}")
    }
    fun ikinciFonksiyon(){
        sayac = sayac *2
        println("ikinci fonksiyon çalıştırıldı")
    }

    //girdi almak
    fun cikarma(a:Int,b:Int){
        println("Çıkarma sonucu : ${a-b}")
    }

    // çıktı vermek -> döndürmek ,return
    fun toplama(a:Int,b:Int):Int {
            println("Toplama sonucu : ${a+b}")
            return a+b
    }

}