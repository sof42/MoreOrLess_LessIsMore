package Playing;

import Objects.Objects;
import Objects.Variables;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ExitSaveButton extends JButton implements ActionListener {
    public ExitSaveButton(){
        super("Exit");
        this.setBackground(new Color(202, 164, 210));
        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton Exit_Save = (JButton) e.getSource(); //cast to source
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text", "txt");
        chooser.setFileFilter(filter);
        int ret = chooser.showSaveDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            //print saved path
            System.out.println(file.getAbsolutePath());

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                for (int i = 0; i < Objects.MATRIX.length; i++) {
                    for (int j = 0; j < Objects.MATRIX[i].length; j++) {
                        writer.write("" + Objects.MATRIX[i][j].getText());
                    }
                    writer.write("N");
                }
                writer.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
