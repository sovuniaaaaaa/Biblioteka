package com.example.bibli;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fentezi {

    @FXML
    private Button fore;

    @FXML
    private ImageView imagine1;

    @FXML
    private ImageView imagine2;

    @FXML
    private ImageView imagine3;

    @FXML
    private ImageView imagine4;

    @FXML
    private Button one;

    @FXML
    private Button razd;

    @FXML
    private Text text1;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    public void initialize() {
        razd.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Razdeli.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Библиотека");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        one.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Garry.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Библиотека");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        two.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Vlastelin.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Библиотека");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        three.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Thasodei.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Библиотека ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        fore.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Vsadnik.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Библиотека");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}