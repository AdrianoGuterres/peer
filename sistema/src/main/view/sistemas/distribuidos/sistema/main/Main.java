package sistemas.distribuidos.sistema.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sistemas.distribuidos.sistema.utils.Exceptions;

public class Main extends Application {

	private static Stage stage;
	private static Scene mainScene;
	private static Scene peerScene;
	private static Scene serverScene;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		stage.initStyle(StageStyle.UTILITY);
		try {
			Parent mainSceneLoad = FXMLLoader.load(getClass().
					getResource("/sistemas/distribuidos/sistema/resources/MainGui.fxml"));
			mainScene = new Scene(mainSceneLoad);		
			Parent peerSceneLoad = FXMLLoader.load(getClass().
					getResource("/sistemas/distribuidos/sistema/resources/PeerGui.fxml"));
			peerScene = new Scene(peerSceneLoad);
			Parent serverSceneLoad = FXMLLoader.load(getClass().
					getResource("/sistemas/distribuidos/sistema/resources/ServerGui.fxml"));		
			serverScene = new Scene(serverSceneLoad);
		} catch (Exception e) {
			Exceptions.getException(e);			
		}
		setScene("Sistema Peer to Peer", mainScene);
	}	

	public static void changeScreen(String screen) {		
		switch (screen) {
		case "peer":			
			setScene("Peer side", peerScene);
			break;

		case "server":			
			setScene("Server side", serverScene);
			break;

		default:
			break;
		}
	}

	public static void setScene(String title, Scene scene) {
		stage.setTitle(title);		
		stage.setResizable(false);
		stage.setScene(scene);		
		stage.show();		
	}
}
