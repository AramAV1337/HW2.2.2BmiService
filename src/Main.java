public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double yourBmi = service.calculate(1.78, 150);
        System.out.println("your BMI is: " + yourBmi);
    }
}

