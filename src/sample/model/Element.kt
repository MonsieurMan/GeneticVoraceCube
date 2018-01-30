package sample.model

abstract class Element {
    var pos: Vector2

    constructor(pos: Vector2) {
        this.pos = pos
    }
    constructor(X: Double, Y: Double) {
        this.pos = Vector2(X, Y)
    }

    abstract val type: String
}
