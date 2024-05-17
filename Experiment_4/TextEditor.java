import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor {
    private JFrame frame;
    private JTextPane textPane;
    private JMenuBar menuBar;
    private JMenu settingsMenu, operationsMenu;
    private JMenu fontMenu, styleMenu;
    private JCheckBoxMenuItem readOnlyMenuItem;
    private JRadioButtonMenuItem simSunMenuItem, kaiTiMenuItem, simHeiMenuItem;
    private JCheckBoxMenuItem normalStyleMenuItem, boldStyleMenuItem, italicStyleMenuItem;

    public TextEditor() {
        frame = new JFrame("文本编辑器");
        textPane = new JTextPane();
        menuBar = new JMenuBar();

        createSettingsMenu();
        createOperationsMenu();

        menuBar.add(settingsMenu);
        menuBar.add(operationsMenu);

        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(textPane), BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createSettingsMenu() {
        settingsMenu = new JMenu("设置");
        fontMenu = new JMenu("字体");
        styleMenu = new JMenu("风格");

        ButtonGroup fontGroup = new ButtonGroup();

        simSunMenuItem = new JRadioButtonMenuItem("宋体");
        simSunMenuItem.addActionListener(e -> setFont("SimSun"));
        fontGroup.add(simSunMenuItem);
        fontMenu.add(simSunMenuItem);

        kaiTiMenuItem = new JRadioButtonMenuItem("楷体");
        kaiTiMenuItem.addActionListener(e -> setFont("KaiTi"));
        fontGroup.add(kaiTiMenuItem);
        fontMenu.add(kaiTiMenuItem);

        simHeiMenuItem = new JRadioButtonMenuItem("黑体");
        simHeiMenuItem.addActionListener(e -> setFont("SimHei"));
        fontGroup.add(simHeiMenuItem);
        fontMenu.add(simHeiMenuItem);

        normalStyleMenuItem = new JCheckBoxMenuItem("普通");
        normalStyleMenuItem.addActionListener(e -> setStyle());
        styleMenu.add(normalStyleMenuItem);

        boldStyleMenuItem = new JCheckBoxMenuItem("粗体");
        boldStyleMenuItem.addActionListener(e -> setStyle());
        styleMenu.add(boldStyleMenuItem);

        italicStyleMenuItem = new JCheckBoxMenuItem("斜体");
        italicStyleMenuItem.addActionListener(e -> setStyle());
        styleMenu.add(italicStyleMenuItem);

        readOnlyMenuItem = new JCheckBoxMenuItem("只读");
        readOnlyMenuItem.addActionListener(e -> toggleReadOnly());
        settingsMenu.add(readOnlyMenuItem);

        settingsMenu.add(fontMenu);
        settingsMenu.add(styleMenu);
    }

    private void createOperationsMenu() {
        operationsMenu = new JMenu("操作");
        JMenuItem exitMenuItem = new JMenuItem("退出");
        exitMenuItem.addActionListener(e -> confirmExit());
        operationsMenu.add(exitMenuItem);
    }

    private void setFont(String fontName) {
        Font currentFont = textPane.getFont();
        Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
        textPane.setFont(newFont);
    }

    private void setStyle() {
        int style = Font.PLAIN;
        if (boldStyleMenuItem.isSelected()) {
            style |= Font.BOLD;
        }
        if (italicStyleMenuItem.isSelected()) {
            style |= Font.ITALIC;
        }
        Font currentFont = textPane.getFont();
        Font newFont = new Font(currentFont.getFontName(), style, currentFont.getSize());
        textPane.setFont(newFont);
    }

    private void toggleReadOnly() {
        textPane.setEditable(!readOnlyMenuItem.isSelected());
    }

    private void confirmExit() {
        int response = JOptionPane.showConfirmDialog(frame, "确定要退出吗?", "退出", JOptionPane.OK_CANCEL_OPTION);
        if (response == JOptionPane.OK_OPTION) {
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditor::new);
    }
}
