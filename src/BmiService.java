public class BmiService {

    public int calculateBmi(int kg, int cm) {
        int result = (int) (kg * 10_000) / (cm * cm);
        return result;
    }

}
