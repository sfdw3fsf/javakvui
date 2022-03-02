package vanhuyhocjava.ExpensesManagement.src;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpensesManagement {

    ArrayList<String> expen = new ArrayList<String>();
    Expenses e1 = new Expenses();
    int i = e1.getId();

    public void addExpenses(List<Expenses> list) throws ParseException {

        System.out.print("Enter Date: ");
        Validate v1 = new Validate();
        Date date = v1.inputDate();

        System.out.print("Enter Amount: ");
        Validate v2 = new Validate();
        double number = v2.inputDouble();

        System.out.print("Enter Content: ");
        Validate v3 = new Validate();
        String content = v3.inputString();

        Expenses e = new Expenses(i, number, date, content);
        list.add(e);
        i++;
    }

    public void displayExpenses(List<Expenses> list) {
        for (Expenses expenses : list) {
            if (list.isEmpty())
                System.out.println("There are no data here !");
            else
                System.out.println(expenses);
        }
    }

    public void deleteExpenses(List<Expenses> list) {

        Validate v4 = new Validate();
        int id = v4.inputInteger();

        for (int i = 0; i < list.size(); i++) {
            if (i == id) {
                list.remove(i);
            }
        }
    }
}
