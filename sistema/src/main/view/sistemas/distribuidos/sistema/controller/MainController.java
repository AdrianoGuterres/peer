package sistemas.distribuidos.sistema.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sistemas.distribuidos.sistema.main.Main;

public class MainController implements Initializable{

	@FXML
	private AnchorPane anchorPane;
	

	@FXML
	private void handeButtonServerMode(ActionEvent event) throws IOException {
		System.out.println("Clicou para server");	
		Main.changeScreen("server");
	}

	@FXML
	private void handeButtonPeerMode(ActionEvent event) throws IOException {
		System.out.println("Clicou para server");				
		Main.changeScreen("peer");
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}


}
