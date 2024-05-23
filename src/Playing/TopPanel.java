package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {
   public TopPanel(){
       TopPanel();
   }
   public void TopPanel(){
       this.setLayout(new BorderLayout());
       this.setBackground(new Color(200,100,140));
       this.add(Objects.TARGET, BorderLayout.CENTER);
       this.add(Objects.MOVES, BorderLayout.EAST);
       this.add(Objects.EXIT, BorderLayout.WEST);
   }
}
