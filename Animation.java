import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;

public class Animation
{
    private GraphicsContext gc;

    private Liste liste;

    private AnimationTimer timer;
    private Label ausgabe;

    public Animation(GraphicsContext gc_, Label label_)
    {
        gc = gc_;
        ausgabe = label_;
        liste = new Liste();
        infosAusgeben("Hier stehen bald Infos!");
    }

    public void neueBubble()
    {
        Bubble b = new Bubble();
        liste.hintenEinfuegen(b);       
        neuZeichnen();
    }

    public void bubbleLoeschen()
    {
        liste.vorneEntnehmen();
        neuZeichnen();      
    }

    public void neuZeichnen()
    {
        gc.clearRect(0,0,400,400);
        liste.zeichnen(gc);
    }

    public void bewegen()
    {
        liste.bewegen();
        neuZeichnen();
    }

    public void zaehlen()
    {
        // Wie viele Bubbles sind gerade in der Liste?
        // int anzahl = liste.anzahlGeben();
        // infosAusgeben("Es sind gerade " + anzahl + " Bubbles");
    }
    
    public void start()
    {
        if (timer == null)
        {
            timer = new AnimationTimer() {
                @Override
                public void handle(long now) {
                    bewegen();
                }
            };
            timer.start();
        }
    }
    
    

    public void stop()
    {
        timer.stop();
        timer = null;
    }
    
    public void infosAusgeben(String text)
    {
        ausgabe.setText(text);
    }
        
}