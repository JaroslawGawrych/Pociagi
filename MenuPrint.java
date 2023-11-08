import java.util.Scanner;

public class MenuPrint {

    public static void printingMenu() {
        Scanner scanning = new Scanner(System.in);

        int x;
        do {
            System.out.print("[頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁]\n" +
                    "[頁]*[1] Create locomotive\t\t\t\t[頁]\n" +
                    "[頁]*[2] Create TrainCars\t\t\t\t[頁]\n" +
                    "[頁]*[3] Create Train Station\t\t\t[頁]\n" +
                    "[頁]*[4] Connections between stations\t[頁]\n" +
                    "[頁]*[5] Actions with train\t\t\t\t[頁]\n" +
                    "[頁]*[6] Add locomotive\t\t\t\t\t[頁]\n" +
                    "[頁]*[7] Add locomotive\t\t\t\t\t[頁]\n" +
                    "[頁]*[8] EXIT\t\t\t\t\t\t\t[頁]\n" +
                    "[頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁]\n");
            System.out.println("Enter numer between 1-8");
            x = scanning.nextInt();
            switch (x) {
                case 1:
                    LocomotiveResources.Locomotivestuff();
                    break;
                case 2:
                    TraincarResources.Traincarstuff();
                    break;
                case 3:

                case 4:
                case 5:
                    break;

                case 6:
                case 7:
                default:
                    System.out.println("Wrong number");
                    break;
                case 8:
                    System.out.println("BYE");
            }
        } while(x != 8);

        scanning.close();
    }
}
