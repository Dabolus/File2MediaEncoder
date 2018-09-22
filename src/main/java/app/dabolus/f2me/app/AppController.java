package app.dabolus.f2me.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class AppController extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader();
    loader.setResources(ResourceBundle.getBundle("locales.bundle"));
    Parent root = loader.load(getClass().getResource("app.fxml").openStream());
    primaryStage.setTitle("File2Media Encoder");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}