// private jett kampanyası !!!!
// km başına 100$ ücret
// 12 yaşından küçükse %50 indirim
// emekliyse %30 indirim
//öğrenciyse %25 indirim
//hem gidiş hem dönüş rezerv yaparsa %20


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devamEt = true; // biz çıkana kadar döngüyü true kabul ediyoruz

        while (devamEt) {
            System.out.println("Jetimize Hosgeldiniz....");
            System.out.println("Gideceğiniz km bilgisini giriniz :");
            double km = scanner.nextDouble();
            double toplam_Fiyat = km * 100;
            double on_İki_Yas_İndirimi = 0, emekli_İndirimi = 0, ogrenci_İndirimi = 0, gidisDonusIndirimi = 0;

            System.out.println("Yaşınızı giriniz :");
            int yas = scanner.nextInt();


            if (yas < 12) {
                on_İki_Yas_İndirimi = toplam_Fiyat * 0.5; // indirim oranı hesaplandı
                toplam_Fiyat = toplam_Fiyat - on_İki_Yas_İndirimi; // indirimli fiyatı
                System.out.println("12 yaş koltuk ücreti : " + toplam_Fiyat);
                System.out.println("12 yaşa uygulanan indirim : " + on_İki_Yas_İndirimi);
            }

            System.out.println("Öğrenci misiniz : (evet/hayır)");
            String onaylama1 = scanner.nextLine();
            if (onaylama1.equals("evet")) {
                ogrenci_İndirimi = toplam_Fiyat * 0.25;
                toplam_Fiyat = toplam_Fiyat - ogrenci_İndirimi;
                System.out.println("Öğrenci koltuk ücreti :" + toplam_Fiyat);
                System.out.println("Öğrenciye uygulanan indirim :" + ogrenci_İndirimi);
            } else {
                System.out.println("İndirimsiz fiyat :" + toplam_Fiyat);
            }

            System.out.println("Emekli misiniz : (evet/hayır)");
            String onaylama2 = scanner.nextLine();
            if (onaylama2.equals("evet")) {
                emekli_İndirimi = toplam_Fiyat * 0.3;
                toplam_Fiyat = toplam_Fiyat - emekli_İndirimi;
                System.out.println("Emekli koltuk ücreti :" + toplam_Fiyat);
                System.out.println("Emekliye uygulanan indirim :" + emekli_İndirimi);
            }

            System.out.println("Bilet türünü seçiniz : (1=Gidis-Donus 2=Gidis)");
            String biletTuru = scanner.nextLine();
            if (biletTuru.equals("1")) {
                gidisDonusIndirimi = toplam_Fiyat * 0.2;
                toplam_Fiyat = toplam_Fiyat - gidisDonusIndirimi;
                System.out.println("Gidiş-Dönüşlü koltuk ücreti :"+ toplam_Fiyat);
                System.out.println("Gidiş-Dönüşe uygulanan indirim :"+ gidisDonusIndirimi);
            } else {
                System.out.println("İndirimsiz fiyat uygulanıyor");
            }

            System.out.println("Başka bir işlem yapmak istiyor musunuz? (evet/hayır)");
            String devam = scanner.nextLine();
            if (!devam.equalsIgnoreCase("evet")) {  // büyük küçük farketmiyor
                devamEt = false;
            }
        }

        System.out.println("Jetimizi kullandığınız için teşekkür ederiz!");
    }
}
