import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbies {
    private JButton biografiaButton;

    public hobbies() {

        JFrame hobbiesFrame = new JFrame("Hobbies");
        hobbiesFrame.setContentPane(new hobbies().HOBBIES());
        hobbiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hobbiesFrame.pack();
        hobbiesFrame.setSize(600, 600);
        hobbiesFrame.setLocationRelativeTo(null);
        hobbiesFrame.setVisible(true);

        biografiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openBiografia();
            }
        });
    }

    public JPanel HOBBIES() {
        JPanel hobbies = new JPanel();
        return hobbies;
    }

    private void openBiografia() {
        JFrame biografiaFrame = new JFrame("Biografia");
        biografiaFrame.setContentPane(new biografia().BIOGRAFIA());
        biografiaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        biografiaFrame.pack();
        biografiaFrame.setSize(600, 600);
        biografiaFrame.setLocationRelativeTo(null);
        biografiaFrame.setVisible(true);
    }
}
