import feature.Delivery
import feature.ListFood

class Main{

    fun app(){
        //menu
        ListFood().showMenu()

        //payment in class ListFood()

        //delivery
        Delivery().showDelivery()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            Main().app()
        }
    }

}