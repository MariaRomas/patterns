package ru.mospolytech.composite.graphics;

public interface Graphic {
        int getX();
        int getY();
        int getWidth();
        int getLength();
        void move(int x, int y);
        void select();
        void unSelect();
        boolean isSelected();
        void paint(Graphics graphics);

}
