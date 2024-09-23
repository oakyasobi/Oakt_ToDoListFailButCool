package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TheTaskController {

	@FXML
	private Label TheDate;

	@FXML
	private RadioButton TheRadioButton;

	ToggleGroup toggleGroup = new ToggleGroup();

	@FXML
	void ClickTheRadioButton(ActionEvent event) {
		
		
		TheRadioButton.setToggleGroup(toggleGroup);
		if (!TheRadioButton.isSelected()) {
			TheRadioButton.setSelected(true);
		}

	}

	public void setData(TheData thedata) {

		TheDate.setText(thedata.getLocalDate().toString());

		TheRadioButton.setText(thedata.getTheText());

	}

}
