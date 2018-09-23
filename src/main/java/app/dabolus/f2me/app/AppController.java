package app.dabolus.f2me.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class AppController extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    Font.loadFont(getClass().getClassLoader().getResource("fonts/Jost-400-Book.otf").toExternalForm(), 14);
    FXMLLoader loader = new FXMLLoader();
    loader.setResources(ResourceBundle.getBundle("locales.bundle"));
    Parent root = loader.load(getClass().getResource("app.fxml").openStream());
    Scene scene = new Scene(root);
    scene.getStylesheets().add("styles.css");
    primaryStage.setTitle("File2Media Encoder");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}