public class Main {
    public static void main(String[] args) {

        int ticketPrice = 96540; //цена билета
        int milesForRubles = 20; //стоимость бонусной мили

        int bonusMiles; //кол-во бонусных миль
        bonusMiles = (ticketPrice / milesForRubles);//пересчет бонусных миль
        System.out.println("Бонусных миль: " + bonusMiles);//вывод на экран кол-ва бонусных миль

    }
}