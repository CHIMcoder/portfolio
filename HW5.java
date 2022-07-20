//Jamarian Cleveland

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HW5 extends Application {

    public static void main (String[]args){
        launch(args);
    }



        @Override
        public void start (Stage primaryStage) throws Exception {


            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Mav Tunes");
            primaryStage.setScene(new Scene(root, 615, 375));
            primaryStage.show();
        }




    }

