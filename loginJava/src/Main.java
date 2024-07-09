import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    JFrame login = new JFrame("LOGIN");
        login.setContentPane(new login().LOGIN());
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setSize(500, 500);
        login.setVisible(true);
}