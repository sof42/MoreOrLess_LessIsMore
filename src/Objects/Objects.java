package Objects;

import Playing.*;

import javax.swing.*;
import java.util.ArrayList;

public class Objects {
    public static JButton SUM = new Sum(Variables.Sum);
    public static JButton TARGET = new Target(Variables.Target);
    public static JButton MOVES = new Moves(Variables.Moves);
    public static JButton MATRIX[][] = new MyButton[Variables.m][Variables.n];
    public static JButton EXIT = new ExitSaveButton();

    public static JTextField ROWS_T = new JTextField(""+Variables.m);

    public static  JTextField COLUMNS_T = new JTextField(""+Variables.n);

    public static ArrayList<MyOperationButton> Operations = new ArrayList<>(Variables.Moves);

    public static EastPanel OPERATION_PANEL = new EastPanel();

}
