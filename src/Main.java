import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat,fiz,kim,tur,tarh,muzk;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        tur = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarh = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzk = inp.nextInt();

        int toplam =(mat+fiz+kim+tur+tarh+muzk);
        double sonuc = toplam / 6.0;
        System.out.println("ortalamanız " +sonuc);

        String str = sonuc>=50 ? "Geçti" : "Kaldı";

        System.out.println(str);


    }
}
