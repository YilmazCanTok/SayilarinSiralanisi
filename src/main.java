import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double enkucuksayi;
        double ortancasayi;
        double enbuyuksayi;
        System.out.println("****************************************************");
        System.out.println("Sayıları Küçükten Büyüğe Sıralayan Program");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen Birinci Sayıyı Giriniz : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        double sayi2 = scanner.nextDouble();
        System.out.print("Lütfen Üçüncü Sayıyı Giriniz : ");
        double sayi3 = scanner.nextDouble();
        System.out.println("----------------------------------------------------");
        if (sayi1 < sayi2 && sayi1 < sayi3) {
            enkucuksayi = sayi1;
            if (sayi2<sayi3) {
                ortancasayi = sayi2;
                enbuyuksayi = sayi3;
            }
            else{
                ortancasayi = sayi3;
                enbuyuksayi = sayi2;
            }
            System.out.println("Sayıların Sıralanışı : ");
            System.out.println(enkucuksayi+" <= "+ortancasayi+" <= "+enbuyuksayi);
        }
        else if (sayi2 < sayi3 && sayi2 < sayi1) {
            enkucuksayi = sayi2;
            if (sayi1<sayi3) {
                ortancasayi = sayi1;
                enbuyuksayi = sayi3;
            }
            else{
                ortancasayi = sayi3;
                enbuyuksayi = sayi1;
            }
            System.out.println("Sayıların Sıralanışı : ");
            System.out.println(enkucuksayi+" <= "+ortancasayi+" <= "+enbuyuksayi);
        }
        else if (sayi3 < sayi1 && sayi3 < sayi2) {
            enkucuksayi = sayi3;
            if (sayi1<sayi2) {
                ortancasayi = sayi1;
                enbuyuksayi = sayi2;
            }
            else{
                ortancasayi = sayi2;
                enbuyuksayi = sayi1;
            }
            System.out.println("Sayıların Sıralanışı : ");
            System.out.println(enkucuksayi+" <= "+ortancasayi+" <= "+enbuyuksayi);
        }
        
        else if(sayi1 == sayi2 && sayi1 == sayi3 && sayi2 == sayi3) {
            System.out.println("Bütün Girilen Sayılar Eşittir = "+sayi1+" = "+sayi2+" = "+sayi3);
        }
        System.out.println("****************************************************");
    }
  
}
