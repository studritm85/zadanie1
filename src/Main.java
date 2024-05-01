public class Main {
    public static void main(String[] args) {
        double ticketPrice = 13676; // стоимость билета
        int milesPerDollar = 20; // колличество рублей для одной бонусной мили
        int totalMiles = (int) (ticketPrice / milesPerDollar); // расчет общего количества миль
        System.out.println("За покупку билета в " + ticketPrice + " рублей начисляется " + totalMiles + " миль");
    }
}


