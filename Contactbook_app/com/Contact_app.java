package Contactbook_app.com;

import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contact_app {

    public void start(Stage s) {

        TextField tname = new TextField();
        tname.setPromptText("Enter Name");

        TextField tphone = new TextField();
        tphone.setPromptText("Enter Phone");

        ObservableList<Contact> data = FXCollections.observableArrayList();
        TableView<Contact> tv = new TableView<>(data);

        TableColumn<Contact, String> c1 = new TableColumn<>("Name");
        c1.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Contact, String> c2 = new TableColumn<>("Phone");
        c2.setCellValueFactory(new PropertyValueFactory<>("phone"));

        tv.getColumns().addAll(c1, c2);

        Button add = new Button("Add");
        add.setOnAction(e -> {
            data.add(new Contact(tname.getText(), tphone.getText()));
            tname.clear(); tphone.clear();
        });

        Button delete = new Button("Delete");
        delete.setOnAction(e -> data.remove(tv.getSelectionModel().getSelectedItem()));

        VBox vb = new VBox(10, tname, tphone, add, delete, tv);
        vb.setStyle("-fx-padding:10");
        s.setScene(new Scene(vb, 350, 350));
        s.setTitle("Contact Book");
        s.show();
    }
}