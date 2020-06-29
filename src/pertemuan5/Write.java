/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author acer
 */
public class Write {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");

        String teks = "Aku (Karya: Chairil Anwar) "
                +"Kalau sudah waktuku Kumau tak seorang pun kan merayu Tidak juga Kau "
                +"Tak perlu sedu sedan itu Aku ini binatang jalang dari kumpulanya terbuang "
                +"Biar peluru menembus kulitku Aku tetap meradang menerjang "
                +"Luka dan bisa kubawa berlari Berlari Hingga hilang pedih perih "
                +"Dan aku akan lebih tidak peduli Aku mahu hidup seribu tahun lagi.";
        String outDocEn = "E://writeDoc.doc";
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(outDocEn));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);
        document.write(out);
        out.close();
        System.out.println("Generate DOC sukses");
    }

}
