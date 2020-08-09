package test02;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.event.Event;

public class Controller {
    public Label label1;

    @FXML
    public void buttonClicked(Event e) {
        System.out.println("Button clicked");
    }
}

