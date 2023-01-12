module addressbook {
  requires javafx.controls;
  requires javafx.fxml;

  exports addressbook;
  opens addressbook to javafx.fxml;
  exports addressbook.UI;
  opens addressbook.UI to javafx.fxml;
}