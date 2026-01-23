import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.of(2000,7,2);
        int year = localdate.getYear();
       // int month = localdate.getof();
        int day = localdate.getDayOfMonth();
        System.out.println("私の誕生日は"+year+"年"+day+"日です");
    }

}
