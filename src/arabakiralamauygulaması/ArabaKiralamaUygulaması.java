/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabakiralamauygulaması;

import java.io.*;
import java.lang.invoke.VolatileCallSite;
import java.util.Scanner;

/**
 *
 * @author Oğuz 
 */
public class ArabaKiralamaUygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File f = new File("C:\\eduroam\\metin.txt");// dosya dizinini ayarlamanız gerekiyor hocam
                                                    //burda ve araç classında 36. satırda
        int seçim = 1;
        int seçim2 = 1;
//ilk seçim menüsünün ekrana basılması
        System.out.println("======================================");
        System.out.println("       ARAÇ KİRALAMA UYGULAMASI");
        System.out.println("======================================");
//menünün kullanıcı çıkış yapana kadar dönmesini sağlamak için sonsuz döngü
        while (seçim != 7) {
            System.out.println("yapmak istediğiniz işlemi seçiniz: ");
            System.out.println("1: yeni araç ekle ");
            System.out.println("2: tüm araçların sayısını göster ");
            System.out.println("3: tipine göre araçların sayısını göster ");
            System.out.println("4: markasına göre araçların sayısını göster ");
            System.out.println("5: bir aracın kira gelirini göster ");
            System.out.println("6: eklenen son aracın bilgilerini göster ");
            System.out.println("7: çıkış");
//seçim scannerları
            Scanner t = new Scanner(System.in);
            System.out.println("======================================");
            seçim = t.nextInt();
            System.out.println("======================================");
            switch (seçim) {

                case 1:
                    System.out.println("Eklemek istediğiniz araç modelini seçiniz: ");
                    System.out.println("1 Honda \n"
                            + "2 Audi \n"
                            + "3 Ford \n"
                            + "4 Kia \n"
                            + "5 Man \n"
                            + "6 Mercedes \n"
                            + "7 Peugeot \n"
                            + "8 Volkswagen");
                    seçim2 = t.nextInt();
//seçilen modele göre yeni nesne türeten switch case kod parçası                   
                    switch (seçim2) {

                        case 1:
                            Honda araba1 = new Honda();
                            araba1.ekle();
                            break;
                        case 2:
                            Audi araba2 = new Audi();
                            araba2.ekle();
                            break;
                        case 3:
                            Ford araba3 = new Ford();
                            araba3.ekle();
                            break;
                        case 4:
                            Kia araba4 = new Kia();
                            araba4.ekle();
                            break;
                        case 5:
                            Man tır = new Man();
                            tır.ekle();
                            break;
                        case 6:
                            Mercedes araba5 = new Mercedes();
                            araba5.ekle();
                            break;
                        case 7:
                            Peugeot araba6 = new Peugeot();
                            araba6.ekle();
                            break;
                        case 8:
                            Volkswagen araba7 = new Volkswagen();
                            araba7.ekle();
                            break;
                    }
                    break;
//case 2,3,4 menüden istenilen duruma göre tüm araçları veya tipe göre araçları
//veya markaya göre araç sayılarını ekrana basan kod parçası                
                case 2:
                    System.out.println("toplam " + Araç.toplamAraç + " araç var.");
                    break;
                case 3:
                    System.out.println("Spor araç sayısı: " + Spor.toplamAraç + "\n"
                            + "Sedan araç sayısı: " + Sedan.toplamAraç + "\n"
                            + "Hatchback araç sayısı: " + Hatchback.toplamAraç + "\n"
                            + "+Suv araç sayısı: " + Suv.toplamAraç + "\n"
                            + "Van araç sayısı: " + Van.toplamAraç);
                    break;
                case 4:
                    System.out.println("Audi araç sayısı: " + Audi.toplamAraç + "\n"
                            + "Ford araç sayısı: " + Ford.toplamAraç + "\n"
                            + "Honda araç sayısı: " + Honda.toplamAraç + "\n"
                            + "Kia araç sayısı: " + Kia.toplamAraç + "\n"
                            + "Man araç sayısı: " + Man.toplamAraç + "\n"
                            + "Mercedes araç sayısı: " + Mercedes.toplamAraç + "\n"
                            + "Peugeot araç sayısı: " + Peugeot.toplamAraç + "\n"
                            + "Volkswagen araç sayısı: " + Volkswagen.toplamAraç);
                    break;
//markaya göre verilen sürede ne kadar kira getireceğini hesaplayan kod parçası                    
                case 5:
                    double gün = 0;
                    int seçim3 = 0;
                    String marka = "";
                    System.out.println("Hangi aracın kira gelirini hesaplamak istiyorsunuz: ");
                    System.out.println("1 Honda \n"
                            + "2 Audi \n"
                            + "3 Ford \n"
                            + "4 Kia \n"
                            + "5 Man \n"
                            + "6 Mercedes \n"
                            + "7 Peugeot \n"
                            + "8 Volkswagen");
                    seçim3 = t.nextInt();
                    System.out.println("araç ne kadar süre kiraya veriliyor\n (gün cinsinden giriniz)");
                    gün = t.nextDouble();
//Kira classının kurucusuna gerekli marka bilgisini vermek için gereken seçimi Stringe dönüştüren kod parçası                    
                    if (seçim3 == 1) {
                        marka = "Honda";
                    } else if (seçim3 == 2) {
                        marka = "Audi";
                    } else if (seçim3 == 3) {
                        marka = "Ford";
                    } else if (seçim3 == 4) {
                        marka = "Kia";
                    } else if (seçim3 == 5) {
                        marka = "Man";
                    } else if (seçim3 == 6) {
                        marka = "Mercedes";
                    } else if (seçim3 == 7) {
                        marka = "Peugeot";
                    } else {
                        marka = "Volkswagen";
                    }

                    Kira k = new Kira(marka, gün);

                    System.out.println(marka + " marka aracın " + gün + " gün süreli kirası " + k.kira() + " TL dir.");
                    break;
                case 6://eklenen son aracın kaza durumu ve sigorta bilgisini getiren FileReader
                    try {
                        FileReader fr = new FileReader(f);//file ilk satırda açıldı
                        BufferedReader br = new BufferedReader(fr);
                        System.out.println(br.readLine());
                        br.close();
                    } catch (Exception e) {
                        e.printStackTrace();//bunun ne olduğunu ben bilmiyorum hocam :)
                    }
            }

        }

    }

}
