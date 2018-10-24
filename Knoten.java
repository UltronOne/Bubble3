import javafx.scene.canvas.GraphicsContext;

public class Knoten
{
    // Attribute
    private Knoten naechster;
    private Bubble inhalt;

    public Knoten(Bubble inhalt_)
    {
        inhalt = inhalt_;
    }

    public void hintenEinfuegen(Bubble p)
    {
        if (naechster == null)
        {
            naechster = new Knoten(p);
        }
        else
        {
            naechster.hintenEinfuegen(p);
        }
    }

    public void setNaechster(Knoten k)
    {
        naechster = k;
    }

    public Knoten getNaechster()
    {
        return naechster;
    }

    public Bubble getInhalt()
    {
        return inhalt;
    }
    public boolean hasNext(){
        if(naechster!=null){
            return true;
            
            
        }else{
           return false; 
            
        }
        
        
       
    }
    
    
    public void setSpeed(int speed){
        
       inhalt.setSpeed(speed);
        if(naechster != null)
        {
            setSpeed(speed);
        }
    }
    public void setSize(int size){
        
        inhalt.setSize(size);
        if(naechster != null)
        {
            naechster.setSize(size);
        }
    }
    public void zeichnen(GraphicsContext gc)
    {
        inhalt.zeichnen(gc);
        if(naechster != null)
        {
            naechster.zeichnen(gc);
        }
    }
    

    public void bewegen()
    {
        inhalt.bewegen();
        if(naechster != null)
        {
            naechster.bewegen();
        }
    }
}