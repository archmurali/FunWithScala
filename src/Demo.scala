


	
// Scala - Reduce, fold or scan (Left/Right)
//reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
object Demo {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val lst2 = List("A", "B", "C");
  val x = 20
  
  
  
	def main(args: Array[String]) {
    
//    
//  val exp = if(x == 20) "x==20" else "x!=20"
//  println(exp)
//    
//   var x1 = 0 
//  
//  do{    
//    println("x = "+ x1)
//    x1 += 1
//  } while( x1 < 10)
    
    
   // for( i <- 0 to 3){ println(i); }
    //for( i <- 1.until(4)){ println(i); }
    
//    
//    for(i <- 1 to 3; j<- 1 to 3){
//      println(i+ ", "+j)
//      }
    
    val li = List(0,2,3,4,5,6,63,45,56)
    for(i <- li; if(i/2 != 0)) {println(i)} 
    
    
    val result = for{ i <- li; if(i <40 )} yield {
      
      i * 2
    }
    
    println("result :" +result)
    
    //match expression
    val age =  100
    val resultofmatch = age match {
      
      case(20 ) => "wrong"
      case(25) => "right"
      case _ => "default"
    }
    
    println(resultofmatch)
    
    ///Taking values from user
    /*val input = scala.io.StdIn.readInt()
    println(input)  */  
    
    
    //Func with just = syntax
    def multiply(x:Int,y:Int) = x * y
    println(multiply(10,20))
    
    
    //Function call in a differnet way
    object FindSquare{
       def square(x:Int) = x * x  
    
    }
   
    println(FindSquare.square(5))
    println(FindSquare square 5)
    
    

      
      
      val tup = new Tuple3(1,34,"archana")
      tup.productIterator.foreach{x => println(x)}
    
      
       
    
    
    
    
    
    
    
    
    
    
//	  println(lst.reduceLeft(_ + _));
//	  println(lst2.reduceLeft(_ + _));
//	  println(lst.reduceLeft((x,y) => {println(x + " , "+ y); x+y;}));
	  
	 // println(lst.reduceLeft(_ - _));
  //println(lst.reduceRight(_ - _));
 // println(lst.reduceRight((x,y) => {println(x + " , "+ y); x-y;}));
//	  
//	  
//	  println(lst.foldLeft(100)(_ + _));
//	  println(lst2.foldLeft("z")(_ + _));
//	  
//	  
//	  println(lst.scanLeft(100)(_ + _));
//	  println(lst2.scanLeft("z")(_ + _));
 
	}
}
