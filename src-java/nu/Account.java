package nu;

public class Account {
    private String number;
    public String id;
    public static final String DELIMITER = "-";

    public Account() {

    }

    public Account(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
