import kotlin.math.pow
import kotlin.math.sqrt

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x1, y4: Double = y1): Double {
    // A(X1, Y1), B(X2, Y2), C(X3, Y3),D(X4=X1, Y4=Y1)
    // Perimeter: Length AB + Length BC + Length CD + Length DA
    val ab = sqrt(((x2 - x1).pow(2)) + ((y2 - y1).pow(2)))
    val bc = sqrt(((x3 - x2).pow(2)) + ((y3 - y2).pow(2)))
    val cd = sqrt(((x4 - x3).pow(2)) + ((y4 - y3).pow(2)))
    val da = sqrt(((x1 - x4).pow(2)) + ((y1 - y4).pow(2)))
    return ab + bc + cd + da
}
