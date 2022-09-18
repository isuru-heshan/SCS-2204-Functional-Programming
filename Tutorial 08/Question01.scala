import scala.math

object Question01{
    case class Point(a: Int, b: Int){
        def x: Int = a
        def y: Int = b

        def + (x:Point) = Point(a + x.a, b + x.b)
        def move(d: Int) = Point(a + d, b + d)
        def distance(x: Point) = math.sqrt(math.pow(a - x.a, 2) + math.pow(b - x.b, 2))
        def invert()= Point(b, a)
    }
    def main(args: Array[String]): Unit = {

        var p1 = Point(1, 2)
        var p2 = Point(2, 3)
    
        println("Point 1: " + p1)
        println("Point 2: " + p2)

                
        println("\n\nPoint 1 + Point 2: " + (p1 + p2))

        var p3 = p1.move(5)

        println("\nMove Point 1 by 5: " + p3)

        println("\nDistance between Point 1 and Point 2: " + p1.distance(p2))

        println("\nInverse of Point 1: " + p1.invert())

    } 
}