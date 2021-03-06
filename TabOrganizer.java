package lab6;

import javafx.scene.control.TabPane;

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
 * This class organizes the different ArrayVisualizer and ArrayListVisualizer tabs
 */
public class TabOrganizer {
    private TabPane _tabPane;

    public TabOrganizer() {
        _tabPane = new TabPane();
        ArrayVisualizer av = new ArrayVisualizer();
        _tabPane.getTabs().add(av.arrayTab());
        _tabPane.getTabs().add(av.array2DTab());
    }

    /*
     * Returns the TabPane
     */
    public TabPane toNode() {
        return _tabPane;
    }
}