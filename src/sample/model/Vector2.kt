package sample.model

data class Vector2(val X: Double, val Y: Double) {
    fun distanceTo(other: Vector2): Double {
        return Math.sqrt(Math.pow(X - other.X, 2.0) + Math.pow(Y - other.Y, 2.0))
    }
}