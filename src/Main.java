import controllerview.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller.show(primaryStage);
    }
}
