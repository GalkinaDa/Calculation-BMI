//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        // вес в кг
        int weight = 55;

        // рост в см
        int height = 167;

        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}