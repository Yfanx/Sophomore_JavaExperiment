import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        // 创建主窗口
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // 创建文本框
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JTextField resultField = new JTextField(20);
        resultField.setEditable(false); // 结果文本框只读

        // 创建按钮
        JButton addButton = new JButton("加");
        JButton subButton = new JButton("减");
        JButton mulButton = new JButton("乘");
        JButton divButton = new JButton("除");

        // 添加按钮的动作监听器
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(String.valueOf(result));
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultField.setText(String.valueOf(result));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultField.setText(String.valueOf(result));
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } else {
                    resultField.setText("除数不能为0");
                }
            }
        });

        // 布局组件
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("数字1:"), gbc);

        gbc.gridx = 1;
        frame.add(num1Field, gbc);

        gbc.gridx = 2;
        frame.add(new JLabel("数字2:"), gbc);

        gbc.gridx = 3;
        frame.add(num2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("结果:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        frame.add(resultField, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(subButton, gbc);

        gbc.gridx = 2;
        frame.add(mulButton, gbc);

        gbc.gridx = 3;
        frame.add(divButton, gbc);

        // 显示窗口
        frame.setVisible(true);
    }
}
