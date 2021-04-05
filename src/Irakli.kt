
fun main () {
    val A = Point()
    A.xCoordinate = 10
    A.yCoordinate = 15

    println(A)

    val B = Point()
    B.xCoordinate = 10
    B.yCoordinate = 15

    println(A.equals(B))
    println(A.yCoordinate)
    A.changingYCoordinate(yCoordinate = -15)
    println(A.yCoordinate)
    println(A)



}

class Point {

    var xCoordinate: Int = 1
    var yCoordinate: Int = 2

    override fun toString(): String {

        return ("($xCoordinate;$yCoordinate)")
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (xCoordinate == other.xCoordinate)
                if(yCoordinate == other.yCoordinate)
                return true
        }
        return false


    }

    fun changingYCoordinate(yCoordinate: Int) {
        this.yCoordinate = yCoordinate
        println("Changing y Coordinate")
    }


}