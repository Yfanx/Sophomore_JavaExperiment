import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCopyApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("文本复制器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);

        JButton copyButton = new JButton("复制");

        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                textField2.setText(text);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("文本框1:"), gbc);

        gbc.gridx = 1;
        frame.add(textField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("文本框2:"), gbc);

        gbc.gridx = 1;
        frame.add(textField2, gbc);

        gbc.gridy = 2;
        frame.add(copyButton, gbc);

        frame.setVisible(true);
    }
}
