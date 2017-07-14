package lv.rtg;

import cheloniidae.RealtimeTurtle;

public class Main {

    private static RealtimeTurtle turtle = new RealtimeTurtle();

    public static void main(String[] args) {
        turtle.color(0, 0, 0);
        turtle.size(2);

        turtle.forward(100);
        turtle.right(90);
        turtle.forward(100);
    }

    private static void cycleWhile() {
        int side = 0;
        while (side < 4) {
            turtle.forward(100);
            turtle.right(90);
            side = side + 1;
        }
    }

    private static void cycleFor() {
        for (int i = 0; i < 4; i++) {
            turtle.forward(100);
            turtle.right(90);
        }
    }

    private static void cycleWithCondition() {
        turtle.color(0, 255, 0);
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                turtle.color(0, 0, 255);
            }

            turtle.forward(100);
            turtle.right(90);
        }
    }
}
