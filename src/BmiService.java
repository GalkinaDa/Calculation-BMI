public class BmiService {
    public int calculate(int a, int b) {

        int weight = a;
        int height = b;
        int bmi = (int) (a * 10_000) / (b * b);
        return bmi;
    }
}
