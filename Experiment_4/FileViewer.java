import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("文件查看器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("文件");
        JMenuItem openFileItem = new JMenuItem("打开文件");

        openFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile(textArea);
            }
        });

        fileMenu.add(openFileItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.add(scrollPane, BorderLayout.CENTER);
        // 显示窗口
        frame.setVisible(true);
    }

    private static void openFile(JTextArea textArea) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("hello.txt"), "UTF-8"))) {
            textArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "文件读取失败: " + e.getMessage(), 
            "错误", JOptionPane.ERROR_MESSAGE);
        }
    }
}
