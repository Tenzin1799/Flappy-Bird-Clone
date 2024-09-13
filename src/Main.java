import javax.swing.*;

public class Main {

    public static void main(String [] args){
        JFrame frame = new JFrame("Game Window");
        FlappyBird flappyBird = new FlappyBird();
        int width = 340;
        int height = 620;

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(width, height);
        frame.add(flappyBird);
        frame.pack();
    }
}
