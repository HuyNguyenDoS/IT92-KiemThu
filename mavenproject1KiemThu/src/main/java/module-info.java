module com.mycompany.mavenproject1kiemthu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject1kiemthu to javafx.fxml;
    exports com.mycompany.mavenproject1kiemthu;
}
