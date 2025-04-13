package com.ydnakif.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private ImageView logoImageView;

    @FXML
    private Label infoLabel;

    @FXML
    public void initialize() {
        // Load the PNG file
        Image logoImage = new Image(getClass().getResourceAsStream("/com/ydnakif/hellofx/openduke.png"));
        logoImageView.setImage(logoImage);

        // Ensure the label starts empty
        infoLabel.setText("");
    }

    @FXML
    protected void onLogoClick() {
        // Hide the logo and display version information
        logoImageView.setVisible(false);
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        infoLabel.setText("Java Version: " + javaVersion + "\nJavaFX Version: " + javafxVersion);
    }

    @FXML
    protected void onLabelClick() {
        // Show the logo and clear the version information
        logoImageView.setVisible(true);
        infoLabel.setText("");
    }
}