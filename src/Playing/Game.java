package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    public Game(){
        Game();
    }
    public void Game(){
        this.setLayout(new BorderLayout());
        this.setBackground(Color.RED);
        this.add(new TopPanel(), BorderLayout.NORTH);
        this.add(Objects.SUM, BorderLayout.SOUTH);
        this.add(new CenterPanel(), BorderLayout.CENTER);
    }
}
