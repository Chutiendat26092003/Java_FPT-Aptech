import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class TestScannerDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Date ");

        String date = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date2=null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date2);

//        String sDate1="31/12/1998";
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        System.out.println(sDate1+"\t"+date1);
    }
}
