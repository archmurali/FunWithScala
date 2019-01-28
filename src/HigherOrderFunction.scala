

object HigherOrderFunction {
  
 def Math(x:Int, y:Int,f:(Double,Double)=> Double):Double = f(x,y)
 def Math2(x:Int,y:Int,z:Int,f:(Double,Double)=> Double):Double = f(f(x,y),z)
}

object Calculator extends App{
  
  println("Enter the value of x:")
  val x = scala.io.StdIn.readInt()
  println("Enter the value of y: ")
  val y = scala.io.StdIn.readInt()
  println("What do you want to do? Enter add or subtract or multiply or divide: ")
  val operation = scala.io.StdIn.readLine()
  
 val result:Double = operation match{
    case "add" => HigherOrderFunction.Math(x, y, (x,y)=>x + y)
    case "subtract" if(x>y) => HigherOrderFunction.Math(x, y, (x,y)=>x - y)
    case "subtract" if(x<y) => HigherOrderFunction.Math(x, y, (x,y)=>y - x)
    case "multiply" => HigherOrderFunction.Math(x, y, (x,y)=>x * y)
    case "divide" if(y !=0)  => HigherOrderFunction.Math(x, y, (x,y)=>x/y)
    case _ => 0.0
  }
  
 println(result)
 println(HigherOrderFunction.Math2(x,y, 30, (x,y)=>x+y) )
 println(HigherOrderFunction.Math2(x,y, 30, _ max _))
 
     
     
}


