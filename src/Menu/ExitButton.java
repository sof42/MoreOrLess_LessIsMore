package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {
        public ExitButton(){
            super("EXIT");
            this.setBackground(new Color(202, 164, 210));
            this.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
