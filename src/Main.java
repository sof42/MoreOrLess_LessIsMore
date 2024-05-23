import Playing.Game;
import Menu.Menu;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("More or Less, Less is More");
        Frame.setSize(720,1080);
        Frame.setDefaultCloseOperation(3);

        JPanel Menu = new Menu();
        Frame.add(Menu);

        Frame.setVisible(true);

    }
}
