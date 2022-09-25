package make_java_game;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    public GamePanel(){}//let the mody empty
    
    public void paintComponent(Graphics g){
        /*
        - we are overriding this method from super of JPanel
        - we never call this method directly but it gets called when we start the game (press the play button)
        - JFrame is like a frame of picture and JPanel is the paint in that frame.
        - Graphics, the one in parameter, is like an artist and JPanel is a person who tells the artist what to draw
        ! There's a way to draw without using JPanel
        */
        
        super.paintComponent(g);
            //we call this method of super to let them prepare the screen before we draw our stuff
        
        g.drawRect(100,100,200,50);//(x-position, y-position, Width, Height)
        g.fillRect(100, 10, 200, 50);//x and y-position unit is NOT the same unit as width and height
    }
}
