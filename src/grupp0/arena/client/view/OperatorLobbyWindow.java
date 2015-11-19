package grupp0.arena.client.view;

import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;


/**
 * This is the client's view of the application
 * 
 * @author Martin Bergqvist (S141564)
 */
public class OperatorLobbyWindow extends AppWindow{

 
 /**
 * Displays the Active User
 */
@FXML
private Label activeUser;   

/**
 * Button for adding an Advertisement
 */
@FXML
private Button addAdButton;

/**
 * Button for adding funds
 */
@FXML
private Button addFundsButton;

/**
 * Button for adding a scheme
 */
@FXML
private Button addAdSchemeButton;

/**
 * Button for exiting the application
 */
@FXML
private Button quitButton;

/**
 * Flowpane for listing all ads
 */
@FXML
private FlowPane listedAds;

    public OperatorLobbyWindow(){

        FXMLLoader fxml= new FXMLLoader(getClass().getResource("/fxml/OperatorLobbyWindow.fxml"));

        fxml.setController(this);

        try {
            setScene(new Scene(fxml.load()));
            setResizable(false);
            setTitle("asyar14h/oomu/Projekt - grupp 0 Operator Lobby");
            getIcons().add(new Image("images/icon.png"));
            setupHandlers();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupHandlers() {
    quitButton.setOnAction(e -> close());
    addAdButton.setOnAction(e -> close());
    addFundsButton.setOnAction(e -> close());
    addAdSchemeButton.setOnAction(e -> close());
    //activeUser.setText("Logged in as " +Client.getInstance().getLoggedInUser().getUserType() +": " +Client.getInstance().getLoggedInUser().getName());        
    }
}
