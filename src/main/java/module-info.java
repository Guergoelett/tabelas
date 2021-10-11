module com.example.tabelas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabelas to javafx.fxml;
    exports com.example.tabelas;
}