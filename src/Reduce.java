public class Reduce {
    public static void main(String[] args) {

        int num_steps = 0;

        for (int i = 100; i > 0;) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                i /= 2;
            } else {
                i -= 1;
            }
            num_steps++;
        }
        System.out.println(num_steps);
    }
}
