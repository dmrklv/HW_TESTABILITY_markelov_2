public class Main {
    public static void main(String[] args) {
        BmiSrvice service = new BmiSrvice();
        float height = 1.84F;
        int weight = 69;
        float Bmi = service.calculate(height, weight);
        System.out.println(Bmi);

    }
}