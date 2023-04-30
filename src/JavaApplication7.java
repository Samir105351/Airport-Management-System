import javax.swing.*;

public class JavaApplication7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new NewJFrame().getpanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1010, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    }
