object EvaluateExpressions {
  def main(args: Array[String]): Unit = {
    // Declare and initialize variables
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f
    val g = 0

    val A = (b-1) * a + c * (d-1)
    val B = (a+1)
    val C = (-2 * (g - k) + c)
    val D = c+1
    val E = ((c+1) * (a+1))

    println(s"$A")
    println(s"$B")
    println(s"$C")
    println(s"$D")
    println(s"$E")
    
  }
}
