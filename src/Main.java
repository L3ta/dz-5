public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;

        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);

        boolean isFirstSumGreater = sum1 > sum2;
        System.out.println("Перша сума більша: " + isFirstSumGreater);

        sum1 += 1;
        sum2 -= 2;

        System.out.println("\nСуми після змін:");
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);

        isFirstSumGreater = sum1 > sum2;
        System.out.println("Перша сума після змін більша: " + isFirstSumGreater);

        boolean isAnySumMultipleOf2 = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("Сума кратна 2: " + isAnySumMultipleOf2);
    }
}


