public class BmiSrvice {
    public int calculate(float height, int weight) {
        float Bmi = weight / (height * height);
        return (int) Bmi;
    }
}
