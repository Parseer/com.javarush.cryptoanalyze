package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EncryptService {
    //логика шифрования
    public void doEncrypt(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        fileReader.read(chars);

        for (int i = 0; i <chars.length ; i++) {

            System.out.print(chars[i]);
        }

    }


}
