package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    static final int WINDOW_POS_X = 500;
    static final int WINDOW_POS_Y = 300;
    static final int WINDOW_WIDTH = 500;
    static final int WINDOW_HEIGHT = 555;

    private SettingWindow settingWindow;
    private BattleField battleField;

    public GameWindow() {
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");


        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");
        panel.add(btnNewGame);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);
        btnExit.setBackground(Color.PINK);
        btnNewGame.setBackground(Color.CYAN);

        btnExit.addActionListener(e -> System.exit(0));

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
    }
void startNewGame(int size, int winningLength){
    System.out.println(size+""+winningLength);
}

}


