package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class KilometerConverterr extends Application {
	
	public void start(Stage stage)throws Exception{
		
		//Load the FXML file
		Parent parent = FXMLLoader.load(
				getClass().getResource("KilometerConverter.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Display our window, using the scene graph
		stage.setTitle("Kilometer Converter");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the application
		launch(args);
	}

}
