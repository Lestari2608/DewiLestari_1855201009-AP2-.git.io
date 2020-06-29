/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author acer
 */
public class WriteDocx {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
//        Properties prop = new Properties();
//        prop.setProperty("log4j.rootLogger", "WARN");
        
        String teks = "AKU"
                + " (Karya : Chairil Anwar)"
                + " Kalau sampai waktuku"
                + " Ku mau tak seorang pun kan merayu"
                + " Tidak juga aku"
                + " Tak perlu sedu sedan itu"
                + " Aku ini binatang jalang"
                + " Dari kumpulanya terbuang"
                + " Biar peluru menembus kulitku"
                   + " Aku tetap meradang menerjang"
                   + " Luka dan bisa kubawa berlari"
                   + " Berlari"
                   + " Hingga hilang pedih perih"
                   + " Dan akan lebih tidak peduli"
                + " Aku mau hidup seribu tahun lagi.";
           

        XWPFDocument documentDocx = new XWPFDocument();

        // write document
        String outDocxEn = "E://writedocx.docx";
        //create paragraph
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            //create paragraph
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("Write docx successfully");
    }
}
