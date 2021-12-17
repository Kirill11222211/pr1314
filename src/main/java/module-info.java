module com.example.pr1314 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr1314 to javafx.fxml;
    exports com.example.pr1314;
}