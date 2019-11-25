package ru.mospolytech.command.menu;

public abstract class Button {
    public Editor editor;
    private String backup;

    Button(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
