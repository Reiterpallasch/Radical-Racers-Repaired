import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class G1P1 extends JFrame{
    //Window Size
    final int WIDTH = 900, HEIGHT = 650;
    
    //Creating rectancles for track exterior
    Rectangle left = new Rectangle(0,0,WIDTH/9,HEIGHT);
    Rectangle right = new Rectangle(WIDTH-(WIDTH/9),0,WIDTH,HEIGHT);
    Rectangle top = new Rectangle(0,0,WIDTH,HEIGHT/9);
    Rectangle bottom = new Rectangle(0,HEIGHT-(HEIGHT/9),WIDTH,HEIGHT);
    Rectangle center = new Rectangle((int)((WIDTH/9)*2.5),(int)((HEIGHT/9)*2.5),(int)((WIDTH/9)*5),(int)((HEIGHT/9)*4));
    


public G1P1(){
    super("Radical Racing");
    setSize(WIDTH,HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

/*
 * Running Method
 */

public static void main(String[] args){
    new G1P1();
    //Car P1 = new Car();
}

}