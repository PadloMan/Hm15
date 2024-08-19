package Hm15;

public class Main {
    public static void main(String[] args) {
        AdviceProvider adviceProvider = new AdviceProviderImpl();

        for (Day day : Day.values()) {
            System.out.println("Day: " + day);
            adviceProvider.advise(day);
            System.out.println();
        }
    }
}
