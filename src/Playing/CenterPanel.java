package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        CenterPanel();
    }
    public void CenterPanel(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(200,100,140));
        this.add(Objects.OPERATION_PANEL,BorderLayout.EAST);
        this.add(new Grid(this), BorderLayout.CENTER);
    }
}
