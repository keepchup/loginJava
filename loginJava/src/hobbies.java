import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbies {
    private JButton biografiaButton;
    private JPanel hobbies;

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
                hobbiesFrame.setVisible(false);
                new biografia();
            }
        });
    }

    public JPanel HOBBIES() {
        return hobbies;
    }
}
