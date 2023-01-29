public class BmiService {
    public double calculate(int mass, double length) {
        double result = mass / (length * length);
        return result;
    }

}
