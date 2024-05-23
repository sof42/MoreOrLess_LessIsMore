package Playing;

import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class Sum extends JButton {
    int sum;
    public Sum(int sum){
     super(Integer.toString(sum));
     this.sum=sum;
     this.setBackground(new Color(202, 164, 210));
     sum();
    }
    public void sum(){
    }
}
