package Playing;

import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class Target extends JButton {
    int target;
    public Target(int target){
        super(Integer.toString(target));
        this.target=target;
        this.setBackground(new Color(202, 164, 210));
        this.setText("Target: " + Variables.Target);
        target();
    }
    public void target(){
    }
}
