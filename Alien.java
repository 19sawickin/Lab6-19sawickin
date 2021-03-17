package lab6;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

/**
 ____                      _              _ _ _     _
 |  _ \  ___    _ __   ___ | |_    ___  __| (_) |_  | |
 | | | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | |
 | |_| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  |_|
 |____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__| (_)

 This is support code for the lab. You may look at it if you are interested,
 but you will not have to change anything to complete your lab.
 */

public class Alien {

    private Circle _body;
    private Circle _leftEye;
    private Circle _rightEye;

    public Alien() {
        int xPos = this.randomLocGenerator();
        int yPos = this.randomLocGenerator();
        Color color = this.randomColorGenerator();

        _body = new Circle(xPos, yPos, 20, color);
        _leftEye = new Circle(xPos-5, yPos-7, 4, Color.BLACK);
        _rightEye = new Circle(xPos+5, yPos-7, 4, Color.BLACK);
    }

    public void setXPos(int xPos){
        _body.setCenterX(xPos);
        _leftEye.setCenterX(xPos-5);
        _rightEye.setCenterX(xPos+5);

    }

    public void setYPos(int yPos){
        _body.setCenterY(yPos);
        _leftEye.setCenterY(yPos-7);
        _rightEye.setCenterY(yPos-7);
    }

    public void addToPane(Pane pane){
        pane.getChildren().addAll(_body, _leftEye, _rightEye);
    }

    public void removeFromPane(Pane pane){
        pane.getChildren().removeAll(_body, _leftEye, _rightEye);
    }

    public void setColor(Color color){
        _body.setFill(color);
    }

    public Color getColor() {
        return (Color) _body.getFill();
    }
    public int randomLocGenerator(){
        //generates a random integer between 0 and panel width
        return (int) ((Constants.PANEL_H-100)*Math.random());
    }

    public Color randomColorGenerator(){
        return Color.color(Math.random(), Math.random(), Math.random());
    }

    public Node getBody(){
        return _body;
    }

    public Node getLeftEye(){
        return _leftEye;
    }

    public Node getRightEye(){
        return _rightEye;
    }


}
