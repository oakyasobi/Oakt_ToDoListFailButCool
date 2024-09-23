package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class TheMainFormController implements Initializable {

	@FXML
	private Button AddButton;

	@FXML
	private Button ClearButton;

	@FXML
	private Button InputAddButton;

	@FXML
	private Button InputCancelButton;

	@FXML
	private DatePicker InputDate;

	@FXML
	private TextField InputText;

	@FXML
	private GridPane TheGrid;

	@FXML
	private ScrollPane TheScroll;

	static ObservableList<TheData> theData = FXCollections.observableArrayList();
	TheData thedata;

	@FXML
	void ClickAddButton(ActionEvent event) {

	}

	@FXML
	void ClickClearButton(ActionEvent event) {
		
	}

	@FXML
	void ClickInputAddButton(ActionEvent event) {
		thedata = new TheData(InputText.getText(), InputDate.getValue(),false);
		System.out.println(InputDate.getValue());
		theData.add(thedata);
		System.out.println(theData.size());
		Display();

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		InputText.clear();
		InputDate.setValue(null);

	}

	@FXML
	void ClickInputCancelButton(ActionEvent event) {
		InputText.clear();
		InputDate.setValue(null);
	}

	public void Display() {
		int column = 0;
		int row = 1;

		for (int q = 0; q < theData.size(); q++) {
			try {

				FXMLLoader load = new FXMLLoader();
				load.setLocation(getClass().getResource("TheTask.fxml"));
				AnchorPane pane = load.load();
				TheTaskController taskC = load.getController();
				taskC.setData(theData.get(q));
				System.out.println(theData.get(q));
				TheGrid.add(pane, column, row++);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Display();

	}
}
