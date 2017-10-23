/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Anjas
 */
public class FXMLDocumentController implements Initializable {
    String editpin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXTextField hasil;

    @FXML
    private JFXButton button1;

    @FXML
    private JFXButton button3;

    @FXML
    private JFXButton button5;

    @FXML
    private JFXButton button2;

    @FXML
    private JFXButton button4;

    @FXML
    private JFXButton button6;

    @FXML
    private JFXButton button7;

    @FXML
    private JFXButton buttonC;

    @FXML
    private JFXButton button8;

    @FXML
    private JFXButton button0;

    @FXML
    private JFXButton button9;

    @FXML
    private JFXButton buttonOK;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    void tekan1(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 1);
    }

    @FXML
    void tekan2(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 2);
    }

    @FXML
    void tekan3(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 3);
    }

    @FXML
    void tekan4(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 4);
    }

    @FXML
    void tekan5(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 5);
    }

    @FXML
    void tekan6(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 6);
    }

    @FXML
    void tekan7(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 7);
    }

    @FXML
    void tekan8(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 8);
    }

    @FXML
    void tekan9(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 9);
    }

    @FXML
    void tekanC(ActionEvent event) {
hasil.setText("");
    }

    @FXML
    void tekan0(ActionEvent event) {
String angka = hasil.getText();
hasil.setText(angka + "" + 0);
    }

    @FXML
    void tekanOK(ActionEvent event) {
        if(editpin.equals(PIN)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
          
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Moklet Bank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }else{
            kesempatan -= 1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa"+kesempatan+"Kesempatan Lagi!");
                hasil.setText("");
                PIN="";
                
                
                if(kesempatan==0){
                    System.exit(0);
                }
        }
    }

    
}
