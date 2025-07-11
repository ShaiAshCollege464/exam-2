package org.example.game;

import org.example.game.screens.Board;
import org.example.game.screens.EditableContent;
import org.example.game.screens.Sidebar;

import javax.swing.*;

import static org.example.utils.Definitions.*;

public class Window extends JFrame {
    public Window() {
        this.setLayout(null);
        this.setTitle("Exam");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        EditableContent content = new EditableContent(WINDOW_WIDTH / SIDEBAR_SEGMENT, WINDOW_HEIGHT / BOARD_PORTION, ((SIDEBAR_SEGMENT - 1) * WINDOW_WIDTH) / SIDEBAR_SEGMENT, WINDOW_HEIGHT * (BOARD_PORTION - 1) / BOARD_PORTION);
        Board board = new Board(WINDOW_WIDTH / SIDEBAR_SEGMENT, 0, ((SIDEBAR_SEGMENT - 1) * WINDOW_WIDTH) / SIDEBAR_SEGMENT, WINDOW_HEIGHT / BOARD_PORTION, content);
        this.add(board);
        content.setBoard(board);
        this.add(new Sidebar(0, 0, WINDOW_WIDTH / SIDEBAR_SEGMENT, WINDOW_HEIGHT, content));
        this.setVisible(true);
        this.add(content);
    }

}
