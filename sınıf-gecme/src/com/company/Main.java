import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunu : ");
        muzik = input.nextInt();

        if(mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100  ) {
            System.out.println("Geçersiz not girişi! Notlar 0 ile 100 arasında olmalıdır.");
        }else{
            double avarge = (mat + fizik + kimya + muzik) /4;

            if (avarge <= 55){
                System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere.");

            }else{
                System.out.println("Tebrikler Sınıfı geçtiniz.");
            }

            System.out.println("Ortalamanız :" + avarge);


        }




    }
}
