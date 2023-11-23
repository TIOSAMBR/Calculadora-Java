module com.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calculadora to javafx.fxml;
    exports com.calculadora;
}
