package Menu;

import Objects.Objects;
import Objects.Variables;
import Playing.Game;
import Playing.MyButton;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGameButton extends JButton implements ActionListener{
    public StartGameButton(){
        super("START GAME");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Variables.m = Integer.parseInt(Objects.ROWS_T.getText());
        Variables.n = Integer.parseInt(Objects.COLUMNS_T.getText());

        Objects.MATRIX = new MyButton[Integer.parseInt(Objects.ROWS_T.getText())][Integer.parseInt(Objects.COLUMNS_T.getText())];
        JPanel Game = new Game();
        Container parent = this.getParent();
        Container root = parent.getParent();
        root.removeAll();
        root.revalidate();
        root.repaint();
        root.add(Game);
    }
}

