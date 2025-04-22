public class BmiService {

    public int calculateBmi(int a, int b) {
        int weight = a;
        int height = b;
        int result = (int) (a * 10_000) / (b * b);
        return result;
    }

}
