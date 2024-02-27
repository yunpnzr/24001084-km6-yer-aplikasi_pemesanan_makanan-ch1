package feature

import source.DeliveryDataImpl
import java.lang.Thread.sleep

//for show menu and input delivery method
class Delivery: DeliveryDataImpl(){

    private val listDelivery = getListDelivery()
    private var chooseDelivery: Int = -1

    private fun headerDelivery(){
        println("Metode pengiriman Makanan")
        showDataDelivery()
        println("-------------------------------------------------")
    }

    private fun showDataDelivery(){
        listDelivery.forEachIndexed { index, data ->
            println("${index+1}. ${data.name}")
        }
    }

    private fun inputDataDelivery(){
        try {
            print("Input pilihan : ")
            chooseDelivery = readln().toInt()
        } catch (e: NumberFormatException){
            println("Salah input, bukan huruf. Silahkan coba lagi")
            inputDataDelivery()
        }
    }

    private fun chooseDelivery(){
        when(chooseDelivery){
            1 -> takeAwayProcess()
            2 -> deliveryProcess()
            else -> repeat()
        }
    }

    private fun takeAwayProcess(){
        println("Makananmu sedang dimasak (5 detik) .....")
        sleep(5000)
        println("Makananmu sudah siap! Silahkan ambil di resto ya! (5 detik) .....")
        sleep(5000)
        println("Pesanan selesai! (3 detik) ...")
        sleep(3000)
    }

    private fun deliveryProcess(){
        println("Makananmu sedang dimasak (5 detik) .....")
        sleep(5000)
        println("Makananmu sudah siap! Driver segera menuju tempatmu! (5 detik) .....")
        sleep(5000)
        println("Driver sampai! Pesanan selesai! (3 detik) ...")
        sleep(3000)
    }

    private fun repeat(){
        println("Input salah, silahkan coba lagi")
        inputDataDelivery()
    }

    fun showDelivery(){
        headerDelivery()
        inputDataDelivery()
        chooseDelivery()
    }
}