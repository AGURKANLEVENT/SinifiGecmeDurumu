import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, avarageMat, avarageFizik, avarageTurkce, avarageKimya, avarageMuzik, toplam = 5;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        avarageMat = (mat <= 100 && mat >= 0) ? mat : 0;
        if (avarageMat == 0) ;
        toplam--;


        System.out.println("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        avarageFizik = (fizik <= 100 && fizik >= 0) ? fizik : 0;
        if (avarageFizik == 0) ;
        toplam--;

        System.out.println("Turkce notunuzu giriniz : ");
        turkce = inp.nextInt();
        avarageTurkce = (turkce <= 100 && turkce >= 0) ? turkce : 0;
        if (avarageTurkce == 0)
            toplam--;

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        avarageKimya = (kimya <= 100 && kimya >= 0) ? kimya : 0;
        if (avarageKimya == 0)
            toplam--;

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();
        avarageMuzik = (muzik <= 100 && muzik >= 0) ? muzik : 0;
        if (avarageMuzik == 0) ;
        toplam--;

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + avarage);

    }
}