package addressbook;

import addressbook.UI.Root;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AddressbookLauncher extends Application {

  @Override
  public void start(Stage stage) {
    Root root = new Root();
    Scene scene = new Scene(root, 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}