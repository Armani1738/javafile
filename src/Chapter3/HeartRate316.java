package Chapter3;

public class HeartRate316 {
    private String firstName;
    private String lastName;
    private String dob;
    private int day;
    private int year;
    private int month;
    private int age;



    public HeartRate316(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;

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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String setDob(int month, int day, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        this.dob = getMonth() + "/"+ getDay()+"/"+getYear();
        return this.dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setAge(int year) {
        setYear(year);
        this.age = 2023 - year;
    }

    public int getAge() {
        return age;
    }

    public double MaximumHeartRate() {
        this.age = 2023 - year;
        double maxRate = 220 - age;
        return  maxRate;
    }



    public double TargetHeartRate(int target) {
        this.age = 2023 - year;
        double maxRate = 220 - age;
        return maxRate * target / 100;
    }

}
