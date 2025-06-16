package com.mt.quizzgameit03v2;

import com.mt.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrimaryController {
    public void handleQuestionsManagement (ActionEvent event) throws IOException{
       Scene scene = new Scene(new FXMLLoader(App.class.getResource("Questions.fxml")).load());
       Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(("Quizz App"));
        stage.show();
    }
    public void handlePractise(ActionEvent event){
        MyAlert.getInstance().showMsg("Practise: Coming soon...");
    }

    
}
