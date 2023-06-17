package lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(within10and20(4, 7));
        isPositiveOrNegative(8);
        System.out.println(isNegative(1));
        printWordNTimes("Привет!", 5);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void isPositiveOrNegative(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }}


    public static boolean isNegative(int x){
        if (x < 0) {
        return true;
    }
        return false;
    }

    public static void printWordNTimes(String word, int times){
        for (int i=0 ; i < times; i++) {
        System.out.println(word);
    }
    }
}
