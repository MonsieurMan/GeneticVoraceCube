package sample.gui

import javafx.scene.Parent
import javafx.scene.canvas.Canvas
import javafx.scene.paint.Color

import sample.model.Board
import sample.model.Element
import sample.model.Vector2
import tornadofx.Fragment
import tornadofx.hbox

class BoardComponent(size: Vector2, board: Board) : Fragment() {
    val canvas = Canvas(size.X, size.Y)
    val context = canvas.graphicsContext2D

    override val root: Parent = hbox { }

    init {
        this.root.add(canvas)


        draw(board.elements)
    }

    private fun draw(elements: Array<Element>) {
        elements.forEach { element -> drawElement(element) }
    }

    private fun drawElement(element: Element) {
        if (element.type === "CoffeeElementary") {
            drawCoffeeElementary(element)
        } else {
            drawVoraceCube(element)
        }
    }

    private fun drawCoffeeElementary(element: Element) {
        context.fill = Color.BROWN
        context.stroke = Color.BLACK

        context.fillOval(element.pos.X, element.pos.Y, 10.0, 10.0)
    }

    private fun drawVoraceCube(element: Element) {
        context.fill = Color.GREEN
        context.stroke = Color.BLACK

        context.fillRect(element.pos.X, element.pos.Y, 15.0, 15.0)
    }
}