package org.grow.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 */
public class MainWriter {
    public static void main(String[] args) throws IOException {
        User user = new User(18, "John");
        File file = new File("test_user_serial.txt");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(user);
    }
}
