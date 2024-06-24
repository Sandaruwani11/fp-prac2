object Evaluate {
  def main(args: Array[String]): Unit = {
    
    var i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'

    val result1 = k + 12 * m
    val result2 = m / j
    val result3 = n % j
    val result4 = (m / j) * j
    val result5 = f + 10*5 + g
    i += 1
    val result6 = i * n

    println(s"a) k + 12 * m = $result1")
    println(s"b) m / j = $result2")
    println(s"c) n % j = $result3")
    println(s"d) m / j * j = $result4")
    println(s"e) f + 10 * 5 + g = $result5")
    println(s"f) ++i * n = $result6")
  }

}
