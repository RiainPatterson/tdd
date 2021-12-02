module com.assignment.tdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.tdd to javafx.fxml;
    exports com.assignment.tdd;
}