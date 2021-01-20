package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;
    @FXML

    private final ObservableList<String> wordList = FXCollections.observableArrayList();

    @FXML
    void initialize() {

        listView.setItems(wordList);
    }

    @FXML
    void sendMessage() {
        String message = inputField.getText().trim();
        if (!message.isBlank()) {
            addMessageToList(message);
        } else  {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Ошибка ввода сообщения");
            alert.setContentText("Нельзя отправлять пустое сообщение");
            alert.show();
        }
        inputField.clear();
    }

    private void addMessageToList(String message) {
        listView.getItems().add(message);
    }

    @FXML
    void showAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Делал Тарас Бульба");
        alert.setContentText("Всех с новым годом и Рождеством Христовым!");
        alert.show();
    }

    @FXML
    void exit() {
        System.exit(0);
    }

}