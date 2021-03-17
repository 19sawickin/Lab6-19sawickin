package lab6;

import javafx.scene.layout.Pane;


public class AlienArrayCreator {


    private Alien[] _alienArray; //here we're declaring the array variable!
    private Pane _pane;

    public AlienArrayCreator(Pane pane){
        _pane = pane;

        //TODO: Initialize the array here

    }

    public void generateAliens() {
        this.reset(); //don't worry about this! it's just to make sure you don't double generate

        /*TODO:
            1. Loop through the length of your Alien array
            2. At each iteration, create an instance of the Alien class
            3. Store the Alien object in the array
         */

    }

    public void alternateAlienColors() {
        /*TODO:
            1. Loop through your alien array
            2. If the Alien's index is even, change its color to blue
            3. If the Alien's index is odd, change its color to green
         */

    }

    public void lineUpAliens() {
        /*TODO:
            1. Loop through your Alien array
            2. For every Alien, make the y position the center of the screen (250)
            3. For every Alien, make the x position dependent on its index in the array
                See the handout for an example
         */

    }

    public void removeBlue() {
        /*TODO:
            1. Loop through your alien array
            2. If the color of the alien is SKYBLUE, remove that alien from the array
            3. Don't forget to also remove the alien from the pane
         */

    }


    /**
     These are helper methods that we call in your code. Feel free to read through them but please
     don't change anything!
     **/

    public void reset(){
        _alienArray = new Alien[10];
        _pane.getChildren().clear();
    }

}
