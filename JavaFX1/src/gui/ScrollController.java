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
        double maxScroll = area.getHeight() - area.getLayoutBounds().getHeight() - scrollBar.getHeight();
        scrollBar.setMax(maxScroll);

        scrollBar.valueProperty().addListener((observable, oldValue, newValue) -> {
            double scrollValue = newValue.doubleValue();

            // Verifica se o conteúdo está totalmente visível
            if (area.getLayoutY() < 0) {
                scrollBar.setValue(scrollBar.getValue() + area.getLayoutY());
            } else {
                double scrollPosition = maxScroll - scrollValue;
                area.setLayoutY(-scrollPosition);
            }
        });

        // Verifica se o conteúdo está totalmente visível
        if (area.getLayoutY() < 0) {
            scrollBar.setValue(scrollBar.getValue() + area.getLayoutY());
        }
    }
}


