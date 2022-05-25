import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        boolean isError = false;
        String horoscope = "";
        int day, month;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Doğduğunuz Gün'ü Giriniz: ");
        day = sc.nextInt();

        System.out.print("Doğduğunuz Ay'ı Giriniz: ");
        month = sc.nextInt();

        // RESULT
        if(month == 1){
            if(day >= 1 && day <= 31){
                if(day <= 22){
                    horoscope = "Oğlak";
                }else{
                    horoscope = "Kova";
                }
            }else{
                isError = true;
            }
        }else if(month == 2){
            if(day >= 1 && day <= 28){
                if(day <= 20){
                    horoscope = "Kova";
                }else{
                    horoscope = "Balık";
                }
            }else{
                isError = true;
            }
        }else if(month == 3){
            if(day >= 1 && day <= 28){
                if(day <= 20){
                    horoscope = "Balık";
                }else{
                    horoscope = "Koç";
                }
            }else{
                isError = true;
            }
        }else{
            isError = true;
        }

        if(isError){
            System.err.println("Geçersiz Bir Gün girdiniz...");
        }else{
            System.out.println("---------------------");
            System.out.println("Burcunuz: " + horoscope);
            System.out.println("---------------------");
        }

    }
}
