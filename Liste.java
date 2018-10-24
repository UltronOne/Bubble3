import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.*;
public class Liste
{
    Knoten erster;

    public Liste()
    {

    }

    public void hintenEinfuegen(Bubble b)
    {
        {
            if (erster == null){
                erster = new Knoten(b);
            }
            else
            {
                erster.hintenEinfuegen(b);
            }
        }
    }

    public void vorneEntnehmen()
    {
        if (erster != null)
        {
            erster = erster.getNaechster();
        }

    }

    public void zeichnen(GraphicsContext gc)
    {
        if(erster != null)
        {
            erster.zeichnen(gc);
        }
    }

    public void bewegen()
    {
        if(erster != null)
        {
            erster.bewegen();
        }
    }

}
