package source

interface ListFood{
    fun getFoodList(): List<FoodMenu>
}

interface ListDelivery{
    fun getListDelivery(): List<DeliveryMenu>
}

open class FoodDataImpl: ListFood{
    override fun getFoodList(): List<FoodMenu> {
        return listOf(
            FoodMenu("Ayam Bakar", 50000),
            FoodMenu("Ayam Goreng", 40000),
            FoodMenu("Ayam Geprek", 40000),
            FoodMenu("Kulit Ayam Krispi", 15000),
            FoodMenu("Sate Usus Ayam", 5000)
        )
    }
}

open class DeliveryDataImpl: ListDelivery{
    override fun getListDelivery(): List<DeliveryMenu> {
        return listOf(
            DeliveryMenu("Take Away"),
            DeliveryMenu("Delivery")
        )
    }

}

/*open class DataMenu{

    fun listFood() = listOf(
        FoodMenu("Ayam Bakar", 50000),
        FoodMenu("Ayam Goreng", 40000),
        FoodMenu("Ayam Geprek", 40000),
        FoodMenu("Kulit Ayam Krispi", 15000),
        FoodMenu("Sate Usus Ayam", 5000)
    )

    fun listDelivery() = listOf(
        DeliveryMenu("Take Away"),
        DeliveryMenu("Delivery")
    )

}*/