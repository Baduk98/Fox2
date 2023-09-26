public class Main {
    public static void main(String[] args) {

        int account = 100;
        int pay = 1500;
        int bonus = pay / 100;
        boolean i = pay > 1000;


        int requirement = i ? bonus : 0;

        int total = account + pay + requirement;

        System.out.println(total);
    }
}