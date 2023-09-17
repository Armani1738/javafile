package practice;

import ChibuzorAssignment.Account;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){
        Account nehemiahAccount = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        int withdrawalamount = scanner.nextInt();
        nehemiahAccount.withdrawal(withdrawalamount);
        System.out.print("Enter withdrawal amount: ");
        int checkbalance = scanner.nextInt();
        int balance = withdrawalamount - checkbalance;

        System.out.printf("%d current balance", balance);


        }


    }



