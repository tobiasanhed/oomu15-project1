package grupp0.arena.view;

import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LobbyWindow extends Stage{

    public LobbyWindow(){
        //String     className = getClass().getSimpleName();
        //String     viewName  = "/fxml/" +className + ".fxml";

        FXMLLoader fxml      = new FXMLLoader(getClass().getResource("/fxml/LobbyWindow.fxml"));

        fxml.setController(this);

        try {
            setScene(new Scene(fxml.load()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
