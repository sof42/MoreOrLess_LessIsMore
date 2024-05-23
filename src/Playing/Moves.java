package Playing;

import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class Moves extends JButton {
    int moves;
    public Moves(int moves){
        super(Integer.toString(moves));
        this.moves=moves;
        this.setBackground(new Color(202, 164, 210));
        this.setText("Moves: " + Variables.Moves);
        Moves();
    }
    public void Moves(){
    }
}
