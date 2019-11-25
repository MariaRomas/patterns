package ru.mospolytech.composite.editor;

import android.graphics.Canvas;

import ru.mospolytech.composite.graphics.CompoundGraphic;
import ru.mospolytech.composite.graphics.Graphic;

public class Editor {
    private EditorCanvas canvas;
    private CompoundGraphic allGraphics = new CompoundGraphic();

    public Editor() {
        canvas = new EditorCanvas();
    }

    public void loadGraphics(Graphic... graphics) {

    }

    private class EditorCanvas extends Canvas {

        private static final int PADDING = 10;

        EditorCanvas() {

        }

        void createFrame() {

        }

        public int getWidth() {
            return allGraphics;
        }

        public int getLength() {
            return allGraphics;
        }

        void refresh() {

        }

        public void paint(Graphics graphics) {
            allGraphics.paint(graphics);
        }
    }
}
