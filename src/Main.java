public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // Вес вводится в килограммах
        int weight = 62;
        // Рост вводится в метрах, после точки указываются сотые доли
        double height = 1.71f;
        double index = service.calculate(weight, height);
        System.out.println(index);


    }
}