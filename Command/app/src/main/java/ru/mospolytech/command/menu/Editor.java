package ru.mospolytech.command.menu;

import android.net.wifi.p2p.WifiP2pManager;

public class Editor {


    public JTextArea textField;
    public String clipboard;
    public void init() {
      buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        Editor editor = this;
        ctrlC.addActionListener(new WifiP2pManager.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyButton(editor));
            }
        });
        ctrlX.addActionListener(new WifiP2pManager.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutButton(editor));
            }
        });
        ctrlV.addActionListener(new WifiP2pManager.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteButton(editor));
            }
        });
     );
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        content.add(buttons);

    }



}
