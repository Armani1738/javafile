package FemiTasks;

public class Palindrome {
    public static void main(String[] args) {
//        String name = "cool";
//        boolean result = isPalindrome(name);
//        System.out.println(result);
        String name = "mary";
        boolean result = anagram(name);
        System.out.printf(String.valueOf(result));
    }
    public static boolean isPalindrome(String words) {
        String name = "";
        boolean result = false;
        for (int count = words.length() - 1; count >= 0; count--) {
            name = name + words.charAt(count);
        }
        if (words.equals(name)) {
            result = true;
        }
        return result;
    }
    public static boolean anagram(String firstWord){
        boolean result = false;
        String secondWord = "";
        for (int count = 0; count <= firstWord.length() ; count++) {
            secondWord = secondWord + firstWord.charAt(count);
        }
        if (firstWord.equals(secondWord)) {
            return true;
        }
        return false;
        }
    }