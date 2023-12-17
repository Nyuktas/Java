package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends JFrame
{

    public Panel()
    {
        super("Граничный макет");

        JPanel centerPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel northPanel = new JPanel();
        JPanel eastPanel = new JPanel();

        setLayout(new BorderLayout());

        centerPanel.addMouseListener(createMouseListener("Добро пожаловать в Эр-Рияд"));
        westPanel.addMouseListener(createMouseListener("Добро пожаловать в Джидда"));
        southPanel.addMouseListener(createMouseListener("Добро пожаловать в Абха"));
        northPanel.addMouseListener(createMouseListener("Добро пожаловать в Хаиль"));
        eastPanel.addMouseListener(createMouseListener("Добро пожаловать в Дахран"));

        centerPanel.setBackground(Color.CYAN);
        westPanel.setBackground(Color.GREEN);
        southPanel.setBackground(Color.YELLOW);
        northPanel.setBackground(Color.MAGENTA);
        eastPanel.setBackground(Color.ORANGE);

        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    private MouseAdapter createMouseListener(String message)
    {
        return new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, message);
            }
        };
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Panel::new);
    }
}