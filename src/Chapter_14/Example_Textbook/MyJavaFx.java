package Chapter_14.Example_Textbook;

/**
 * Created by lmsj0 on 9/12/2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
    /**the main method is only needed for the IDE with Limited
     * JavaFX support, Not needed for running from the command line.
    */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //creat a scene and place a button in the title
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk, 200,250);
        primaryStage.setTitle("MyJavaFx");// set the stage title
        primaryStage.setScene(scene);// place the scene in the stage
        primaryStage.show();// display the stage

    }


}
