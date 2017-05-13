package lv.rtg;

public class Square extends Drawable {

    @Override
    public void draw() {
        for (int i = 0; i < 3; i++) {
            turtle.forward(100);
            turtle.left(90);
        }
    }
}
