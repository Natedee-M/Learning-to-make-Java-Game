package make_java_game;

import javax.swing.JFrame;

public class GameWindow {// extends JFrame
    private JFrame jframe;
    
    public GameWindow(GamePanel gamePanel){
        jframe = new JFrame();
        
        jframe.setSize(800, 800);//set size of frame
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //make the x button can close the program completely
            // (?)How to hide the top bar?
            // (?)How to lock the frame size
            // (?)How to make it full screen
        jframe.add(gamePanel);
        jframe.setVisible(true);
            //Default visible is false so the frame wont appear.
            //It's important to be the last line for avoiding screen bug
    }
}
