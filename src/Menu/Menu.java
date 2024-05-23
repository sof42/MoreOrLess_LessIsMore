package Menu;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Menu extends JPanel {
    public Menu(){
        Draw();
    }

    public void Draw(){
        JPanel Center = new JPanel();
        Center.setLayout(new BorderLayout());
        this.add(Center, BorderLayout.CENTER);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBackground(new Color(0xDEBECC));
        Center.add(new StartButton(), BorderLayout.NORTH);
        Center.add(new ExitButton(), BorderLayout.SOUTH);
    }
}
