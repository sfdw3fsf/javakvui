package vanhuyhocjava.ExpensesManagement.src;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        ExpensesManagement a = new ExpensesManagement();
        int choice = 5;
        List<Expenses> list = new ArrayList<>();

        while (choice < 1 || choice > 4)
            while (choice != 4) {
                try {
                    System.out.println("=======Handy Expense program=======");
                    System.out.println("1. Add an expense");
                    System.out.println("2. Display all expense");
                    System.out.println("3. Delete an expense");
                    System.out.println("4. Quit");
                    System.out.println("");
                    System.out.print("Your choice: ");

                    Validate v = new Validate();
                    choice = v.inputInteger();
                    if (choice > 4 || choice < 1) {
                        System.out.println("Invalid input, please try again");
                        System.out.println();
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input, please try again !");
                }

                switch (choice) {
                    case 1:
                        System.out.println("--------Add an expanse--------");
                        a.addExpenses(list);
                        System.out.println("Add successfully !");
                        System.out.println();

                        break;
                    case 2:
                        System.out.println("--------Display all expenses--------");
                        a.displayExpenses(list);
                        System.out.println();

                        break;
                    case 3:
                        System.out.println("--------Delete an expense------");
                        System.out.print("Enter ID: ");
                        a.deleteExpenses(list);
                        System.out.println("Delete successfully !");

                        break;

                    case 4:
                        System.out.println("See you again ^^ !");
                        break;
                    default:
                        break;
                }
            }
    }

}
