package ru.mospolytech.composite.graphics;

import android.graphics.Color;

public class Circle extends BaseGraphic {
    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getLength() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {

    }
}