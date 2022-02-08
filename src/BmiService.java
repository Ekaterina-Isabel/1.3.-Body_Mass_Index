public class BmiService {

    public double calculate (int heightInCm, int weightInKg) {
        double heightInM = heightInCm / 100.0;
        double bmi = weightInKg / (heightInM * heightInM);
        return bmi;
    }
}
