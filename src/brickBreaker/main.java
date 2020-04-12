package brickBreaker;

import javax.swing.JFrame;

/**
 *
 * @author eduar
 */
public class main {
    
    public static void main(String args[]){
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        
        obj.setBounds(10, 10, 700, 600); // add backround size          //vv
        obj.setTitle("Breakout Ball");                                  //vv
        obj.setResizable(false);                                        //vv
        obj.setVisible(true);                                           //vv
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             //vv
        obj.add(gamePlay);  //add gameplay object into jframe object    // gameplay needs to extend JPanel
    }
}
