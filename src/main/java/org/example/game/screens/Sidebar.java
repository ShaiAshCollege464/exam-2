package org.example.game.screens;


import org.example.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Sidebar extends JPanel {
    private EditableContent editableContent;

    public Sidebar(int x, int y, int width, int height, EditableContent editableContent) {
        this.editableContent = editableContent;
        this.setBounds(x, y, width, height);
        List<JButton> buttons = List.of(
                createButton("Speed up player", editableContent::acceleratePlayer),
                createButton("Freeze the balls", editableContent::setFreezeButtonClicked),
                createButton("Hide random ball", editableContent::hideBall)
        );
        for(JButton button : buttons) {
            this.add(button);
        }
        this.setLayout(new Gridlayout(buttons.size(), 1));
        this.setBackground(Color.BLUE);
    }

    private JButton createButton(String text, Runnable action) {
        JButton button = new JButton(text);
        button.addActionListener((event) -> {
            action.run();
            Utils.sleep(100);
            editableContent.requestFocusInWindow();
        });
        return button;
    }
}
