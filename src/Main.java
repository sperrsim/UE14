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
        Parent root = FXMLLoader.load(getClass().getResource("controllerview/book.fxml"));
        primaryStage.setTitle("Phonebook in JavaFX by Sperr");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}
