package lab6;

import javafx.scene.layout.Pane;

public class AlienArrayCreator2D {

    private Pane _pane;
    private Alien[][] _alienArray2D; //here's the declaration of the array variable!

    public AlienArrayCreator2D(Pane pane) {
        _pane = pane;

        //TODO: Initialize the 2D-array here
    }

    public void generateAliens() {
        this.reset(); //don't worry about this! it's just to make sure you don't double generate

        /*TODO:
            1. Loop to each array in your array of arrays
            2. Loop through each index in each array in your array of arrays
                (hint: it's a double for-loop!)
            3. At each internal loop, create an instance of the Alien class
            3. Store the Alien object in the array at that index pair
            4. Don't forget to add the Alien to the pane! - Use the helper method
         */

    }

    public void lineUpAliens() {
        /*TODO:
            1. Loop through your 2d array (double for-loop again!)
            2. For every Alien, make the x and y positions dependent on the Alien's location in the array
                Remember that in a 2D array there is a pair of indices that correspond to an Alien's location
                If my Alien is at indices (4, 2) (_alienArray2D[4][2]) maybe I want my Alien to exist
                at coordinates (40, 20)
            3. Set the y position based on the row (major index)
            4. Set the x position based on the column (minor index)
         */
    }

    public void rowToCol() {
        /*TODO:
            After the lineup method, your array should be organized in a row-major fashion
               this means the 2d array is organized as a stack of row arrays, which we want
               to change to column arrays.
               ____________          |  |  |
               ____________   --->   |  |  |
               ____________          |  |  |
            1. Loop through your alien array
            2. Set the y position based on the column (major index)
            3. Set the x position based on the row (minor index)
         */
    }

    /**
     These are helper methods that we call in your code. Feel free to read through them but please
     don't change anything!
     **/

    public void reset(){
        _alienArray2D = new Alien[7][5];
        _pane.getChildren().clear();
    }
}
