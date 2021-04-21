package it.itisarezzo.javafx;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
    private GraphicsContext graphicsContext;
    private int caselleErrate = 0;
    private int caselleCorrette = 0;
    private boolean cliccato = false;

    @FXML
    private Pane pane;

    @FXML
    private Canvas canvas;

    @FXML
    private Label vittoria;
    private Image imageView;

    public void initialize(){
        graphicsContext = canvas.getGraphicsContext2D();

        disegna(new Segmento(0, 0, 0, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(60, 0, 60, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(120, 0, 120, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(180, 0, 180, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(240, 0, 240, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(300, 0, 300, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(360, 0, 360, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(420, 0, 420, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(480, 0, 480, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(540, 0, 540, 600, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(600, 0, 600, 600, 1, Colore.rgb(0,0,0)));

        disegna(new Segmento(0, 0, 600, 0, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 60, 600, 60, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 120, 600, 120, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 180, 600, 180, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 240, 600, 240, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 300, 600, 300, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 360, 600, 360, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 420, 600, 420, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 480, 600, 480, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 540, 600, 540, 1, Colore.rgb(0,0,0)));
        disegna(new Segmento(0, 600, 600, 600, 1, Colore.rgb(0,0,0)));
    }

    public void disegna(Segmento segmento){
        graphicsContext.setStroke(javafx.scene.paint.Color.color(
                segmento.getTratto().getRosso(),
                segmento.getTratto().getVerde(),
                segmento.getTratto().getBlu()));

        graphicsContext.strokeLine(
                segmento.getX0(),
                segmento.getY0(),
                segmento.getX1(),
                segmento.getY1());
    }

    @FXML
    EventHandler<MouseEvent> eventi = new EventHandler<>(){
        @Override
        public void handle(MouseEvent event){
            if(event.getSource()==canvas){
                canvasPremuto(event);
            }
        }
    };

    @FXML
    void canvasPremuto(MouseEvent event) {

        int x =(int) event.getX();
        int y =(int) event.getY();

        //prima colonna
        if(x<60){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 180, 60, 60);
                caselleErrate++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 240, 60, 60);
                caselleErrate++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 300, 60, 60);
                caselleErrate++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 360, 60, 60);
                caselleErrate++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 420, 60, 60);
                caselleErrate++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(0, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(0, 540, 60, 60);
                caselleErrate++;
            }
        }

        //seconda colonna
        else if(x<120){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(60, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(60, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(60, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(60, 480, 60, 60);
                caselleErrate++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(60, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //terza colonna
        else if(x<180){
            if(y<60){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 0, 60, 60);
                caselleCorrette++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 60, 60, 60);
                caselleCorrette++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(120, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(120, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //quarta colonna
        else if(x<240){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(180, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(180, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(180, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(180, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(180, 240, 60, 60);
                caselleErrate++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(180, 300, 60, 60);
                caselleErrate++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(180, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(180, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(180, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(180, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //quinta colonna
        else if(x<300){
            if(y<60){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 0, 60, 60);
                caselleCorrette++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 60, 60, 60);
                caselleCorrette++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(240, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(240, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //sesta colonna
        else if(x<360){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(300, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(300, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(300, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(300, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //settima colonna
        else if(x<420){
            if(y<60){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 0, 60, 60);
                caselleCorrette++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 60, 60, 60);
                caselleCorrette++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(360, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(360, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //ottava colonna
        else if(x<480){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(420, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(420, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(420, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 180, 60, 60);
                caselleCorrette++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 420, 60, 60);
                caselleCorrette++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(420, 480, 60, 60);
                caselleErrate++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(420, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //nona colonna
        else if(x<540){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 180, 60, 60);
                caselleErrate++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(480, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 300, 60, 60);
                caselleErrate++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(480, 360, 60, 60);
                caselleCorrette++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 420, 60, 60);
                caselleErrate++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(480, 480, 60, 60);
                caselleErrate++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(480, 540, 60, 60);
                caselleCorrette++;
            }
        }

        //decima colonna
        else if(x<600){
            if(y<60){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 0, 60, 60);
                caselleErrate++;
            }
            else if(y<120){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 60, 60, 60);
                caselleErrate++;
            }
            else if(y<180){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 120, 60, 60);
                caselleErrate++;
            }
            else if(y<240){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 180, 60, 60);
                caselleErrate++;
            }
            else if(y<300){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(540, 240, 60, 60);
                caselleCorrette++;
            }
            else if(y<360){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(540, 300, 60, 60);
                caselleCorrette++;
            }
            else if(y<420){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 360, 60, 60);
                caselleErrate++;
            }
            else if(y<480){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 420, 60, 60);
                caselleErrate++;
            }
            else if(y<540){
                graphicsContext.setFill(Color.BLACK);
                graphicsContext.fillRect(540, 480, 60, 60);
                caselleCorrette++;
            }
            else if(y<600){
                graphicsContext.setFill(Color.INDIANRED);
                graphicsContext.fillRect(540, 540, 60, 60);
                caselleErrate++;
            }
        }

        if(caselleCorrette==58){
            if(caselleErrate==0){
                vittoria.setText("Hai completato il nonogram!\nHai fatto 0 errori, complimenti :)");
            }
            else if(caselleErrate==1){
                vittoria.setText("Hai completato il nonogram!\nHai fatto 1 errore :(");
            }
            else{
                vittoria.setText("Hai completato il nonogram!\nHai fatto "+caselleErrate+" errori :(");
            }

        }
    }

}
