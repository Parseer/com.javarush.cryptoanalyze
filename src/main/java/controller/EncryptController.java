package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import service.BrutForceService;
import service.DecryptService;
import service.EncryptService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EncryptController {
    EncryptService encryptService;
    DecryptService decryptService;
    BrutForceService brutForceService;
    static File file;
    @FXML
    TextField insertKeyField;

    @FXML
    protected void onChooserFileButton() {
        FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(null);

    }

    @FXML
    protected void onDoEncryptButton() throws IOException {
        encryptService = new EncryptService();
        encryptService.doEncrypt(file);
    }


}
