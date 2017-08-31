import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextFlow;

import java.time.LocalDate;

public class Controller {

    @FXML protected Button button;
    @FXML protected TextField title;
    @FXML protected DatePicker date;
    @FXML protected TextField timeHour;
    @FXML protected TextField timeMin;
    @FXML protected TextArea note;
    @FXML protected TextField recentAdd;
    protected String getTitle;
    public LocalDate getDate;
    protected String getTimeHour;
    protected String getTimeMin;
    protected String getNote;

    public Controller(){
        title = new TextField();
        date = new DatePicker();
        timeHour = new TextField();
        timeMin = new TextField();
        note = new TextArea();
        recentAdd = new TextField();



    }

    @FXML

    protected void add(ActionEvent e) {
        System.out.println(getEvent());
        recentAdd.setText(getEvent());


    }
    public String getEvent(){
        getTitle = title.getText().toString();
        getDate = date.getValue();
        getTimeHour = timeHour.getText().toString();
        getTimeMin = timeMin.getText().toString();
        getNote = note.getText();
        String event = "Title : " +getTitle + " | Date : "+getDate + " \nTime : "+getTimeHour + ":" + getTimeMin +" | Note : " + getNote + "\n__________________________________________";
        return event;

    }


}
