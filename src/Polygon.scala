

abstract class Polygon {
  
  def area: Double
  
}

object Polygon extends App{
  
  val rec = new Rectangle(11.0,22.7)
  println(rec.area)
  
  val tri = new Triangle(11.0,22.7)
  println(tri.area)
  
}