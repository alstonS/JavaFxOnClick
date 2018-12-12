package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {

    public Label helloWorld;
    public int x=0;
    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
    public void addNumber(ActionEvent actionEvent)
    {
        x++;
        helloWorld.setText(""+x);

    }

}
