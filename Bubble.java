import javafx.scene.canvas.GraphicsContext;

public class Bubble
{
    private double x;
    private double y;
    private double d;

    public Bubble(){
        x = Math.random()*400;
        y = Math.random()*400;
        d = 30;
        
    }
    
    public void zeichnen(GraphicsContext gc){
        gc.strokeOval(x,y,d,d);
        
    }
    
    public void bewegen()
    {
        x = x + Math.random()*2-1;
        y = y + Math.random()*2-1;
    }

}
