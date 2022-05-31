public class BmiService {
    public double calculate(double mass, double height) {
        return mass / Math.pow(height, 2);
    }
}
