package tdd;

public class Multiplication {
    public Multiplication(int firstNumber, int secondNumber) {
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        int multiply = 0;
        if(firstNumber > 0) {
            for (int count = 1; count <= firstNumber; count++) {
                multiply = multiply + secondNumber;
            }
        }
        else{
            for (int count = 1; count <= secondNumber; count++){
                multiply = multiply + firstNumber;
            }
        if(secondNumber < 0 && firstNumber < 0){
            for (int count = 1; count <= -firstNumber; count++) {
                multiply = multiply + (-secondNumber);
            }
        }
        }
        return multiply;
    }
}

