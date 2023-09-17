package Chapter4;

public class TaxCalculator420 {
    private  String citizenname;
    private double salary;


    public void setCitizenname(String citizenname){
        this.citizenname = citizenname;
    }
    public String getCitizenname(){
        return citizenname;
    }
    public void setSalary(double salary){
        this.salary += salary;
    }
    public double getSalary() {
        return salary;
    }
    public double taxRate(double salary) {
        if(salary <= 30000){
            return salary * 15 / 100;
        }
        else {
            return salary * 20 / 100;
        }
    }
    public double totalTax(double salary) {
        if(salary <= 30000){
            double total = salary * 15 / 100;
            return total * 12;
        }
        else {
            double total = salary * 20 / 100;
            return total * 12;
        }
    }
}
