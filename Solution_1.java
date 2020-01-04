public class Euler1 {
    public static void main(String[] args) {
        System.out.println(multiplesOf3and5(1000));
    }

    public static int multiplesOf3and5(int number) {
        int sum = 0;
        int i = 3;
        while (i < number) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
            i++;
        }
        return sum;
    }
}
