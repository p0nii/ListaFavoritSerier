import java.util.Scanner;


public class FavoritSerier1 {

    public static void main(String[] args) {
        boolean runProgram = true;


        Scanner scan = new Scanner(System.in);


        while (runProgram) {


            meny();
            int menyVal = scan.nextInt();

            switch (menyVal) {
                case 1:
                    System.out.println("Vilken serie vill du lägga till?");

                    break;
                case 2:
                    System.out.println("Vilken serie vill du ta bort?");

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Programmet avslutas");
                    runProgram = false;
                    break;
                default:
                    System.out.println("Felaktigt menyval, försök igen!");

            }
        }

    }

    public static void meny() {
        System.out.println("1. Lägg till favoritserie");
        System.out.println("2. Ta bort serie");
        System.out.println("3. Visa favoritserier");
        System.out.println("4. Avsluta program");
    }


}