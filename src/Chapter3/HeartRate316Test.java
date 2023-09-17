package Chapter3;

public class HeartRate316Test {
    public static void main(String[] args) {
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8, 10,1992);
        System.out.printf("Name: %s %s %nDob: %d/%d/%d %nMaximiumHeartRate: %.1f %nTargetHeartRate: %.1f%n ",heartRate.getFirstName(),heartRate.getLastName(),heartRate.getMonth(),heartRate.getDay(),heartRate.getYear(),heartRate.MaximumHeartRate(),heartRate.TargetHeartRate(50));
    }
}
