package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ScrollController implements Initializable {
    @FXML
    private TextArea area;
    @FXML
    private ScrollBar scrollBar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        scrollBar.setMin(0);
        scrollBar.valueProperty().addListener((observable, oldValue, newValue) -> {
            double scrollValue = newValue.doubleValue();
            double maxScroll = area.getLayoutBounds().getHeight() - area.getLayoutBounds().getHeight();
            double scrollPosition = maxScroll - scrollValue;
            area.setLayoutY(-scrollPosition);
        });
    }
}
