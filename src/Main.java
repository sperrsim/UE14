import controllerview.PhonebookC;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        PhonebookC.show(primaryStage);
    }
}
