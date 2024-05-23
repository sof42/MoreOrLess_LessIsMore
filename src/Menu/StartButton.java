package Menu;

import Playing.Game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton implements ActionListener {

    public StartButton(){
        super("START");
        this.setBackground(new Color(202, 164, 210));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel SettingPanel = new SettingsPanel();
        Container parent = this.getParent();
        Container root = parent.getParent();
        root.removeAll();
        root.revalidate();
        root.repaint();
        root.add(SettingPanel);
    }
}
