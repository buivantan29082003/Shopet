/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendsion;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class Ximage {

    public static File r;
    public static int x;

    public void clear() {
        r = null;
    }

    public static void save(String path) {
        try {
            if (!path.equals("")) {
                if (x == JFileChooser.APPROVE_OPTION) {
                    File f = new File(r.getAbsolutePath());
                    FileInputStream s = new FileInputStream(f);
                    byte[] n = s.readAllBytes();
                    FileOutputStream s1 = new FileOutputStream("src/logo/" + r.getName());
                    s1.write(n);
                    s1.close();
                    s.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi save ảnh chuyên đề.");
        }
    }

    public static void main(String[] args) {
    }
}
