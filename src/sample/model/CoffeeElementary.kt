package sample.model

class CoffeeElementary: Element {
    override val type = "CoffeeElementary"

    constructor(pos: Vector2): super(pos)
    constructor(X: Double, Y: Double): super(X, Y)
}