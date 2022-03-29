package it.polito.tdp.lab04;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bdnCercaCorsi;

    @FXML
    private Button bdnCercaIscritti;

    @FXML
    private Button bdnIdentity;

    @FXML
    private Button bdnIscrivi;

    @FXML
    private Button bdnReset;

    @FXML
    private ComboBox<String> comboCorsi;

    @FXML
    private TextField txtCognome;

    @FXML
    private TextField txtMatricola;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtOutput;

    @FXML
    void CercaCorsi(ActionEvent event) {

    }

    @FXML
    void CercaIscrittiCorso(ActionEvent event) {

    }

    @FXML
    void DoIscrizione(ActionEvent event) {

    }

    @FXML
    void DoReset(ActionEvent event) {

    }

    @FXML
    void Docompleta(ActionEvent event) {

    }
    public void setModel(Model model) {
		this.model=model;
	}
   
    @FXML
    void initialize() {
        assert bdnCercaCorsi != null : "fx:id=\"bdnCercaCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bdnCercaIscritti != null : "fx:id=\"bdnCercaIscritti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bdnIdentity != null : "fx:id=\"bdnIdentity\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bdnIscrivi != null : "fx:id=\"bdnIscrivi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bdnReset != null : "fx:id=\"bdnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert comboCorsi != null : "fx:id=\"comboCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        
        comboCorsi.getItems().clear();
        for(Corso c : this.model.getTuttiICorsi())
        {
        	String nomec = c.getNome();
        	comboCorsi.getItems().add(nomec);
        	
        	
        }

    }

	

}
