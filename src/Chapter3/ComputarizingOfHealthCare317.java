package Chapter3;

public class ComputarizingOfHealthCare317 {
    private String firstname;
    private String lastname;
    private String gender;
    private String dob;
    private String month;
    private int day;
    private int year;
    private double height;
    private double weight;
    private int age;
    private double maximiumHeartRate;
    private double targetRate;

    public ComputarizingOfHealthCare317(String firstname, String lastname, String gender, String dob, double height, double weight){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public String setDob(String month, int day, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        this.dob = getMonth() + "/"+ getDay()+"/"+getYear();
        return this.dob;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = 2023 - age;
    }

    public double getMaximiumHeartRate() {
        return maximiumHeartRate;
    }
    public void setMaximiumHeartRate(int age) {
        this.maximiumHeartRate = 220 - age;
    }

    public double getTargetRate() {
        return targetRate;
    }

    public void setTargetRate(int percentage) {
        this.targetRate = (int) (percentage * maximiumHeartRate) / 100;
    }


}
