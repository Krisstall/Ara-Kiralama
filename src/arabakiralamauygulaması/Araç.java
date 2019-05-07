/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabakiralamauygulaması;


import java.io.Console;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Oğuz
 */
public class Araç {
    double birimFiyatı;
    String sigorta="";
    String kazaDurumu="";
    static int toplamAraç;
//toplam araç sayısını tutmak için parametresiz kurucu statik alanı her çağırılmada 1 arttırıyor
//tip kurucularının hepsi aynı işlemi yapıyor üstüne superi çağırarak toplam sayıyı arttırıyor
//marka kurucularının hepsi hem kendisi 1 arttırıyor hem de superi çağırıyor
//gelen super ise bir üst superi yani hemen alttaki kurucuyu çağrıyor 
    //bu şekilde tüm araç sayısı tipe göre araç sayısı ve markaya göre araç sayısı ayrı ayrı tutuluyor
    public Araç() {
        toplamAraç += 1;
    }

    public void ekle(){
        
        //son kaydın dosyaya yazma işlemi için Filewriter oluşturulması
        
        Scanner tarayıcı  = new Scanner(System.in);
        File f = new File("C:\\eduroam\\metin.txt");
        try{
        FileWriter fw = new FileWriter(f);
        
        System.out.println("Aracın sigortası var mı ? ");
        tarayıcı.nextLine();
        sigorta = tarayıcı.nextLine();
        fw.write("aracin sigortasi "+sigorta + " ");
        
        System.out.println("Arac kaza yaptı mı ? ");
        kazaDurumu= tarayıcı.nextLine();
        fw.write("aracin kaza durumu "+kazaDurumu);
        fw.close();
        }
        catch(Exception e){
        e.printStackTrace();
        }
                
        
        
        
    }
}
