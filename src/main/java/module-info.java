module br.com.dio.projetojavadio {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio.projetojavadio to javafx.fxml;
    exports br.com.dio.projetojavadio;
}