package Chapter4;

public class GasMileage {
    private int milesDriven;
    private int gallonDriven;
    private int calculator;

    public static int setMilesDriven(int milesDriven) {
        return milesDriven;
    }

    public static int setGallonsTanks(int gallonTanks) {
        return gallonTanks;
    }

    public static double setCalculator(int milesDriven, int gallonDriven) {
        double calculator = (double)milesDriven /gallonDriven;
        return calculator;
    }
}
