import ru.netology.hw_cycles.service.VacationService;


public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();

        int count = service.calculate(100_000, 60_000, 150_000);

        System.out.println(count);

    }
}