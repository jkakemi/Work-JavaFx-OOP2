package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OtherPanel {

	@FXML
	private CheckBox check1;
	@FXML
	private Label label;
	@FXML
	private Label labelScroll;
	@FXML
	private Button btMyButton;
	@FXML
	private Button btMyButton1;

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
    public void Janela1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	
	@FXML
	public void Janela2(ActionEvent event) throws IOException {
		  Parent root = FXMLLoader.load(getClass().getResource("View2.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
	@FXML
	public void Scroll(ActionEvent event) throws IOException {
		  Parent root = FXMLLoader.load(getClass().getResource("Scroll.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	@FXML
	public void change(ActionEvent event) {
		if(check1.isSelected()) {
			label.setText("SIM!");
		}
		else {
			label.setText("NAO!");
		}
	}
	
	@FXML
	public void amoMenuItemAction(ActionEvent event) {
	    exibirAlert("amo");
	}

	@FXML
	public void odeioMenuItemAction(ActionEvent event) {
	    exibirAlert("odeio");
	}

	@FXML
	public void meioMenuItemAction(ActionEvent event) {
	    exibirAlert("meio");
	}

	private void exibirAlert(String mensagem) {
	    Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setTitle("Opção do Menu JavaFX");
	    alert.setHeaderText(null);
	    alert.setContentText("Eu " + mensagem + " JavaFX!");
	    alert.showAndWait();
	}

}
