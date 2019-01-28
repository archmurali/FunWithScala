

object PartialFunction extends App {
  
  //def add(x:Int) = (y:Int) => x+y
  def add(x:Int)(y:Int) = x + y
  
  val add5 = add(5)(5)
  

  println(add5)
  
  val sum = add(50)_
  println(sum(50))
  
}