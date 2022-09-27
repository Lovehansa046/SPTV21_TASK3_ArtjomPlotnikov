
import java.util.Scanner;

public class ulesanne3 {
    public static void main(String[] args) {
        System.out.println("Введите Имя: ");
        Scanner scanner_name = new Scanner(System.in);
        String Name = scanner_name.nextLine();
        System.out.println("Введите Фамилию: ");
        Scanner scanner_lastname = new Scanner(System.in);
        String Lastname = scanner_lastname.nextLine();
        System.out.println("Введите личный код: ");
        Scanner scanner_isikukood = new Scanner(System.in);
        String Isikukood = scanner_isikukood.nextLine();
        String year = String.valueOf(Isikukood);
        year =year.substring(1, 3);
        String mounth = String.valueOf(Isikukood);
        mounth = mounth.substring(3,5);
        String day = String.valueOf(Isikukood);
        day = day.substring(5,7);

        System.out.println(Name + " " + Lastname + " родился " + "20"+year+" года "+mounth+" месяца "+ day + " дня");
    }
}
