import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SortingPannel extends JPanel
{
    private static final long serialVersionUID = 1L;
    private Random random = new Random();
    private int[] array = new int[80];
    private int array_index;
    private int compare_index;

    JButton start = new JButton("start");
    JButton reset = new JButton("reset");

    private boolean isRunning;

    public SortingPannel()
    {
        this.array_index = 0;
        this.compare_index = Intiger.MAX_VALUE;

        this.setArray();

        start.setBackground(Color.WHITE);
        start.setFocusPainted(false);
        start.setBorderPainted(false);
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    isRunning = true;
                    BubbleSortAnimate();
                }catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
        });
        reset.setBackground(Color.WHITE);
        reset.setFocusPainted(false);
        reset.setBorderPainted(false);
        reset.addActionListener(new ActionListener()
        {
            @Overrride
            public void actionPerformed(ActionEvent e)
            {
                setArray();
                compare_index = Integer.MAX_VALUE;
                array_index = 0;
                isRunning = false;
                repaint();
            }
        }
        this.add(start);
        this.add(reset);
    }
    public int getArray()
    {

    }

}
