package pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballGUI extends JFrame
{
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel result;
    private JLabel lastScorer;
    private JLabel winner;

    public FootballGUI()
    {
        setTitle("Football Match");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        result = new JLabel("Result: 0 X 0");
        lastScorer = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                milanScore++;
                updateLabels(lastScorer);
            }
        });

        madridButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                madridScore++;
                updateLabels(lastScorer);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(result);
        panel.add(lastScorer);
        panel.add(winner);

        add(panel);

        setVisible(true);
    }

    private void updateLabels(JLabel lastScorer)
    {
        result.setText("Result: " + milanScore + " X " + madridScore);
        lastScorer.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore)
        {
            winner.setText("Winner: AC Milan");
        } else if (madridScore > milanScore)
        {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new FootballGUI();
            }
        });
    }
}