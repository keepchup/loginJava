import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login {
    private JPanel LOGIN;
    private JTextField user;
    private JTextField password;
    private JButton loginButton;
    private JLabel coment;

    public Container LOGIN() {
        return LOGIN;
    }

    public login() {
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(user.getText());
            }
        });
        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText());
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getText().equals("admin") && password.getText().equals("admin")) {
                    coment.setText("Conectado");
                    JFrame login = new JFrame();
                    login.setVisible(false);
                    new biografia();
                } else {
                    coment.setText("Usuario o contraseña incorrecto");
                }
            }
        });
    }

    private static void setVisible(boolean b) {
    }
}

