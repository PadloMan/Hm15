package Hm15;

public class AdviceProviderImpl  implements AdviceProvider{
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Секрет продуктивності: розпочинайте день з найважливіших завдань!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендації для вихідних: приділи увагу собі і сім'ї.");
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + day);
        }
    }
}
