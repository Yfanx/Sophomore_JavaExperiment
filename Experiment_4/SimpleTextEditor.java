import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTextEditor {
    private JFrame frame;
    private JTextArea textArea;
    private JCheckBoxMenuItem readOnlyItem;
    private JCheckBoxMenuItem boldItem;
    private JCheckBoxMenuItem italicItem;

    public SimpleTextEditor() {
        frame = new JFrame("文本编辑器");
        textArea = new JTextArea();
        textArea.setFont(new Font("宋体", Font.PLAIN, 12));

        createMenuBar();

        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu settingsMenu = new JMenu("设置");
        JMenu fontMenu = new JMenu("字体");
        JMenu styleMenu = new JMenu("风格");

        // 字体菜单项
        JRadioButtonMenuItem simSunItem = new JRadioButtonMenuItem("宋体");
        JRadioButtonMenuItem kaiTiItem = new JRadioButtonMenuItem("楷体");
        JRadioButtonMenuItem simHeiItem = new JRadioButtonMenuItem("黑体");

        ButtonGroup fontGroup = new ButtonGroup();
        fontGroup.add(simSunItem);
        fontGroup.add(kaiTiItem);
        fontGroup.add(simHeiItem);

        fontMenu.add(simSunItem);
        fontMenu.add(kaiTiItem);
        fontMenu.add(simHeiItem);

        simSunItem.addActionListener(e -> textArea.setFont(new Font("宋体", Font.PLAIN, 12)));
        kaiTiItem.addActionListener(e -> textArea.setFont(new Font("楷体", Font.PLAIN, 12)));
        simHeiItem.addActionListener(e -> textArea.setFont(new Font("黑体", Font.PLAIN, 12)));

        // 风格菜单项
        boldItem = new JCheckBoxMenuItem("粗体");
        italicItem = new JCheckBoxMenuItem("斜体");

        styleMenu.add(boldItem);
        styleMenu.add(italicItem);

        boldItem.addActionListener(e -> updateTextStyle());
        italicItem.addActionListener(e -> updateTextStyle());

        // 只读菜单项
        readOnlyItem = new JCheckBoxMenuItem("只读");
        readOnlyItem.addActionListener(e -> textArea.setEditable(!readOnlyItem.isSelected()));

        settingsMenu.add(fontMenu);
        settingsMenu.add(styleMenu);
        settingsMenu.add(readOnlyItem);

        JMenu operationsMenu = new JMenu("操作");
        JMenuItem exitItem = new JMenuItem("退出");
        exitItem.addActionListener(e -> System.exit(0));
        operationsMenu.add(exitItem);

        menuBar.add(settingsMenu);
        menuBar.add(operationsMenu);

        frame.setJMenuBar(menuBar);
    }

    private void updateTextStyle() {
        int style = Font.PLAIN;
        if (boldItem.isSelected()) {
            style |= Font.BOLD;
        }
        if (italicItem.isSelected()) {
            style |= Font.ITALIC;
        }
        Font currentFont = textArea.getFont();
        textArea.setFont(new Font(currentFont.getFontName(), style, currentFont.getSize()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleTextEditor::new);
    }
}
