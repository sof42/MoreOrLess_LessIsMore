package Menu;

import Objects.Objects;
import Objects.Variables;
import Playing.Game;
import Playing.Moves;
import Playing.Target;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class SettingsPanel extends JPanel {
    public SettingsPanel(){
        Draw();
    }

    public void Draw(){
        this.setBackground(new Color(87, 141, 178));
        JPanel UP = new JPanel();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        UP.setLayout(new BoxLayout(UP, BoxLayout.Y_AXIS));
        JButton MOVES_T = new JButton("Moves: ");
        JButton TARGET_T = new JButton("Target: ");
        JTextField MOVES = new JTextField(""+ Variables.Moves);
        JTextField TARGET = new JTextField(""+ Variables.Target);
        JButton COLUMNS = new JButton("Columns: ");
             // JTextField COLUMNS_T = new JTextField(""+Variables.n);
        JButton ROWS = new JButton("Rows: ");
             // JTextField ROWS_T = new JTextField(""+Variables.m);
        JButton START_GAME = new StartGameButton();
        JPanel Difficulty = new JPanel();
        Difficulty.setLayout(new FlowLayout());
        JButton DIFFICULTY = new JButton("DIFFICULTY: ");
        JRadioButton EASY = new JRadioButton("Easy");
        JRadioButton MEDIUM = new JRadioButton("Medium");
        JRadioButton HARD = new JRadioButton("Hard");
        ButtonGroup editableGroup = new ButtonGroup();
        editableGroup.add(EASY);
        editableGroup.add(MEDIUM);
        editableGroup.add(HARD);

        UP.add(MOVES_T);
        UP.add(MOVES);
        UP.add(TARGET_T);
        UP.add(TARGET);

        UP.add(COLUMNS);
        UP.add(Objects.COLUMNS_T);

        UP.add(ROWS);
        UP.add(Objects.ROWS_T);
        Difficulty.add(START_GAME);

        Difficulty.add(DIFFICULTY);
        Difficulty.add(EASY);
        Difficulty.add(MEDIUM);
        Difficulty.add(HARD);
        this.add(UP);
        this.add(Difficulty);

        //ACTION LISTENERS
        MOVES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.Moves=Integer.parseInt(MOVES.getText());
                Objects.MOVES.setText("Moves: " + Variables.Moves);
            }
        });
        TARGET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.Target=Integer.parseInt(TARGET.getText());
                Objects.TARGET.setText("Target: " + Variables.Target);
            }
        });
        Objects.COLUMNS_T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.n=Integer.parseInt(Objects.COLUMNS_T.getText());
            }
        });
        Objects.ROWS_T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.m=Integer.parseInt(Objects.ROWS_T.getText());
            }
        });

        EASY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.Target=150;
                Variables.Moves=40;
                Objects.TARGET.setText("Target: " + Variables.Target);
                Objects.MOVES.setText("Moves: " + Variables.Moves);
                MOVES.setText(""+Variables.Moves);
                TARGET.setText(""+Variables.Target);

            }
        });
        MEDIUM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.Target=200;
                Variables.Moves=30;
                Objects.TARGET.setText("Target: " + Variables.Target);
                Objects.MOVES.setText("Moves: " + Variables.Moves);
                MOVES.setText(""+Variables.Moves);
                TARGET.setText(""+Variables.Target);

            }
        });
        HARD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Variables.Target=300;
                Variables.Moves=20;
                Objects.TARGET.setText("Target: " + Variables.Target);
                Objects.MOVES.setText("Moves: " + Variables.Moves);
                MOVES.setText(""+Variables.Moves);
                TARGET.setText(""+Variables.Target);

            }
        });
    }

}
