public class Main {
    public static void main(String[] args) {

        int x = 100; // начальный счёт
        int y = 1500; // сумма пополения
        int z = y / 100; // бонусы
        boolean i = y > 1000; // условие


        int m = i ? z : 0; // условие

        int bonus = x + y + m; // итоговый счёт

        System.out.println(bonus);
    }
}