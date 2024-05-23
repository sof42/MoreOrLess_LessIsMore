package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EastPanel extends JPanel {
    public EastPanel(){
        super();
        Operations();
    }
    public void Operations(){
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(189, 144, 166));
        this.setPreferredSize(new Dimension(50,500));

        for (int i = 0; i < Variables.Operations.size(); i++) {
            Objects.Operations.add(new MyOperationButton(Variables.Operations.get(i)));
            this.add(Objects.Operations.get(i));
           Objects.Operations.get(i).setBackground(new Color(189, 159, 186));
           Objects.Operations.get(i).setForeground(new Color(255, 255, 255));
        }
    }
}
