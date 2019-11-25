package ru.mospolytech.command.menu;

public class CopyButton extends Button {
    public CopyButton(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
