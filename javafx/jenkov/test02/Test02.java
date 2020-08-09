package test02;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import javafx.scene.layout.VBox;

public class Test02 extends Application {
    public void start(Stage stage) throws Exception {
        //var controller = new Controller();

        var loader = new FXMLLoader();
        //loader.setController(controller);
        loader.setLocation(new URL("file:///home/roman/java/javafx/jenkov/test02/Test02.fxml"));

        var vbox = loader.<VBox>load();
        var scene = new Scene(vbox);

        stage.setTitle("Test02");
        stage.setScene(scene);
        stage.show();

        Controller controller = loader.getController();

        System.out.println(controller.label1);
    }
}

