package com.example.bibli;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileOutputStream;

public class Registration {

    @FXML
    private Button addlogin;

    @FXML
    private Button addnumber;

    @FXML
    private Button addpass;

    @FXML
    private Button addreg;

    @FXML
    private TextField login;

    @FXML
    private TextField number;

    @FXML
    private TextField pass;

    @FXML
    private Text text1;

    @FXML
    public void initialize() {
        addlogin.setOnAction(clik -> {
            try {
                String line=(login.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("D:\\Bibli\\src\\main\\resources\\com\\example\\bibli\\inputlogin");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Данные успешно  сохранены");
            } catch (Exception e) {
                System.out.println("К сожалению данные не удалось сохранить");
            }
        });
        addpass.setOnAction(clik -> {
            try {
                String line=(pass.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("D:\\Bibli\\src\\main\\resources\\com\\example\\bibli\\inputpass");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Даннные успешно сохранены");
            } catch (Exception e) {
                System.out.println("к сожалению данные не удалось сохранить");
            }
        });
        addnumber.setOnAction(clik -> {
            try {
                String line=(number.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("D:\\Bibli\\src\\main\\resources\\com\\example\\bibli\\inputnumber");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Даннные успешно сохранены");
            } catch (Exception e) {
                System.out.println("К сожалению данные не удалось сохранить");
            }
        });
        addreg.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Avtoriz.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Бибиотека ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}