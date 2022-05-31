public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 67;
        double height = 1.84;
        double index = service.calculate(mass, height);
        System.out.println("Индекс массы тела:");
        System.out.printf("%.1f", index);
    }


}
