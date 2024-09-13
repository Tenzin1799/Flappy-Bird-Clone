import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JPanel{
    private int width = 360;
    private int height = 640;
    private Image backgroundImg;

    public FlappyBird(){
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.blue);

        backgroundImg = new ImageIcon(getClass().getResource("flappybirdbg.png")).getImage();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.drawImage(backgroundImg, 0, 0, width, height, null);

    }

}
