import javax.swing.*;
import java.awt.*;

public class GUI {
    private static JFrame frame;
    public GUI(int width, int height) {
        frame = new JFrame("Photo Editor");
        frame.setLayout(new BorderLayout());

        setSize(width, height);




        initToolbar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void initToolbar() {
        JToolBar tools = new JToolBar("tools");

        JButton brightness = new JButton("Brightness");
        brightness.addActionListener(e -> JOptionPane.showMessageDialog(frame, "brightness clicked"));
        JButton binary = new JButton("Black/White");
        binary.addActionListener(e -> JOptionPane.showMessageDialog(frame, "binary clicked"));
        JButton smooth = new JButton("Smooth");
        smooth.addActionListener(e -> JOptionPane.showMessageDialog(frame, "smooth clicked"));

        tools.add(brightness);
        tools.add(binary);
        tools.add(smooth);

        frame.getContentPane().add(tools, BorderLayout.PAGE_START);
    }
    
    private void initContent() {
        // TODO: Implement
    }

    public void loadImage() {
        // TODO
    }

    public void setSize(int width, int height) {
        frame.setSize(
                width, height
        );
    }
}
