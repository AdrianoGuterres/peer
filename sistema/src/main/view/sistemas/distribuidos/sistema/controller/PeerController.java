package sistemas.distribuidos.sistema.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PeerController implements Initializable {

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	protected TextField texfieldID; 
	
	@FXML
	protected TextField texfieldPorta; 
	
		
	@FXML
	protected void handleButtonConectar(ActionEvent actionEvent) {
		System.out.println("Clicou em Conectar");
	}
	
	@FXML
	protected void handleButtonDownload(ActionEvent actionEvent) {
		System.out.println("Clicou em baixar");
	}

}
