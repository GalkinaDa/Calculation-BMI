//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        // вес в кг
        int kg = 55;

        // рост в см
        int cm = 167;

        int bmi = service.calculateBmi(kg, cm);
        System.out.println(bmi);
    }

}