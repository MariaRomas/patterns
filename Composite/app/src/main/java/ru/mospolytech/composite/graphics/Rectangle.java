package ru.mospolytech.composite.graphics;

import android.graphics.Color;

public class Rectangle extends BaseGraphic {
    public int width;
    public int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLength() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
    }
    }