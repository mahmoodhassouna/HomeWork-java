/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.sql.SQLException;

/**
* @hp
*/
public class ChooseASectionController {
static String allSection;
static Stage stage;
public void setStage(Stage stage){
this.stage=stage;
}

public void setAllSection(String s){
this.allSection = s;
}

@FXML
ComboBox<String> chooseASection;
@FXML
private void setTakeButtonClick(Event event) throws SQLException {
RegistrationController registrationController = new RegistrationController();
registrationController.setChoosingSec(chooseASection.getValue());
stage.close();
registrationController.studentRegistrationSectionUpdate();
}

@FXML
private void initialize(){
chooseASection.getItems().addAll(allSection.split(",",0));
}
}
//SAVE THIS PART FOR GUI

