package org.grow.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 */
public class MainReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("test_user_serial.txt");
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User) ois.readObject();
        System.out.println(user);
    }
}
