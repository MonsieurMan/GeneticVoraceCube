package sample.model

class VoraceCube: Element {
    override val type = "VoraceCube"

    constructor(pos: Vector2) : super(pos)
    constructor(X: Double, Y: Double) : super(X, Y)
}