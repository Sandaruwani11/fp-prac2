object highprofit{
    def attendees(price: Int): Int = {
        120 + (15 - price) / 5 * 20
    }

    def revenue(price: Int): Int = {
        attendees(price) * price
    }

    def cost(price: Int): Int = {
        500 + attendees(price)
    }

    def profit(price: Int): Int = {
        revenue(price) - cost(price)
    }

    def main(args: Array[String]): Unit = {

        val profit1 = profit(5)
        val profit2 = profit(10)
        val profit3 = profit(15)
        val profit4 = profit(25)
        val profit5 = profit(30)
        val profit6 = profit(35)
        val profit7 = profit(40)

        println(s"profit1 = $profit1")
        println(s"profit2 = $profit2")
        println(s"profit3 = $profit3")
        println(s"profit4 = $profit4")
        println(s"profit5 = $profit5")
        println(s"profit6 = $profit6")
        println(s"profit7 = $profit7")

    }

}