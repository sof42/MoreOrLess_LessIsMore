package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MyButton extends JButton implements ActionListener {
    int x;
    int y;
    int value;
    Grid NewGrid;
    public MyButton(int TEXT, int x, int y, Grid NewGrid){
      super(Integer.toString(TEXT));
      this.x = x;
      this.y = y;
      this.value = TEXT;
      this.NewGrid=NewGrid;
      this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       NewGrid.Update(this);
        for(int i=0; i< Variables.m; i++){
            for(int j=0; j<Variables.n; j++){
                if(this.x==i || this.y==j){
                    Objects.MATRIX[i][j].setEnabled(true);
                    Objects.MATRIX[i][j].setBackground(new Color(0x8FA2EE));
                }
                if(this.x!=i && this.y!=j){
                    Objects.MATRIX[i][j].setEnabled(false);
                    Objects.MATRIX[i][j].setBackground(new Color(197, 127, 156));
                }
            }
        }
       Objects.OPERATION_PANEL = new EastPanel();
        Variables.Operations.remove(0);
        Objects.Operations.remove(0);
        Objects.OPERATION_PANEL.revalidate();
        Objects.OPERATION_PANEL.repaint();

    }
}
