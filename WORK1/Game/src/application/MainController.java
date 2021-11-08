package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Button next;
	
	@FXML
	private Button retrun;
	
	public void ez() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Use.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) next.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void back() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("Drum.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) retrun.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}

    
    
