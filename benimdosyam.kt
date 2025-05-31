package com.example.kotlinappone

var sayac = 0
fun main (){
    println("hello")
    println("merhaba android")
    birinciFonksiyon()
    birinciFonksiyon()
    ikinciFonksiyon()

    cikarma(5,4) // *5 olmaz veri tipi unit
    toplama(5,4) *5 //olur veri tipi int ama işlemi yapmaz

    val sonuc = cikarma(4,1)
    val digerSonuc= toplama(4,9)
    println(sonuc)
    println(digerSonuc)
}

fun birinciFonksiyon(){
    println("birinci fonksiyon çalıştırıldı bu kadar ${sayac++}")
}

fun ikinciFonksiyon(){
    println("ikinci fonksiyon çalıştırıld bu kadar ${sayac++}")
}
fun cikarma (x:Int,y:Int){
    var sonuc = x-y
    println("Cikarma sonucu : $sonuc")
}

fun toplama (x:Int,y:Int):Int{
    var sonuc = x+y
    println("Toplama sonucu : $sonuc")
    return sonuc
}