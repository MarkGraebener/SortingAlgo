import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame
{
    private static final long serialVersionUID = 1L;

    public Frame()
    {
        this.setTitle("Bubble Sort");
        this.getContentPane().setPreferredSize(new Dimension(1200, 600));
        this.getContentPane().add(panel);
        this.pack();
        this.setVisable(true);
        this.setDefaultCloseOpertion(EXIT_ON_CLOSE);

    }
    public SortingPanel getPanel()
    {
        return this.panel;
    }
}