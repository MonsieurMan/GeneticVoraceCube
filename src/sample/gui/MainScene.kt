package sample.gui

import javafx.scene.Parent
import sample.BoardGenerator
import sample.model.*
import tornadofx.View
import tornadofx.hbox

class MainScene : View() {
    override val root: Parent = hbox {

    }

    init {
        val elements: Array<Element> = arrayOf(
                CoffeeElementary(10.0, 10.0),
                VoraceCube(20.0, 10.0)
        )

        val generator = BoardGenerator(1000.0, 1000.0, 30, 5)

        this.root.add(BoardComponent(Vector2(1000.0, 1000.0), generator.generateBoard()))
    }
}