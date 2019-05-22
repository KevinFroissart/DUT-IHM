package tp06;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MonControleur {
    @FXML
    Label monLabel;

    public void initialize() {
            System.out.println("Initialisation...");
    }

    public void pressedButtonPlus(ActionEvent event) {
            int newValue = Integer.parseInt(monLabel.getText()) + 1;
            monLabel.setText("" + newValue);
    }
    
    public void pressedButtonMinus(ActionEvent event) {
        int newValue = Integer.parseInt(monLabel.getText()) - 1;
        monLabel.setText("" + newValue);
}
}