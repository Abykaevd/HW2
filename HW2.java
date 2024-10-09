import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно гулять";
        } else {
            return " Оставайтесь дома";
        }
    }

public static int generateRandomAge() {
    Random random = new Random();
    return random.nextInt(100);
    }
    public static void main(String[] args){
        System.out.println("Результат 1: " + permission(generateRandomAge(), 10));
        System.out.println("Результат 2: " + permission(generateRandomAge(), -25));
        System.out.println("Результат 3: " + permission(generateRandomAge(), 30));
        System.out.println("Результат 4: " + permission(generateRandomAge(), -5));
        System.out.println("Результат 5: " + permission(generateRandomAge(), 12));
        }
    }