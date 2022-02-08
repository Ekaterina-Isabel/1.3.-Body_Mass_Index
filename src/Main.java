public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int heightInCm = 173;
        int weightInKg = 70;
        double bmi = service.calculate(heightInCm, weightInKg);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
