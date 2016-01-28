/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author nemus
 */
public class MainController implements Initializable {
    
   @FXML
   public ComboBox<String> combobox;
    
   @FXML
   public Label myLabel;
   
   @FXML
   public ListView listView;
    ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom", "John", "Jack");
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(list);
    }    
    
    @FXML
    public void comboChanged(ActionEvent event){
        //combobox.getItems().addAll("Steve", "Mary", "Joan", "Mike");
         myLabel.setText(combobox.getValue());
    }
}
