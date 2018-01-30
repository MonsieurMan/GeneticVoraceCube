package sample

import sample.model.*

class BoardGenerator(val width: Double, val height: Double, val coffeeElementary: Int, val voraceCube: Int) {
    var elements: ArrayList<Element> = ArrayList(coffeeElementary + voraceCube)

    fun generateBoard(): Board {
        val elements: Array<Element> = Array(coffeeElementary + voraceCube, { i ->
            if (i < coffeeElementary)
                CoffeeElementary(getRandomPos())
            else
                VoraceCube(getRandomPos())
        })

        return Board(Vector2(width, height), elements)
    }

    fun getRandomPos(): Vector2 {
        var pos: Vector2

        do {
            val x = Math.random() * width
            val y = Math.random() * height

            pos = Vector2(x,  y)
        } while (elements.find { element -> positionCollides(element.pos, pos, 20.0) } != null)

        return pos
    }

    fun positionCollides(pos1: Vector2, pos2: Vector2, distance: Double): Boolean {
        return pos1.distanceTo(pos2) > distance;
    }
}