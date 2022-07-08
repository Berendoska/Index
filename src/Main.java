public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int wight = 70;
        double height = 1.59;
        int bmi = service.calculate(wight, height);
        System.out.println(bmi);
    }
}
