package Contactbook_app.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main_contact extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage s) throws Exception {
        new Contact_app().start(s);
    }
}