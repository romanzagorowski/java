import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import javafx.scene.layout.VBox;

public class Test01 extends Application {
    public void start(Stage stage) throws Exception {
        var loader = new FXMLLoader();
        loader.setLocation(new URL("file:///home/roman/java/javafx/jenkov/test01/Test01.fxml"));

        var vbox = loader.<VBox>load();
        var scene = new Scene(vbox);

        stage.setTitle("Test01");
        stage.setScene(scene);
        stage.show();
    }
}

