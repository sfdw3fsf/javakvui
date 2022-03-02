package vanhuyhocjava.ExpensesManagement.src;

import java.sql.Date;

public class Expenses {
    private int id = 0;
    private double number;
    private java.util.Date date;
    private String content;

    public Expenses() {
    }

    public Expenses(int id, double number, java.util.Date date, String content) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNumber() {
        return this.number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public java.util.Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "|" +
                " id='" + getId() + "'" +
                ", number='" + getNumber() + "'" +
                ", date='" + getDate() + "'" +
                ", content='" + getContent() + "'" +
                "|";
    }

}
