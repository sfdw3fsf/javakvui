package vanhuyhocjava.ExpensesManagement.src;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    Scanner sc = new Scanner(System.in);

    public int inputInteger() {

        int a = 0;

        while (true) {

            try {
                a = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return a;
    }

    public double inputDouble() {

        double a = 0;

        while (true) {

            try {

                a = Double.parseDouble(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return a;
    }

    public String inputString() {
        String name;
        while (true) {

            name = sc.nextLine();
            if (!name.trim().equals("")) {
                break;
            } else {
                System.out.println("The value is empty !");
            }
        }
        return name;

    }

    public Date inputDate() throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date;

        while (true) {
            try {
                date = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date, please try again !");
            }
        }
        return date;

    }
}
