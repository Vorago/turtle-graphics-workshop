package lv.rtg;

import cheloniidae.RealtimeTurtle;

public abstract class Drawable {
    RealtimeTurtle turtle = new RealtimeTurtle();

    Drawable() {
        turtle.color(0, 0, 0);
    }

    public abstract void draw();
}
