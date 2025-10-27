module cs.ud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cs112.ud to javafx.fxml;
    exports cs112.ud;
    exports cs112.ud.UD1.Baseball;
    exports cs112.ud.UD2;
}