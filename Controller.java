
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Text;

public class Controller {

    Animation animation;
    public int sp ,s;

    @FXML
    private Canvas canvas;

    GraphicsContext gc;
    
    
    @FXML
    private Label lblAusgabe;
    
    @FXML
    private Slider sldSpeed;

    @FXML
    private Slider sldSize;

    @FXML
    private Text txtSize;

    @FXML
    private Text txtSpeed;

    
     @FXML
    void actSize(MouseEvent event) {
      txtSize.setText(String.valueOf((int)sldSize.getValue())); 
      
      s = (int)sldSize.getValue();
      System.out.println(s);
    }

    @FXML
    void actSpeed(MouseEvent event) {
      txtSpeed.setText(String.valueOf((int)sldSpeed.getValue()));
      sp =(int)sldSpeed.getValue();
    }     

   

    @FXML
    void initialize() {
        gc = canvas.getGraphicsContext2D();
        animation = new Animation(gc,lblAusgabe);

    }

    
    @FXML
    public void neueBubble(Event event)
    {
        animation.neueBubble();
    }
    
     @FXML
    public void bubbleLoeschen(Event event)
    {
        animation.bubbleLoeschen();
    }

     @FXML
    public void bubbleBewegen(Event event)
    {
        animation.bewegen();
    }
    
    
     @FXML
    public void start(Event event)
    {
        animation.start();
        
    }
    
    
     @FXML
    public void stop(Event event)
    {
        animation.stop();
    }
    
    
        
}