import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed= 2;

    Ball(int x,int y,int width,int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(1);
        if(randomXDirection==0){
            randomXDirection--;
            setXDirection(randomXDirection*initialSpeed);
        }
        int randomYDirection = random.nextInt(1);
        if(randomYDirection==0){
            randomYDirection--;
            setYDirection(randomYDirection*initialSpeed);
        }

    }
    public void setXDirection(int randomXDIrection){
        xVelocity=randomXDIrection;
    }
    public void setYDirection(int radnomYDirection){
        yVelocity=radnomYDirection;
    }
    public void move(){
        x=x+xVelocity;
        y=y+yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,height,width);
    }
}
