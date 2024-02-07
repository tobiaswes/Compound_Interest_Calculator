package calculator.compoundInterest;

public class Person {

    private String name;
    private double principal;
    private double interest;
    private int years;

    private double amount;

    public Person(String name, double principal, double interest, int years){

        this.name = name;
        this.principal = principal;
        this.interest = interest;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
}
