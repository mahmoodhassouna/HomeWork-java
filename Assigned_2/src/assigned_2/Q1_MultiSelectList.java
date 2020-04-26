/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_2;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Q1_MultiSelectList extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();

        ListView<String> listView = new ListView<>();
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("red", "blue", "green", "yellow", "orange", "brown", "pink", "purple", "gray", "black", "white");
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.setPrefSize(120, 200);

        Button button = new Button(" Copy >>> ");
        ListView<String> NewlistView = new ListView<>();
        ObservableList<String> Newlist = FXCollections.observableArrayList();
        NewlistView.setItems(Newlist);
        NewlistView.setPrefSize(120, 200);

        flowPane.getChildren().addAll(listView, button, NewlistView);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                    Newlist.addAll(listView.getSelectionModel().getSelectedItems());
                

            }
        });

        flowPane.setHgap(15);
        flowPane.setPadding(new Insets(25));
        Scene scene = new Scene(flowPane, 400, 250);
        primaryStage.setTitle("Multiple Selection List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}


