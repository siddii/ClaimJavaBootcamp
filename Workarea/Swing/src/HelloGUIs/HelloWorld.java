import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by siddique on 7/13/15.
 */
public class HelloWorld {


    private static int clickCount = 0;
    private static JLabel jLabel = new JLabel("Waiting to be clicked...");

    private static class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("I was clicked " + (++clickCount) + " times...");
        }
    }

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My First Swing App");

        JPanel jPanel = new JPanel();

        JButton jButton = new JButton("Click Me!");

        jButton.addActionListener(new MyActionListener());


        jPanel.add(jButton);


        jPanel.add(jLabel);

        jFrame.add(jPanel);

        jFrame.setVisible(true);

        jFrame.setSize(500, 500);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JWindow jWindow = new JWindow(jFrame);

        jWindow.setVisible(true);

        jWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
                System.out.println("e = " + e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("e = " + e);
            }
        });

    }
}
