public class BmiService {
    public double calculate(double height, double weight) {
        double result;
        result = weight / (height * 2);
        return result;
    }
}