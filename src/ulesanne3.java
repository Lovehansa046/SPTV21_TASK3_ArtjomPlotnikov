import java.util.Scanner;

public class ulesanne3 {
    public static int year2;
    static enum mounth {ЯНВАРЯ,ФЕВРАЛЯ, МАРТА, АПРЕЛЯ, МАЯ, ИЮНЯ, ИЮЛЯ, АВГУСТА, СЕНТЯБРЯ, ОКТЯБРЯ, НОЯБРЯ, ДЕКАБРЯ}
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
        int year1 = new Integer(year);
        if(year1>0 && year1<24){
            year2 = 20;
        } else {
            year2 = 19;
        }
        String mounth1 = String.valueOf(Isikukood);
        mounth1 = mounth1.substring(3,5);
        int mounth2 = new Integer(mounth1);
        String day = String.valueOf(Isikukood);
        day = day.substring(5,7);

        System.out.println(Name + " " + Lastname + " родился " +year2+year+" года "+ day + " " + mounth.values()[mounth2-1]);
    }
}
