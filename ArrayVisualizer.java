package lab6;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 ____                      _              _ _ _     _
|  _ \  ___    _ __   ___ | |_    ___  __| (_) |_  | |
| | | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | |
| |_| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  |_|
|____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__| (_)

This is support code for the lab. You may look at it if you are interested,
but you will not have to change anything to complete your lab.
*/

/*
 * This class creates a visualizer for ArrayBuilder to display the different Arrays
 */
public class ArrayVisualizer {

    enum Action {
        GENERATE,
        LINEUP,
        COLOR,
        REMOVEBLUE,
        ADDTHREE,
        REMOVETWO,
        ROWTOCOL
    }

    private Tab _arrayTab;
    private Tab _array2DTab;
    private Pane _arrayContentPane;
    private Pane _array2DContentPane;
    private AlienArrayCreator _alienArrayCreator;
    private AlienArrayCreator2D _alienArrayCreator2D;

    public ArrayVisualizer() {
        _arrayTab = new Tab("Arrays");
        _arrayTab.setContent(this.createArrayContent());
        _array2DTab = new Tab("2D Arrays");
        _array2DTab.setContent(this.create2DArrayContent());
        _alienArrayCreator = new AlienArrayCreator(_arrayContentPane);
        _alienArrayCreator2D = new AlienArrayCreator2D(_array2DContentPane);
    }

    /*
     * This creates the root pane and adds the control Pane and content
     * Pane to it.
     */
    private Node createArrayContent() {
        BorderPane pane = new BorderPane();
        pane.setPrefSize(Constants.PANEL_W, Constants.PANEL_H + Constants.CP_HEIGHT);
        pane.setBottom(this.createArrayControlPane());
        _arrayContentPane = new Pane();
        pane.setCenter(_arrayContentPane);
        return pane;
    }

    /*
     * This creates the root pane and adds the control Pane and content
     * Pane to it.
     */
    private Node create2DArrayContent() {
        BorderPane pane = new BorderPane();
        pane.setPrefSize(Constants.PANEL_W, Constants.PANEL_H + Constants.CP_HEIGHT);
        pane.setBottom(this.create2DArrayControlPane());
        _array2DContentPane = new Pane();
        pane.setCenter(_array2DContentPane);
        return pane;
    }

    /*
     * This creates the control Pane with the buttons to control the
     * displayed squares
     */
    private Pane createArrayControlPane() {
        HBox controlPane = new HBox(5);
        controlPane.setAlignment(Pos.CENTER);
        controlPane.setPadding(new Insets(5, 5, 5, 5));
        Button generateButton = new Button("Generate");
        generateButton.setOnMouseReleased(new ArrayButtonListener(Action.GENERATE));
        Button inLineButton = new Button("In Line");
        inLineButton.setOnMouseReleased(new ArrayButtonListener(Action.LINEUP));
        Button alternatingColorsButton = new Button("Alternating Colors");
        alternatingColorsButton.setOnMouseReleased(new ArrayButtonListener(Action.COLOR));
        Button removeBlueButton = new Button("Remove Blue");
        removeBlueButton.setOnMouseReleased(new ArrayButtonListener(Action.REMOVEBLUE));
        controlPane.getChildren().addAll(generateButton, inLineButton, alternatingColorsButton, removeBlueButton);
        return controlPane;
    }

    /*
     * This creates the control Pane with the buttons to control the
     * displayed squares
     */
    private Pane create2DArrayControlPane() {
        HBox controlPane = new HBox(5);
        controlPane.setAlignment(Pos.CENTER);
        controlPane.setPadding(new Insets(5, 5, 5, 5));
        Button generateButton = new Button("Generate");
        generateButton.setOnMouseReleased(new Array2DButtonListener(Action.GENERATE));
        Button inLineButton = new Button("In Line");
        inLineButton.setOnMouseReleased(new Array2DButtonListener(Action.LINEUP));
        Button alternatingColorsButton = new Button("In Line - Column Major");
        alternatingColorsButton.setOnMouseReleased(new Array2DButtonListener(Action.ROWTOCOL));
        controlPane.getChildren().addAll(generateButton, inLineButton, alternatingColorsButton);
        return controlPane;
    }

    /*
     * This method returns the ArrayVisualizer tab.
     */
    public Tab arrayTab() {
        return _arrayTab;
    }

    public Tab array2DTab() {
        return _array2DTab;
    }

    private class ArrayButtonListener implements EventHandler<MouseEvent> {

        private Action _action;

        public ArrayButtonListener(Action action) {
            _action = action;
        }

        @Override
        public void handle(MouseEvent mouseEvent) {
            switch (_action) {
                case GENERATE:
                    _alienArrayCreator.generateAliens();
                    break;
                case COLOR:
                    _alienArrayCreator.alternateAlienColors();
                    break;
                case LINEUP:
                    _alienArrayCreator.lineUpAliens();
                    break;
                case REMOVEBLUE:
                    _alienArrayCreator.removeBlue();
                    break;

            }
        }
    }

    private class Array2DButtonListener implements EventHandler<MouseEvent> {

        private Action _action;

        public Array2DButtonListener(Action action) {
            _action = action;
        }

        @Override
        public void handle(MouseEvent mouseEvent) {
            switch (_action) {
                case GENERATE:
                    _alienArrayCreator2D.generateAliens();
                    break;
                case LINEUP:
                    _alienArrayCreator2D.lineUpAliens();
                    break;
                case ROWTOCOL:
                    _alienArrayCreator2D.rowToCol();

            }
        }
    }
}