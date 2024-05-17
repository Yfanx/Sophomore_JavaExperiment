//2.	设计一个窗口，内含一个按钮。开始运行时，按钮显示“click me！”字样，
//但按下按钮时，按钮上面的文字变成“click me again”，再按一次，则会变成“click me！”。如此循环。

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonText {
    public static void main(String[] args) {
        JFrame frame = new JFrame("按钮文字切换");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("click me！");

        button.addActionListener(new ActionListener() {
            private boolean clicked = false;

            public void actionPerformed(ActionEvent e) {
                if (clicked) {
                    button.setText("click me！");
                } else {
                    button.setText("click me again");
                }
                clicked = !clicked;
            }
        });

        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
