package feature

import source.FoodDataImpl
import source.FoodMenu

//for list menu
class ListFood : FoodDataImpl() {

    private val listFood = getFoodList()
    private var chooseMenu: Int = -1

    private lateinit var selectedMenu: FoodMenu

    private fun showHeaderFood() {
        println("=================================================")
        println("                LIST MENU MAKANAN                ")
        println("=================================================")
        listDataFood()
        println("=================================================")
    }

    private fun listDataFood() {
        listFood.forEachIndexed { index, data ->
            println("${index + 1}. ${data.name} : ${data.price}")
        }
    }

    private fun inputChooseFood() {
        try {
            print("Pilih menu makanan, mau pesan apa? : ")
            this.chooseMenu = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Salah input")
            inputChooseFood()
        }
    }

    private fun chooseMenu(chooseMenu: Int): Boolean {
        if (chooseMenu in 1..listFood.size) {
            selectedMenu = listFood.elementAt(chooseMenu - 1)
            return true
        } else {
            println("Ulangi lagi, kelebihan inputannya. Tolong input angka dari 1 sampai ${listFood.size}")
            return false
        }
    }

    private fun printResult() {
        println("-------------------------------------------------")
        println("Anda telah memilih menu $chooseMenu")
        println("Nama menu : ${selectedMenu.name}")
        println("Harga : Rp.${selectedMenu.price}")
    }

    fun showMenu() {
        showHeaderFood()
        do {
            inputChooseFood()
        } while (!chooseMenu(chooseMenu))
        printResult()

        Payment().showDonePayment(selectedMenu.price)
    }

}
