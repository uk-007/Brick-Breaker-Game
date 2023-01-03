module com.example.brickbreaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brickbreaker to javafx.fxml;
    exports com.example.brickbreaker;
}