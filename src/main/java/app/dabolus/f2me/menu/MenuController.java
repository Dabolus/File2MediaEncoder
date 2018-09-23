package app.dabolus.f2me.menu;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.stage.FileChooser;

public class MenuController {
  @FXML
  private MenuBar menuBar;

  public void initModel() {
  }

  @FXML
  public void load() {
    FileChooser chooser = new FileChooser();
    File file = chooser.showOpenDialog(menuBar.getScene().getWindow());
  }

  @FXML
  public void save() {

    // similar to load...

  }

  @FXML
  public void exit() {
    menuBar.getScene().getWindow().hide();
  }
}