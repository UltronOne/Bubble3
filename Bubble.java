import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bubble
{
    private double x;
    private double y;
    private double d;
    private double speed;
    private int green,red;
    public Bubble(){
        x = 200;
        y = 360;
        d = 5;
        speed = 6;
        green =(int)(Math.random()*255);
        red =(int)(Math.random()*100);
    }
    
    public void zeichnen(GraphicsContext gc){
        gc.setFill(Color.rgb(200, green, 0, y/400));
        gc.fillOval(x,y,d,Math.random()*20);
        
    }
    
    public void bewegen()
    {
        x += Math.random()*2-1;
        y -= Math.random()*speed-2;
    }
    public int getY(){
        
      return (int)y;  
    }
    public void setSpeed(int speed){
        
        this.speed = speed;
    }
    public void setSize(int size){
        System.out.println("isdlufghliksghfl");
        d = size;
    }
    

}
