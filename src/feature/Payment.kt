package feature

//for payment
class Payment{

    private var payment: Int = -1

    private fun calculate(a: Int, b: Int) = a - b

    private fun inputPayment() {
        try {
            println("-------------------------------------------------")
            print("Masukkan pembayaran : Rp.")
            payment = readln().toInt()
        } catch (e: NumberFormatException){
            println("Input salah, coba lagi")
            inputPayment()
        }
    }

    private fun validatePayment(price: Int): Boolean{
        if (price <= payment){
            printResult(price)
            return true
        } else {
            failedPayment(price)
            return false
        }
    }

    private fun failedPayment(price: Int){
        println("Maaf, pembayaran anda gagal! Silahkan coba lagi")
        println("Uang anda kurang Rp.${calculate(price,payment)}")
    }

    private fun printResult(price: Int){
        println("Terima kasih, anda telah berhasil memesan makanan!")
        println("Kembalian anda Rp.${calculate(payment,price)}")
        println("-------------------------------------------------")
    }

    fun showDonePayment(price: Int){
        do {
            inputPayment()
        } while (!validatePayment(price))
    }

}