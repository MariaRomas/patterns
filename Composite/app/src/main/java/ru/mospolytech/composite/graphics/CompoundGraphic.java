package ru.mospolytech.composite.graphics;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundGraphic extends BaseGraphic {
    protected List<Graphic> children = new ArrayList<>();

    public CompoundGraphic(Graphic... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Graphic component) {
        children.add(component);
    }

    public void add(Graphic... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    public void remove(Graphic... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
    return  x;
    }

    @Override
    public int getY() {

        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;

        return maxWidth;
    }

    @Override
    public int getLength() {
        int maxLength = 0;

        return maxLength;
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }


    @Override
    public void unSelect() {
        super.unSelect();
        for (Graphic child : children) {
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) {

        return false;
    }

    @Override
    public void paint(Graphics graphics) {

    }
}